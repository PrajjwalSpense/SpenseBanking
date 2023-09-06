package com.spenseapp.banking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.spenseapp.banking.databinding.ActivityMainBinding;
import com.spensesdk.spensebank.SpenseSdkBankInitiailizer;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {
    String token;
    String name, email, phone;
    ActivityMainBinding binding;
    boolean isSessionCreated = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        name = getIntent().getStringExtra("name");
        email = getIntent().getStringExtra("email");
        phone = getIntent().getStringExtra("phone");
        SpenseSdkBankInitiailizer sdkBankInitiailizer = new SpenseSdkBankInitiailizer(this,email,"+91"+phone, name, "");
        token = sdkBankInitiailizer.createToken(email,"+91"+phone,name,"");
        sdkBankInitiailizer.getSession(token, response -> {
            Toast.makeText(this, "Session Created", Toast.LENGTH_SHORT).show();
            isSessionCreated = true;
            sdkBankInitiailizer.getPassbookBalance(this, response1 -> {
                System.out.println("passbook balance : "+response1);
                if(response1.has("balance")){
                    binding.balance.setText(getString(R.string.amount,String.valueOf(response1.getDouble("balance"))));
                }
            });
        });
        binding.refresh.setOnClickListener(view -> {
            if(isSessionCreated)
                sdkBankInitiailizer.getLiveStatus(this, response -> {
                    if(response.getBoolean("result")){
                        binding.liveStatus.setTextColor(getResources().getColor(R.color.red_800));
                        binding.liveStatus.setBackground(getResources().getDrawable(R.color.red_100));
                        binding.liveStatus.setText("LIVE");
                        binding.refresh.setVisibility(View.GONE);
                        binding.balanceCard.setVisibility(View.VISIBLE);
                        binding.banking.setVisibility(View.VISIBLE);
                    }
                    else {
                        binding.liveStatus.setTextColor(getResources().getColor(R.color.yellow_800));
                        binding.liveStatus.setBackground(getResources().getDrawable(R.color.yellow_100));
                        binding.liveStatus.setText("PENDING");
                    }
                });
        });
        binding.banking.setOnClickListener(view -> {
            if(isSessionCreated)
                sdkBankInitiailizer.openBankingActivity();
        });
    }
}