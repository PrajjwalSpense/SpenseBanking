package com.spensesdk.spensebank.helper.network;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;

import com.franmontiel.persistentcookiejar.PersistentCookieJar;
import com.franmontiel.persistentcookiejar.cache.SetCookieCache;
import com.franmontiel.persistentcookiejar.persistence.SharedPrefsCookiePersistor;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;

import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.BufferedSink;
import okio.Okio;

public class Network {
    private final Context context;

    private final OkHttpClient client;
    private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    PersistentCookieJar cookieJar;
    public Network(Context context) {
        this.context = context;
        cookieJar =
                new PersistentCookieJar(new SetCookieCache(), new SharedPrefsCookiePersistor(context));
        client = new OkHttpClient.Builder().cookieJar(cookieJar).build();
    }

    public JSONObject call(String url, String method, JSONObject body, HashMap<String, String> headers) {
        HttpUrl.Builder httpBuilder = HttpUrl.parse(url).newBuilder();
        okhttp3.Request.Builder requestBuilder = new okhttp3.Request.Builder();
        if (headers != null) {
            Headers buildHeaders = Headers.of(headers);
            requestBuilder.headers(buildHeaders);
        }
        if (method.equals("GET")) {
            if (body != null) {
                Iterator<String> keys = body.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    try {
                        httpBuilder.addQueryParameter(key, String.valueOf(body.get(key)));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
            requestBuilder.url(httpBuilder.build());
        } else if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("DELETE") || method.equals("LINK") || method.equals("UNLINK")) {
            RequestBody requestBody = RequestBody.create(String.valueOf(body), JSON);
            requestBuilder
                    .url(httpBuilder.build())
                    .method(method, requestBody);
        } else {
            return new JSONObject();
        }
        //Call http requejsonObjectst
        okhttp3.Request request = requestBuilder.build();
        JSONObject jsonResponse = null;
        try {
            Response response = client.newCall(request).execute();
            jsonResponse = new JSONObject(response.body().string());
        } catch (Exception e) {
            e.printStackTrace();
            try {
                JSONObject error = new JSONObject();
                error.put("type", "danger");
                error.put("message", e.getMessage());
                return error;
            } catch (JSONException ex) {
                ex.printStackTrace();
            }
        }
        return jsonResponse;
    }

    public JSONObject call(String url, String method, JSONObject body) {
        return call(url, method, body, null);
    }

    //Requests of content-type:multipart/form-data
    public JSONObject call(String url, String method, HashMap<String,String> body, HashMap<String, String> headers) {
        HttpUrl.Builder httpBuilder = HttpUrl.parse(url).newBuilder();
        okhttp3.Request.Builder requestBuilder = new okhttp3.Request.Builder();
        if (headers != null) {
            Headers buildHeaders = Headers.of(headers);
            requestBuilder.headers(buildHeaders);
        }
        System.out.println(cookieJar.toString());
        if (method.equals("GET")) {
            if (body != null) {
                for (HashMap.Entry<String,String> entry : body.entrySet()) {
                    String key = entry.getKey();
                    httpBuilder.addQueryParameter(key, body.get(key));
                }
            }
            requestBuilder.url(httpBuilder.build());
        } else if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("DELETE") || method.equals("LINK") || method.equals("UNLINK")) {
            MultipartBody.Builder multipartBuilder = new MultipartBody.Builder().setType(MultipartBody.FORM);
            if (body!=null) {
                for (HashMap.Entry<String,String> entry : body.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (value.startsWith("file:///")) {
                        String tempPath = value.replace("file://", "");
                        File file = new File(tempPath);
                        Log.e("file", file.exists()+ " - " +file.length());
                        multipartBuilder.addFormDataPart(key, file.getName(),
                                RequestBody.create(
                                        file,
                                        MediaType.parse("application/octet-stream")
                                ));
                    } else {
                        multipartBuilder.addFormDataPart(key, value);
                    }
                }
            }

            RequestBody requestBody = multipartBuilder.build();

            requestBuilder
                    .url(httpBuilder.build())
                    .method(method, requestBody);
        } else {
            return new JSONObject();
        }
        //Call http requejsonObjectst
        okhttp3.Request request = requestBuilder.build();
        JSONObject jsonResponse = null;
        try {
            Response response = client.newCall(request).execute();
            jsonResponse = new JSONObject(response.body().string());
        } catch (Exception e) {
            e.printStackTrace();
            try {
                JSONObject error = new JSONObject();
                error.put("type", "danger");
                error.put("message", e.getMessage());
                return error;
            } catch (JSONException ex) {
                ex.printStackTrace();
            }
        }
        return jsonResponse;
    }

    public JSONObject call(String url, String method, HashMap<String,String> body) {
        return call(url, method, body, null);
    }

    private File createFile(Context context, String path, String fileNameSave) {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q){
            ContentResolver resolver = context.getContentResolver();
            ContentValues contentValues = new ContentValues();
            contentValues.put(MediaStore.MediaColumns.DISPLAY_NAME, "pdfNameSave");
            contentValues.put(MediaStore.MediaColumns.MIME_TYPE, "application/pdf");
            contentValues.put(MediaStore.MediaColumns.RELATIVE_PATH, Environment.DIRECTORY_DOCUMENTS + File.separator + "Spense");
            Uri pdfUri = resolver.insert(MediaStore.Files.getContentUri(MediaStore.VOLUME_EXTERNAL_PRIMARY), contentValues);

            try {
                File fileDownload = new File(path);
                OutputStream outputStream = resolver.openOutputStream(pdfUri);
                InputStream inputStream = new FileInputStream(fileDownload);
                byte[] buffer = new byte[1024];
                int len = 0;
                while ((len = inputStream.read(buffer)) != -1){
                    outputStream.write(buffer, 0, len);
                }
                outputStream.close();
                inputStream.close();

                return fileDownload;
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{

            File downloadFile = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/" +"Spense");
            boolean makeDir, createFile;
            if(!downloadFile.exists()){
                makeDir = downloadFile.mkdir();
            }else{
                makeDir = true;
            }

            try {
                File fileDownload = new File(path);
                File outputFile = new File(downloadFile, fileNameSave);
                createFile = outputFile.createNewFile();
                if(makeDir && createFile){
                    FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
                    InputStream inputStream = new FileInputStream(fileDownload);
                    byte[] buffer = new byte[1024];
                    int len = 0;
                    while ((len = inputStream.read(buffer)) != -1){
                        fileOutputStream.write(buffer, 0, len);
                    }
                    fileOutputStream.close();
                    inputStream.close();
                }
                return outputFile;
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return null;
    }

    public void download(String url, String method, JSONObject body, File file, HashMap<String, String> headers) {
        HttpUrl.Builder httpBuilder = HttpUrl.parse(url).newBuilder();
        okhttp3.Request.Builder requestBuilder = new okhttp3.Request.Builder();

        if (headers != null) {
            Headers buildHeaders = Headers.of(headers);
            requestBuilder.headers(buildHeaders);
        }
        if (method.equals("GET")) {
            if (body != null) {
                Iterator<String> keys = body.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    try {
                        httpBuilder.addQueryParameter(key, String.valueOf(body.get(key)));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
            requestBuilder.url(httpBuilder.build());
        } else if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("DELETE") || method.equals("LINK") || method.equals("UNLINK")) {
            RequestBody requestBody = RequestBody.create(String.valueOf(body), JSON);
            requestBuilder
                    .url(httpBuilder.build())
                    .method(method, requestBody);
        }
        //Call http requejsonObjectst
        okhttp3.Request request = requestBuilder.build();
        try {
            Response response = client.newCall(request).execute();

            BufferedSink sink = Okio.buffer(Okio.sink(file));
            sink.writeAll(response.body().source());
            sink.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void download(String url, String method, JSONObject body, File file) {
        download(url, method, body, file, null);
    }

    //Requests of content-type:multipart/form-data
    public void download(String url, String method, HashMap<String,String> body, File file, HashMap<String, String> headers) {
        HttpUrl.Builder httpBuilder = HttpUrl.parse(url).newBuilder();
        okhttp3.Request.Builder requestBuilder = new okhttp3.Request.Builder();
        if (headers != null) {
            Headers buildHeaders = Headers.of(headers);
            requestBuilder.headers(buildHeaders);
        }
        if (method.equals("GET")) {
            if (body != null) {
                for (HashMap.Entry<String,String> entry : body.entrySet()) {
                    String key = entry.getKey();
                    httpBuilder.addQueryParameter(key, body.get(key));
                }
            }
            requestBuilder.url(httpBuilder.build());
        } else if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("DELETE") || method.equals("LINK") || method.equals("UNLINK")) {
            MultipartBody.Builder multipartBuilder = new MultipartBody.Builder().setType(MultipartBody.FORM);
            if (body!=null) {
                for (HashMap.Entry<String,String> entry : body.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (value.startsWith("file:///")) {
                        String tempPath = value.replace("file://", "");
                        File fileTemp = new File(tempPath);
                        multipartBuilder.addFormDataPart(key, fileTemp.getName(),
                                RequestBody.create(
                                        fileTemp,
                                        MediaType.parse("application/octet-stream")
                                ));
                    } else {
                        multipartBuilder.addFormDataPart(key, value);
                    }
                }
            }

            RequestBody requestBody = multipartBuilder.build();

            requestBuilder
                    .url(httpBuilder.build())
                    .method(method, requestBody);
        }

        //Call http requejsonObjectst
        okhttp3.Request request = requestBuilder.build();
        try {
            Response response = client.newCall(request).execute();

            BufferedSink sink = Okio.buffer(Okio.sink(file));
            sink.writeAll(response.body().source());
            sink.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void download(String url, String method, HashMap<String,String> body, File file) {
        download(url, method, body, file, null);
    }

    public boolean isNetworkAvailable() {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }
}
