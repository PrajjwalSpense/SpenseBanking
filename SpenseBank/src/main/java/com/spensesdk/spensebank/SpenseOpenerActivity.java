package com.spensesdk.spensebank;

import static com.spensesdk.spensebank.helper.Constants.SLUG;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.spensesdk.spensebank.fragment.BankingWebFragment;
import com.spensesdk.spensebank.fragment.SpenseWebViewFragment;

import java.util.Objects;


public class SpenseOpenerActivity extends AppCompatActivity {

    FrameLayout fragment_to_show;
//    BankingWebFragment bankingWebFragment;

    SpenseWebViewFragment spenseWebViewFragment;

    @Override
    protected void onResume() {
        super.onResume();
        getWindow().getDecorView().setSystemUiVisibility(View.VISIBLE);
        getWindow().setStatusBarColor(ContextCompat.getColor(this,  getIntent().getIntExtra("status_bar_color",  R.color.alpha_card_color)));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spense_opener);
        fragment_to_show = findViewById(R.id.fragment_to_show);

        Bundle bundle = new Bundle();
        bundle.putString(SLUG, getIntent().getStringExtra(SLUG));
        bundle.putInt("color_code", getIntent().getIntExtra("status_bar_color",  R.color.alpha_card_color));

        spenseWebViewFragment = new SpenseWebViewFragment();
        spenseWebViewFragment.setArguments(bundle);

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .add(android.R.id.content, spenseWebViewFragment).commit();
        }
    }


    @Override
    public void onBackPressed() {
        //super.onBackPressed();
//        boolean call = ((BankingWebFragment) bankingWebFragment).onBackPressed(this);
        boolean call = spenseWebViewFragment.onBackPressed(this);

        System.out.println("receiving : "+call);
        if(call){
            finish();
        }
    }
}