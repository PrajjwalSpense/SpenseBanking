package com.spensesdk.spensebank.fragment;


import static com.spensesdk.spensebank.helper.Constants.BLANK;
import static com.spensesdk.spensebank.helper.Constants.SLUG;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.provider.OpenableColumns;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.spensesdk.spensebank.R;
import com.spensesdk.spensebank.helper.network.Network;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Timer;

import okhttp3.Cookie;

public class SpenseWebViewFragment extends Fragment {

    WebView webView;
    private Context context;
    private static final int REQUEST_FINE_LOCATION = 1;
    private String geolocationOrigin;
    private GeolocationPermissions.Callback geolocationCallback;
    private PermissionRequest cameraRequest;
    private static final int REQUEST_CAMERA_PERMISSION = 2;
    private static final int REQUEST_VIDEO_PERMISSION = 1004;
    private static final int REQUEST_CAMERA_PERMISSION_FROM_FILE_CHOOSER = 1003;
    private ValueCallback<Uri[]> mFilePathCallback;
    public static final int FILE_CHOOSER_RESULT_CODE = 1001;
    String url = "";
    String slug = "";
    //    String token = "";
    //    LinearLayout loader_layout;
    boolean OPEN_CAMERA = false;
    Uri cameraImageUri;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;
    private View rootView;


    public SpenseWebViewFragment() {
        // Required empty public constructor
    }

    public static SpenseWebViewFragment newInstance(String param1, String param2) {
        SpenseWebViewFragment fragment = new SpenseWebViewFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onResume() {
        super.onResume();
//        getWindow().getDecorView().setSystemUiVisibility(View.VISIBLE);
//        getWindow().setStatusBarColor(ContextCompat.getColor(context, R.color.alpha_card_color));
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    //    RelativeLayout pop_layout;
//    TextView exit, cancel;
    long back_triggered_time = 0;
    Timer m_timer;

    public boolean onBackPressed(Context context) {
        System.out.println("onBackPressed : " + webView.getUrl());
        if (webView.canGoBack()) {
            if (webView.getUrl().equalsIgnoreCase("https://partner.uat.spense.money/banking/spense/saving") || webView.getUrl().equalsIgnoreCase("https://partner.uat.spense.money/banking/spense/saving/landing")) {
                System.out.println("going back : " + webView.getUrl());
                return true;
            }
            webView.goBack();
            return false;
        } else {
            return true;
        }
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
//        Objects.requireNonNull(getSupportActionBar()).hide();
//        setContentView(R.layout.fragment_banking_web);
//        webView = this.findViewById(R.id.webView);
//        loader_layout = findViewById(R.id.loader_layout);
//        pop_layout = findViewById(R.id.pop_layout);
//        exit = findViewById(R.id.exit);
//        cancel = findViewById(R.id.pop_cancel);

//        cancel.setOnClickListener(v -> pop_layout.setVisibility(GONE));
//        exit.setOnClickListener(v -> {
//            finish();
//        });


//        if (getIntent().hasExtra("token"))
//            token = getIntent().getStringExtra("token");
//        else
//            finish();
//
//        if (getIntent().getBooleanExtra("env", false))
//            url = "https://partner.spense.money/api/user/token/" + token;
//        else
//            url = "https://invest.uat.spense.money/api/user/token/" + token;


//        loader_layout.setVisibility(GONE);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_banking_web, container, false);
        context = rootView.getContext();

        webView = rootView.findViewById(R.id.webView);

        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);

        List<Cookie> cookies = new Network(context).getCookies();

        cookieManager.removeAllCookies(null);

        m_timer = new Timer();
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setGeolocationEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        webView.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        webView.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        webView.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        webView.getSettings().setGeolocationDatabasePath(context.getFilesDir().getPath());
        webView.getSettings().setUserAgentString(webView.getSettings().getUserAgentString() + "_Partner_Android");
        webView.setLayerType(View.LAYER_TYPE_HARDWARE, null);
        setWebViewClient(webView);
        setWebViewChromeClient(webView);


        if (getArguments() != null) {
            slug = getArguments().getString(SLUG, BLANK);
        }
        url = "https://partner.uat.spense.money" + slug;

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                cookieManager.setCookie(cookie.domain(), cookie.toString());
            }
        }

        webView.loadUrl(url);

        return rootView;
    }

    void setWebViewClient(WebView webView) {
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                String url = request.getUrl().toString();
                System.out.println("shouldOverrideUrlLoading : " + url);
                if (url.contains("lendendocs/media/documents")) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.setPackage("com.android.chrome");
                    try {
                        context.startActivity(intent);
                    } catch (ActivityNotFoundException ex) {
                        // Chrome browser presumably not installed so allow user to choose instead
                        intent.setPackage(null);
                        context.startActivity(intent);
                    }
                }
                return false;
            }

            @Override
            public void onLoadResource(WebView view, String url) {
                System.out.println("url onLoadResource: " + url);
                System.out.println("url onLoad: " + view.getUrl());
                if (url.contains("api.whatsapp.com")) {
                    openWhatsapp();
//                    finish();
                }
                if (view.getUrl().contains("user/kyc/selfie")) {
                    m_timer = new Timer();
                } else {
                    webView.dispatchTouchEvent(MotionEvent.obtain(0, 0, MotionEvent.ACTION_CANCEL, 0, 0, 0));
                    m_timer.cancel();
                }

                if (view.getUrl().contains("/invest/lenden/landing")) {
                    requireActivity().getWindow().setStatusBarColor(ContextCompat.getColor(context, R.color.fortune_landing_color));
                } else {
                    requireActivity().getWindow().setStatusBarColor(ContextCompat.getColor(context, R.color.alpha_card_color));
                }
            }

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            }

            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);
                System.out.println("error : " + error.getDescription());
            }

            @Override
            public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
                super.onReceivedHttpError(view, request, errorResponse);
                System.out.println("onReceivedHttpError getUrl : " + request.getUrl());
                System.out.println("onReceivedHttpError getRequestHeaders : " + request.getRequestHeaders());
                System.out.println("onReceivedHttpError isForMainFrame : " + request.isForMainFrame());
                System.out.println("onReceivedHttpError getMethod : " + request.getMethod());
                System.out.println("onReceivedHttpError getEncoding : " + errorResponse.getEncoding());
                System.out.println("onReceivedHttpError getMimeType : " + errorResponse.getMimeType());
                System.out.println("onReceivedHttpError getStatusCode : " + errorResponse.getStatusCode());
            }

            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
                System.out.println("onReceivedError description : " + description);
                requireActivity().finish();

            }
        });
    }

    PermissionRequest permissionRequest;

    void setWebViewChromeClient(WebView webView) {
        webView.setWebChromeClient(new WebChromeClient() {

            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
            }

            @Override
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, FileChooserParams fileChooserParams) {
                if (mFilePathCallback != null) {
                    mFilePathCallback.onReceiveValue(null);
                    mFilePathCallback = null;
                }
                mFilePathCallback = filePathCallback;
                if (!checkCameraPermission()) {
                    return true;
                }
                return callFileChooser();
            }

            @Override
            public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
                System.out.println("onJsAlert url : " + url);
                System.out.println("onJsAlert message : " + message);
                return super.onJsAlert(view, url, message, result);
            }

            @Override
            public void onPermissionRequest(PermissionRequest request) {
                permissionRequest = request;
                System.out.println("request : " + request.getResources()[0]);

                if (request.getResources()[0].contains("VIDEO_CAPTURE")) {
                    String[] prem = new String[]{Manifest.permission.CAMERA, Manifest.permission.RECORD_AUDIO};
                    if ((ContextCompat.checkSelfPermission(context, prem[0]) == PackageManager.PERMISSION_GRANTED) && (ContextCompat.checkSelfPermission(context, prem[1]) == PackageManager.PERMISSION_GRANTED)) {
                        request.grant(request.getResources());
                    } else {

                        ActivityCompat.requestPermissions(requireActivity(), prem, REQUEST_VIDEO_PERMISSION);
                    }
                } else {
                    String perm = Manifest.permission.CAMERA;
                    if (ContextCompat.checkSelfPermission(context, perm) == PackageManager.PERMISSION_GRANTED) {
                        request.grant(request.getResources());
                    } else {
                        if (!ActivityCompat.shouldShowRequestPermissionRationale(requireActivity(), perm)) {
                            // ask the user for permission
                            ActivityCompat.requestPermissions(requireActivity(), new String[]{perm}, REQUEST_CAMERA_PERMISSION);
                            cameraRequest = request;
                        }
                    }
                }
            }

            @Override
            public void onPermissionRequestCanceled(PermissionRequest request) {
                super.onPermissionRequestCanceled(request);
            }

            @Override
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                System.out.println("onConsoleMessage consoleMessage : " + consoleMessage.message());
                if (consoleMessage.message().contains("open_camera")) {
                    OPEN_CAMERA = true;
                }
                if (consoleMessage.message().contains("open_file")) {
                    OPEN_CAMERA = false;
                }
                if (consoleMessage.message().contains("/exit")) {
                    requireActivity().finish();
                }
//                if(consoleMessage.message().equalsIgnoreCase("/close_alert_dialog")){
////                    pop_layout.setVisibility(View.VISIBLE);
//                }
                return super.onConsoleMessage(consoleMessage);
            }

            @Override
            public boolean onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult result) {
                System.out.println("onJsPrompt url : " + url);
                System.out.println("onJsPrompt message : " + message);
                System.out.println("onJsPrompt defaultValue : " + defaultValue);
                return super.onJsPrompt(view, url, message, defaultValue, result);
            }

            @Override
            public void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback) {
                System.out.println("onGeolocationPermissionsShowPrompt  :  " + origin);
                String perm = Manifest.permission.ACCESS_FINE_LOCATION;
                if (ContextCompat.checkSelfPermission(context, perm) == PackageManager.PERMISSION_GRANTED) {
                    // we're on SDK < 23 OR user has already granted permission
                    callback.invoke(origin, true, false);
                } else {
                    if (!ActivityCompat.shouldShowRequestPermissionRationale(requireActivity(), perm)) {
                        // ask the user for permission
                        ActivityCompat.requestPermissions(requireActivity(), new String[]{perm}, REQUEST_FINE_LOCATION);

                        // we will use these when user responds
                        geolocationOrigin = origin;
                        geolocationCallback = callback;
                    }
                }
            }

            @Override
            public void onGeolocationPermissionsHidePrompt() {
                System.out.println("onGeolocationPermissionsHidePrompt");
            }
        });
    }

    private boolean checkCameraPermission() {
        String permission = Manifest.permission.CAMERA;
        if (ContextCompat.checkSelfPermission(requireActivity(), permission) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(requireActivity(), new String[]{permission}, REQUEST_CAMERA_PERMISSION_FROM_FILE_CHOOSER);
            return false;
        }
        return true;
    }

    boolean callFileChooser() {
        System.out.println("file open type : " + OPEN_CAMERA);
        try {
            if (OPEN_CAMERA) {
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if (cameraIntent.resolveActivity(context.getPackageManager()) != null) {
                    // Create the File where the photo should go
                    ContentValues values = new ContentValues();
                    String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
                    String imageFileName = "SPENSE_DOCUMENT" + timeStamp + "_";
                    values.put(MediaStore.Images.Media.TITLE, imageFileName);
                    values.put(MediaStore.Images.Media.DESCRIPTION, "Photo taken on " + System.currentTimeMillis());
                    cameraImageUri = context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);
                    cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, cameraImageUri);
                    startActivityForResult(Intent.createChooser(cameraIntent, "File Chooser"), FILE_CHOOSER_RESULT_CODE);
                }
            } else {

                final String[] ACCEPT_MIME_TYPES = {"application/pdf", "image/*"};
                Intent takeFileIntent = new Intent(Intent.ACTION_GET_CONTENT);
                takeFileIntent.addCategory(Intent.CATEGORY_OPENABLE);
                takeFileIntent.putExtra(Intent.EXTRA_MIME_TYPES, ACCEPT_MIME_TYPES);
                takeFileIntent.setType("image/*,application/pdf");
                startActivityForResult(Intent.createChooser(takeFileIntent, "File Chooser"), FILE_CHOOSER_RESULT_CODE);
            }
            //takeFileIntent.setType("*/*");

            /*Intent chooserIntent = new Intent(Intent.ACTION_CHOOSER);
            chooserIntent.putExtra(Intent.EXTRA_INTENT, takeFileIntent);
            chooserIntent.putExtra(Intent.EXTRA_TITLE, "Image Chooser");
            chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, new Intent[]{cameraIntent, takeFileIntent});

            startActivityForResult(Intent.createChooser(chooserIntent, "File Chooser"), FILECHOOSER_RESULTCODE);*/

        } catch (ActivityNotFoundException e) {
            mFilePathCallback = null;
            Toast.makeText(context, "Cannot Open File Chooser", Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }

    //    private final Runnable task = () -> loader_layout.setVisibility(GONE);
    private void openWhatsapp() {
        boolean isWhatsAppInstalled = whatsappInstalledOrNot();
        Uri uri = Uri.parse("smsto:" + "8073700288");
        Intent sendIntent = new Intent(Intent.ACTION_SENDTO, uri);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Hello");
        if (isWhatsAppInstalled) {
            sendIntent.setPackage("com.whatsapp");
        } else {
            sendIntent.setPackage("com.whatsapp.w4b");
        }
        startActivity(sendIntent);
    }

    private boolean whatsappInstalledOrNot() {
        PackageManager pm = context.getPackageManager();
        boolean app_installed = false;
        try {
            pm.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES);
            app_installed = true;
        } catch (PackageManager.NameNotFoundException ignored) {
        }
        return app_installed;
    }

    private File createImageFile() throws IOException {
        // Create an image file name
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
        String imageFileName = "JPEG_" + timeStamp + "_";
        File storageDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        return File.createTempFile(imageFileName,  // prefix
                ".jpg",         // suffix
                storageDir      // directory
        );
    }

    public Uri getImageUri(Context inContext, Bitmap inImage) {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        inImage.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
        String path = MediaStore.Images.Media.insertImage(inContext.getContentResolver(), inImage, "title_" + System.currentTimeMillis(), null);
        return Uri.parse(path);
    }

    public boolean getImageSize(Uri uri) {
        Cursor cursor = context.getContentResolver().query(uri, null, null, null, null);
        if (cursor != null) {
            int sizeIndex = cursor.getColumnIndex(OpenableColumns.SIZE);
            cursor.moveToFirst();
            float fileSize = cursor.getLong(sizeIndex);
            cursor.close();
            //Toast.makeText(SpenseWebViewActivity.this,"File size : "+fileSize,Toast.LENGTH_SHORT).show();
            return fileSize > 0;
            // returns size in bytes
        }
        return false;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //OPEN_CAMERA = false;
        Uri[] results = new Uri[]{};

        System.out.println("resultCode : " + resultCode);
        System.out.println("requestCode : " + requestCode);

        if (resultCode == Activity.RESULT_OK && requestCode == FILE_CHOOSER_RESULT_CODE) {
            if (data == null) {
                try {
                    Bitmap mImageBitmap = MediaStore.Images.Media.getBitmap(context.getContentResolver(), cameraImageUri);
                    if (mImageBitmap != null) {
                        System.out.println("From camera");
                        results = new Uri[]{getImageUri(context, mImageBitmap)};
                    }
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("From file");
                if (getImageSize(data.getData())) {
                    results = new Uri[]{data.getData()};
                }
            }
        }

        if (results.length > 0) {
            BitmapCompressionTask compressionTask = new BitmapCompressionTask();
            Uri uri = results[0];
            ContentResolver cR = context.getContentResolver();
            String type = cR.getType(uri);
            System.out.println("type : " + type);
            System.out.println("uri image : " + uri.getPath());
            if (type.contains("pdf")) {
                mFilePathCallback.onReceiveValue(results);
                mFilePathCallback = null;
            } else {
                Bitmap bt;
                try {
                    bt = MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri);
                    if (bt != null) {
                        compressionTask.execute(bt);
                    } else {
                        mFilePathCallback.onReceiveValue(results);
                        mFilePathCallback = null;
                        Toast.makeText(context, "Corrupt document uploaded. Please try again.", Toast.LENGTH_SHORT).show();
                    }
                } catch (IOException e) {
                    mFilePathCallback.onReceiveValue(results);
                    mFilePathCallback = null;
                    Toast.makeText(context, "Corrupt document uploaded. Please try again.", Toast.LENGTH_SHORT).show();
                }
            }
        } else {
            if (mFilePathCallback != null) mFilePathCallback.onReceiveValue(null);
            mFilePathCallback = null;
            Toast.makeText(context, "Unable to fetch document from device.", Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        System.out.println("permissions : " + permissions[0]);
        System.out.println("requestCode : " + requestCode);
        switch (requestCode) {
            case REQUEST_FINE_LOCATION:
                boolean allow = grantResults[0] == PackageManager.PERMISSION_GRANTED;
                if (geolocationCallback != null) {
                    geolocationCallback.invoke(geolocationOrigin, allow, false);
                }
                break;
            case REQUEST_CAMERA_PERMISSION:
                boolean allow2 = grantResults[0] == PackageManager.PERMISSION_GRANTED;
                if (cameraRequest != null) {
                    if (allow2) {
                        cameraRequest.grant(cameraRequest.getResources());
                    }
                }
                break;
            case REQUEST_CAMERA_PERMISSION_FROM_FILE_CHOOSER:
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(context, "Camera Permission granted.", Toast.LENGTH_SHORT).show();
                    callFileChooser();
                } else {
                    Toast.makeText(context, "Camera Permission not granted", Toast.LENGTH_SHORT).show();
                }
                break;
            case REQUEST_VIDEO_PERMISSION:
                if ((grantResults[0] == PackageManager.PERMISSION_GRANTED) && (grantResults[1] == PackageManager.PERMISSION_GRANTED)) {
                    permissionRequest.grant(permissionRequest.getResources());
                } else {
                    permissionRequest.deny();
                }
                break;

        }
    }

    public class BitmapCompressionTask extends AsyncTask<Bitmap, Void, Bitmap> {
        @Override
        protected Bitmap doInBackground(Bitmap... bitmaps) {
            Bitmap originalBitmap = bitmaps[0];
            int targetWidth = originalBitmap.getWidth();
            int targetHeight = originalBitmap.getHeight();

            if (targetHeight > 1024 || targetWidth > 1024) {
                float ratio = (float) (targetHeight) / targetWidth;
                if (ratio > 1) {
                    targetHeight = 1024;
                    targetWidth = (int) (targetHeight / ratio);
                } else {
                    targetWidth = 1024;
                    targetHeight = (int) (ratio * targetWidth);
                }
            }
            Bitmap compressedBitmap = Bitmap.createScaledBitmap(originalBitmap, targetWidth, targetHeight, true);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            compressedBitmap.compress(Bitmap.CompressFormat.JPEG, 50, outputStream);
            byte[] compressedData = outputStream.toByteArray();
            return BitmapFactory.decodeByteArray(compressedData, 0, compressedData.length);
        }

        @Override
        protected void onPostExecute(Bitmap result) {
            if (result == null) {
                if (mFilePathCallback != null) mFilePathCallback.onReceiveValue(null);
                mFilePathCallback = null;
                Toast.makeText(context, "Unable to fetch document from device.", Toast.LENGTH_SHORT).show();
            } else {
                Uri imageUri = getImageUri(context, result);
                if (imageUri != null && getImageSize(imageUri)) {
                    Uri[] results = new Uri[]{imageUri};
                    mFilePathCallback.onReceiveValue(results);
                    mFilePathCallback = null;
                } else {
                    if (mFilePathCallback != null) mFilePathCallback.onReceiveValue(null);
                    mFilePathCallback = null;
                    Toast.makeText(context, "Unable to fetch document from device.", Toast.LENGTH_SHORT).show();
                }
            }

        }
    }

}