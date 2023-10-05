package com.spensesdk.spensebank;

import static com.spensesdk.spensebank.helper.Constants.COLOR_CODE;
import static com.spensesdk.spensebank.helper.Constants.SLUG;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.spensesdk.spensebank.fragment.SpenseWebViewFragment;


public class SpenseOpenerActivity extends AppCompatActivity {

    FrameLayout fragment_to_show;
    SpenseWebViewFragment spenseWebViewFragment;

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        handleIntentData(intent, null);
    }

    @Override
    protected void onResume() {
        super.onResume();
        getWindow().getDecorView().setSystemUiVisibility(View.VISIBLE);
        getWindow().setStatusBarColor(ContextCompat.getColor(this, getIntent().getIntExtra("status_bar_color", R.color.alpha_card_color)));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spense_opener);
        fragment_to_show = findViewById(R.id.fragment_to_show);
        handleIntentData(getIntent(), savedInstanceState);
    }

    private void handleIntentData(Intent intent, Bundle savedInstanceState) {
        String slug = intent.getStringExtra(SLUG);
        int colorCode = intent.getIntExtra("status_bar_color", R.color.alpha_card_color);
        if (spenseWebViewFragment == null) {
            Bundle bundle = new Bundle();
            bundle.putString(SLUG, slug);
            bundle.putInt(COLOR_CODE, colorCode);
            spenseWebViewFragment = new SpenseWebViewFragment();
            spenseWebViewFragment.setArguments(bundle);
            if (savedInstanceState == null)
                getSupportFragmentManager().beginTransaction().add(android.R.id.content, spenseWebViewFragment).commit();
        } else {
            spenseWebViewFragment.reload(slug);
        }
    }


    @Override
    public void onBackPressed() {
        boolean call = spenseWebViewFragment.onBackPressed(this);
        System.out.println("receiving : " + call);
        if (call) {
            finish();
        }
    }
}