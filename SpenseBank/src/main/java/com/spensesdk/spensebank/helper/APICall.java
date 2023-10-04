package com.spensesdk.spensebank.helper;


import android.content.Context;
import android.os.Build;

import com.spensesdk.spensebank.helper.network.Network;
import com.spensesdk.spensebank.helper.taskrunner.Task;
import com.spensesdk.spensebank.helper.taskrunner.TaskRunner;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;

import okhttp3.Cookie;


public class APICall {

    public interface Callback {
        void onResult(JSONObject response) throws JSONException;
    }

    //static JSONObject response;

    public static void callAPI(Context context, String method, String apiUrl, JSONObject jsonRequest, Callback callback) {
        final JSONObject[] response = {new JSONObject()};
        TaskRunner t = new TaskRunner();
        t.setTask(new Task() {
            @Override
            public void execute() {
                String manufacturer = Build.MANUFACTURER;
                String model = Build.MODEL;
                int version = Build.VERSION.SDK_INT;
                String versionRelease = Build.VERSION.RELEASE;
                Network apiCalls = new Network(context);
                HashMap<String, String> hashMapHeaders = new HashMap<>();
                hashMapHeaders.put("manufacturer", manufacturer);
                hashMapHeaders.put("model", model);
                hashMapHeaders.put("version", String.valueOf(version));
                hashMapHeaders.put("versionRelease", versionRelease);
                System.out.println("URL :" + apiUrl);
                System.out.println("Method : " + method);
                System.out.println("hashMap : " + jsonRequest);
                System.out.println(getCookies(context));
                response[0] = apiCalls.call(apiUrl, method, jsonRequest, hashMapHeaders);
            }

            @Override
            public void done() {
                //do ui tasks after completion of background task
                try {
                    callback.onResult(response[0]);
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }


    public static void callAPI(Context context, String method, String apiUrl, HashMap<String, String> hashMap, Callback callback) {
        final JSONObject[] response = new JSONObject[1];
        TaskRunner t = new TaskRunner();
        t.setTask(new Task() {
            @Override
            public void execute() {
                String manufacturer = Build.MANUFACTURER;
                String model = Build.MODEL;
                int version = Build.VERSION.SDK_INT;
                String versionRelease = Build.VERSION.RELEASE;
                Network apiCalls = new Network(context);
                HashMap<String, String> hashMapHeaders = new HashMap<>();
                hashMapHeaders.put("manufacturer", manufacturer);
                hashMapHeaders.put("model", model);
                hashMapHeaders.put("version", String.valueOf(version));
                hashMapHeaders.put("versionRelease", versionRelease);
                System.out.println("URL :" + apiUrl);
                System.out.println(" Method : " + method);
                response[0] = apiCalls.call(apiUrl, method, hashMap, hashMapHeaders);
            }

            @Override
            public void done() {
                //do ui tasks after completion of background task
                try {
                    callback.onResult(response[0]);
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    public static void getIFSC(Context context, String method, String ifsccode, HashMap<String, String> hashMap, Callback callback) {
        TaskRunner t = new TaskRunner();
        final JSONObject[] response = new JSONObject[1];
        t.setTask(new Task() {
            @Override
            public void execute() {
                /*String manufacturer = Build.MANUFACTURER;
                String model = Build.MODEL;
                int version = Build.VERSION.SDK_INT;
                String versionRelease = Build.VERSION.RELEASE;*/
                Network apiCalls = new Network(context);
                HashMap<String, String> hashMapHeaders = new HashMap<>();
                /*hashMapHeaders.put("manufacturer", manufacturer);
                hashMapHeaders.put("model",model);
                hashMapHeaders.put("version", String.valueOf(version));
                hashMapHeaders.put("versionRelease",versionRelease);
                System.out.println("URL :"+PlatformConfigurations.HTTP_URL_FOR_NODEJS_SERVER+"/"+ifsccode);
                System.out.println(" Method : "+method);*/
                try {
                    response[0] = apiCalls.call("https://ifsc.razorpay.com/" + ifsccode, method, hashMap, hashMapHeaders);
                } catch (Exception e) {
                    try {
                        callback.onResult(response[0]);
                    } catch (JSONException ex) {
                        throw new RuntimeException(ex);
                    }
                    e.printStackTrace();
                }
            }

            @Override
            public void done() {
                //do ui tasks after completion of background task
                try {
                    callback.onResult(response[0]);
                } catch (JSONException e) {
                    try {
                        response[0].put("result", "error");
                        callback.onResult(response[0]);
                    } catch (JSONException ex) {
                        throw new RuntimeException(ex);
                    }
                    throw new RuntimeException(e);
                }
            }
        });
    }

    public static List<Cookie> getCookies(Context context) {
        return new Network(context).getCookies();
    }
}
