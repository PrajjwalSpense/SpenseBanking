package com.spenseapp.banking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.spenseapp.banking.databinding.ActivityGetInfoBinding;

import java.util.Objects;

public class GetInfoActivity extends AppCompatActivity {

    ActivityGetInfoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_get_info);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.white));

        binding.saveButton.setOnClickListener(view -> {
            if(binding.userName.getText().toString().isEmpty() || binding.emailEditText.getText().toString().isEmpty() || binding.phoneEditText.getText().toString().isEmpty()){
                Toast.makeText(this,"Please enter the value in all fields", Toast.LENGTH_SHORT).show();
            }
            else{
                Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra("name", binding.userName.getText().toString().trim());
                intent.putExtra("email", binding.emailEditText.getText().toString().trim());
                intent.putExtra("phone", binding.phoneEditText.getText().toString().trim());
                startActivity(intent);
            }
        });


    }
}