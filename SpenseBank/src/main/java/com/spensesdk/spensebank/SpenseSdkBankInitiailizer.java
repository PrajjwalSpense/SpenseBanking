package com.spensesdk.spensebank;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.spensesdk.spensebank.fragment.BankingWebFragment;
import com.spensesdk.spensebank.helper.APICall;

import org.json.JSONObject;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class SpenseSdkBankInitiailizer {

    private static final String HTTP_URL_FOR_NODEJS_SERVER = "https://partner.uat.spense.money/api/";
    private static final String USER_TOKEN = HTTP_URL_FOR_NODEJS_SERVER + "user/sdk/token";
    private static final String PASSBOOK_BALANCE = HTTP_URL_FOR_NODEJS_SERVER + "banking/spense/saving/balance";
    private static final String LIVE = HTTP_URL_FOR_NODEJS_SERVER + "banking/live";

    long duration = 3600000L; // 1 hour in milliseconds
    Date expirationTime = new Date(System.currentTimeMillis() + duration);
    Date now = new Date(); // Current time

    Context context;

    String name, email, phone, photo;

    public SpenseSdkBankInitiailizer(Context context) {
        this.context = context;
    }
    public SpenseSdkBankInitiailizer(Context context, String email_id, String phone, String name, String photo) {
        this.context = context;
        this.email = email_id;
        this.name = name;
        this.phone = phone;
        this.photo = photo;
    }
    public String createToken(String email_id, String phone, String name, String photo){
        Map<String, Object> headers = new HashMap<String, Object>();
        headers.put("kid", context.getResources().getString(R.string.api_key));
        headers.put("typ", "JWT");
        headers.put("alg", "HS256");


        String jwt = Jwts.builder()
                .setHeader(headers)
                .setExpiration(expirationTime)
                .setIssuedAt(now)
                .claim("email",email_id)
                .claim("phone", phone)
                .claim("name", name)
                .claim("photo", photo)
                .claim("module", "/banking/spense")
                .signWith(
                        SignatureAlgorithm.HS256,
                        context.getResources().getString(R.string.secret_key).getBytes()
                )
                .compact();
        return jwt;
    }
    public String createToken(){
        Map<String, Object> headers = new HashMap<String, Object>();
        headers.put("kid", context.getResources().getString(R.string.api_key));
        headers.put("typ", "JWT");
        headers.put("alg", "HS256");


        String jwt = Jwts.builder()
                .setHeader(headers)
                .setExpiration(expirationTime)
                .setIssuedAt(now)
                .claim("email",email)
                .claim("phone", phone)
                .claim("name", name)
                .claim("photo", photo)
                .claim("module", "/banking/spense")
                .signWith(
                        SignatureAlgorithm.HS256,
                        context.getResources().getString(R.string.secret_key).getBytes()
                )
                .compact();
        return jwt;
    }
    public void getSession(String email_id, String phone, String name, String photo, APICall.Callback callback) {
        String token = createToken(email_id,phone,name,photo);
        APICall.callAPI(context, "GET", USER_TOKEN + "/" + token, new JSONObject(), response -> {
            System.out.println(USER_TOKEN + " - - - - - "+response);
            if (response != null) {
                try {
                    callback.onResult(response);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public void getSession(String token, APICall.Callback callback) {
        APICall.callAPI(context, "GET", USER_TOKEN + "/" + token, new JSONObject(), response -> {
            System.out.println(USER_TOKEN + " - - - - - "+response);
            if (response != null) {
                try {
                    callback.onResult(response);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public void getPassbookBalance(Context context, APICall.Callback callback){
        APICall.callAPI(context, "GET", PASSBOOK_BALANCE, new JSONObject(), callback::onResult);
    }
    public void getLiveStatus(Context context, APICall.Callback callback){
        APICall.callAPI(context, "GET", LIVE, new JSONObject(), callback::onResult);
    }
    public void openBankingActivity(){
        try {
            String token = createToken();
            System.out.println("openActivity token : "+ token);
                Intent myIntent = new Intent(context,Class.forName("com.spensesdk.spensebank.SpenseOpenerActivity"));
                myIntent.putExtra("token", token);
                context.startActivity(myIntent);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
    }
    public Fragment getBankingFragment(){
        Bundle bundle = new Bundle();
        bundle.putString("token", createToken());

        BankingWebFragment bankingWebFragment = new BankingWebFragment();
        bankingWebFragment.setArguments(bundle);

        return bankingWebFragment;
    }

}
