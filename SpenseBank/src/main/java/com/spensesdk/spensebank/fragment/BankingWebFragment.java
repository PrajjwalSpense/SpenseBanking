package com.spensesdk.spensebank.fragment;


import static com.spensesdk.spensebank.helper.Constants.BLANK;

import android.Manifest;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import com.spensesdk.spensebank.R;
import com.spensesdk.spensebank.SpenseOpenerActivity;
import com.spensesdk.spensebank.databinding.FragmentBankingWebBinding;
import com.spensesdk.spensebank.helper.global.SharedPreferenceManager;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BankingWebFragment#newInstance} factory method to
 * create an instance of context fragment.
 */
public class BankingWebFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    public static WebView webView;
    private static final int REQUEST_FINE_LOCATION = 1;
    private String geolocationOrigin;
    private GeolocationPermissions.Callback geolocationCallback;

    private PermissionRequest cameraRequest;
    private static final int REQUEST_CAMERA_LOCATION = 2;
    private static final int REQUEST_CAMERA_PERMISSION = 9;

    public static final int INPUT_FILE_REQUEST_CODE = 1;
    private ValueCallback<Uri[]> mFilePathCallback;
    private String mCameraPhotoPath;
    private SharedPreferenceManager sharedPreferenceManager;

    //https://invest.uat.spense.money/api/user/mock?phone_country_code=+91&phone=9999993009&email=test3009@spense.money&module=/invest/lenden
    String url = "";
    String token = "";
    boolean firstTimeUse = true;

    private Uri imageUri;
    public BankingWebFragment() {
        // Required empty public constructor
    }
    public static BankingWebFragment newInstance(String param1, String param2) {
        BankingWebFragment fragment = new BankingWebFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public void onResume() {
        super.onResume();
        //getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        //getWindow().setStatusBarColor(ContextCompat.getColor(context, R.color.white));
    }

    boolean doubleBackToExitPressedOnce = false;
    long back_triggered_time = 0;

    private boolean checkCameraPermission() {
        String permission = Manifest.permission.CAMERA;
        if (ContextCompat.checkSelfPermission(context, permission) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(((SpenseOpenerActivity) getActivity()), new String[]{permission}, REQUEST_CAMERA_LOCATION);
            return false;
        } else {
            return true;
        }
    }


    public boolean onBackPressed(Context context) {
        System.out.println("onBackPressed : "+webView.getUrl());
        if(webView.canGoBack()){
            if(webView.getUrl().equalsIgnoreCase("https://partner.uat.spense.money/banking/spense/saving") ||
                    webView.getUrl().equalsIgnoreCase("https://partner.uat.spense.money/banking/spense/saving/landing")){
                System.out.println("going back : "+webView.getUrl());
                return true;
            }
            webView.goBack();
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
//    FragmentBankingWebBinding binding;
    private View rootView;
    private Context context;

    String afterPermissionUrl = "";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for context fragment
//        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_banking_web, container, false);
        rootView = inflater.inflate(R.layout.fragment_banking_web, container, false);
        context = rootView.getContext();

        webView = rootView.findViewById(R.id.webView);

        sharedPreferenceManager = new SharedPreferenceManager(context);

        webView.clearCache(true);
        webView.clearHistory();
        webView.clearFormData();
        webView.clearSslPreferences();
        webView.clearMatches();
        webView.getSettings().setGeolocationEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        webView.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        webView.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        webView.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        webView.setLayerType(View.LAYER_TYPE_HARDWARE, null);
        webView.getSettings().setGeolocationDatabasePath(context.getFilesDir().getPath());

        webView.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                System.out.println("shouldOverrideUrlLoading : "+request.getUrl() );

                return false;
            }


            @Override
            public void onLoadResource(WebView view, String url) {
                System.out.println("url onLoadResource: "+url);
                System.out.println("url onLoad: "+view.getUrl());

                //extractPhoneNumber("https://api.whatsapp.com/send?phone=+917975946937&text=Hello");
                if(url.contains("api.whatsapp.com")){
                    openWhatsapp();
                    //finish();
                }
            }

            @Override
            public void onReceivedSslError (WebView view, SslErrorHandler handler, SslError error) {

            }
            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);
                System.out.println("error : "+error.getDescription());
            }

            @Override
            public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
                super.onReceivedHttpError(view, request, errorResponse);
                System.out.println("errorResponse : "+request.getUrl());
                System.out.println("errorResponse : "+request.getRequestHeaders());
                System.out.println("errorResponse : "+request.isForMainFrame());
                System.out.println("errorResponse : "+request.getMethod());
                System.out.println("errorResponse : "+errorResponse.getEncoding());
                System.out.println("errorResponse : "+errorResponse.getMimeType());
                System.out.println("errorResponse : "+errorResponse.getStatusCode());
            }

            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
                System.out.println("description : "+description);
                //Toast.makeText(SpenseWebViewActivity.context,"Something went wrong. Please try again later",Toast.LENGTH_SHORT).show();
                //finish();

            }
        });
        webView.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                if(view.getUrl().contains("select-type")){
                    webView.loadUrl(url);
                }
                super.onProgressChanged(view, newProgress);
            }

            @Override
            public boolean onShowFileChooser(
                    WebView webView, ValueCallback<Uri[]> filePathCallback,
                    FileChooserParams fileChooserParams) {

                if(!checkCameraPermission()){
                    return false;
                }

                if (mFilePathCallback != null) {
                    mFilePathCallback.onReceiveValue(null);
                }
                mFilePathCallback = filePathCallback;

                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if (takePictureIntent.resolveActivity(context.getPackageManager()) != null) {
                    // Create the File where the photo should go
                    File photoFile = null;
                    try {
                        photoFile = createImageFile();
                        takePictureIntent.putExtra("PhotoPath", mCameraPhotoPath);
                    } catch (IOException ex) {
                        // Error occurred while creating the File
                        Log.e("TAG", "Unable to create Image File", ex);
                    }

                    ContentValues values = new ContentValues();
                    values.put(MediaStore.Images.Media.TITLE, "MyPicture");
                    values.put(MediaStore.Images.Media.DESCRIPTION, "Photo taken on " + System.currentTimeMillis());
                    imageUri = context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);
                    takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri);
                    /*// Continue only if the File was successfully created
                    if (photoFile != null) {
                        mCameraPhotoPath = "file:" + photoFile.getAbsolutePath();

                    } else {
                        takePictureIntent = null;
                    }*/
                }

                Intent contentSelectionIntent = new Intent(Intent.ACTION_GET_CONTENT);
                contentSelectionIntent.addCategory(Intent.CATEGORY_OPENABLE);
                contentSelectionIntent.setType("image/*");

                Intent[] intentArray;
                if (takePictureIntent != null) {
                    intentArray = new Intent[]{takePictureIntent};
                } else {
                    intentArray = new Intent[0];
                }

                Intent chooserIntent = new Intent(Intent.ACTION_CHOOSER);
                chooserIntent.putExtra(Intent.EXTRA_INTENT, contentSelectionIntent);
                chooserIntent.putExtra(Intent.EXTRA_TITLE, "Image Chooser");
                chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, intentArray);

                startActivityForResult(chooserIntent, INPUT_FILE_REQUEST_CODE);

                return true;
            }

            @Override
            public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
                System.out.println("onJsAlert url : " + url);
                System.out.println("onJsAlert message : " + message);
                return super.onJsAlert(view, url, message, result);
            }
            @Override
            public void onPermissionRequest(PermissionRequest request) {
                System.out.println("request : "+request.getResources()[0]);

                String perm = Manifest.permission.CAMERA;
                if (ContextCompat.checkSelfPermission(context, perm) == PackageManager.PERMISSION_GRANTED) {
                    request.grant(request.getResources());
                } else {
                    if (!ActivityCompat.shouldShowRequestPermissionRationale(((SpenseOpenerActivity) getActivity()), perm)) {
                        // ask the user for permission
                        ActivityCompat.requestPermissions(((SpenseOpenerActivity) getActivity()), new String[] {perm}, REQUEST_CAMERA_LOCATION);
                        cameraRequest = request;
                    }
                }
            }

            @Override
            public void onPermissionRequestCanceled(PermissionRequest request) {
                super.onPermissionRequestCanceled(request);
            }
            @Override
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                System.out.println("log : "+consoleMessage.message());
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
                System.out.println("onGeolocationPermissionsShowPrompt  :  "+origin);
                String perm = Manifest.permission.ACCESS_FINE_LOCATION;
                if (ContextCompat.checkSelfPermission(context, perm) == PackageManager.PERMISSION_GRANTED) {
                    // we're on SDK < 23 OR user has already granted permission
                    callback.invoke(origin, true, false);
                } else {
                    if (!ActivityCompat.shouldShowRequestPermissionRationale(((SpenseOpenerActivity) getActivity()), perm)) {
                        // ask the user for permission
                        ActivityCompat.requestPermissions(((SpenseOpenerActivity) getActivity()), new String[] {perm}, REQUEST_FINE_LOCATION);
                        afterPermissionUrl = webView.getUrl();
                        System.out.println("afterPermissionUrl : "+afterPermissionUrl);
                        webView.loadUrl(afterPermissionUrl);

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

        if (!hasAllPermissions()) {
            requestRequiredPermissions();
        }

        token = getArguments().getString("token",BLANK);
        url = "https://partner.uat.spense.money/api/user/token/"+token;
        webView.loadUrl(url);




        //LocalBroadcastManager.getInstance(this).registerReceiver(mMessageReceiver, new IntentFilter(REFRESH_MY_GOAL_ACTIVITY));

        return rootView;
    }



    private void openWhatsapp(){
        boolean isWhatsAppInstalled = whatsappInstalledOrNot("com.whatsapp");
        if(isWhatsAppInstalled){
            Uri uri = Uri.parse("smsto:"+"8073700288");
            Intent sendIntent = new Intent(Intent.ACTION_SENDTO, uri);
            sendIntent.putExtra(Intent.EXTRA_TEXT,"Hello");
            sendIntent.setPackage("com.whatsapp");
            startActivity(sendIntent);
        }
        else{
            Uri uri = Uri.parse("smsto:"+"8073700288");
            Intent sendIntent = new Intent(Intent.ACTION_SENDTO, uri);
            sendIntent.putExtra(Intent.EXTRA_TEXT,"Hello");
            sendIntent.setPackage("com.whatsapp.w4b");
            startActivity(sendIntent);
        }
    }


    private boolean whatsappInstalledOrNot(String s){
        PackageManager pm = context.getPackageManager();
        boolean app_installed = false;
        try {
            pm.getPackageInfo(s, PackageManager.GET_ACTIVITIES);
            app_installed = true;
        }
        catch (PackageManager.NameNotFoundException e){
            app_installed = false;
        }
        return  app_installed;
    }



    private File createImageFile() throws IOException {
        // Create an image file name
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
        String imageFileName = "JPEG_" + timeStamp + "_";
        File storageDir = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES);
        return File.createTempFile(
                imageFileName,  /* prefix */
                ".jpg",         /* suffix */
                storageDir      /* directory */
        );
    }

    public Uri getImageUri(Context inContext, Bitmap inImage) {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        inImage.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
        String path = MediaStore.Images.Media.insertImage(inContext.getContentResolver(), inImage, "Title", null);
        return Uri.parse(path);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != INPUT_FILE_REQUEST_CODE || mFilePathCallback == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }


        Uri[] results = null;
        System.out.println("1");
        // Check that the response is a good one
        if (resultCode == Activity.RESULT_OK) {

            Bitmap bitmap = null;
            try {
                System.out.println("1");
                bitmap = MediaStore.Images.Media.getBitmap(context.getContentResolver(), imageUri);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if(bitmap != null){
                System.out.println("1.1");
                results = new Uri[]{getImageUri(((SpenseOpenerActivity) getActivity()), bitmap)};
            }
            else {
                System.out.println("2");
                if (data == null) {
                    System.out.println("3");
                    // If there is not data, then we may have taken a photo
                /*if (mCameraPhotoPath != null) {
                    System.out.println("4");
                }*/
                }
                else {
                    System.out.println("5");
                    String dataString = data.getDataString();
                    if (dataString != null) {
                        System.out.println("6");
                        results = new Uri[]{Uri.parse(dataString)};
                    }
                    else {
                        System.out.println("7");
                        if(data.getData() != null){
                            System.out.println("8");
                            results = new Uri[]{data.getData()};
                        }
                        else {
                            System.out.println("9");
                            Bitmap bitmap1 = (Bitmap) data.getExtras().get("data");
                            results = new Uri[]{getImageUri(((SpenseOpenerActivity) getActivity()), bitmap1)};
                        }
                    }
                }
            }

        }

        mFilePathCallback.onReceiveValue(results);
        mFilePathCallback = null;
    }



    private boolean hasAllPermissions() {
        return ContextCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED
                && ContextCompat.checkSelfPermission(getContext(), Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED
                && ContextCompat.checkSelfPermission(getContext(), Manifest.permission.RECORD_AUDIO) == PackageManager.PERMISSION_GRANTED;
    }

    private void requestRequiredPermissions() {
        String readMediaImages;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            readMediaImages = Manifest.permission.READ_MEDIA_IMAGES;
        } else {
            readMediaImages = Manifest.permission.READ_EXTERNAL_STORAGE;
        }

        requestPermissions(new String[]{
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.CAMERA,
                Manifest.permission.RECORD_AUDIO,
                readMediaImages
        }, REQUEST_PERMISSIONS_CODE);
    }


    private static final int REQUEST_PERMISSIONS_CODE = 1001;
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == REQUEST_PERMISSIONS_CODE) {
            if (hasAllPermissions()) {
                System.out.println("hasAllPermissions");
                if(forceUpdateBottomSheet != null){
                    forceUpdateBottomSheet.cancel();
                }
            } else {
                // One or more permissions denied
                openAForceBottomOpener();
                Toast.makeText(context, "All permissions are required!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    BottomSheetDialog forceUpdateBottomSheet;

    void openAForceBottomOpener(){
        forceUpdateBottomSheet = new BottomSheetDialog(context, R.style.SpenseBottomSheetDialog);
        LinearLayout forceUpdateBottomSheetLayout = (LinearLayout) rootView.findViewById(R.id.googleSignInBottomSheetContainer);
        forceUpdateBottomSheet.setContentView(LayoutInflater.from(context).inflate(R.layout.permission_bottom_sheet, forceUpdateBottomSheetLayout));
        forceUpdateBottomSheet.setCancelable(false);

        CardView continueButton = forceUpdateBottomSheet.findViewById(R.id.continue_button);
        TextView help_header = forceUpdateBottomSheet.findViewById(R.id.help_header);
        continueButton.setBackgroundColor(context.getResources().getColor(getArguments().getInt("color_code")));
        help_header.setTextColor(context.getResources().getColor(getArguments().getInt("color_code")));

        continueButton.setOnClickListener(view -> {
            if (!hasAllPermissions()) {
                requestRequiredPermissions();
            }
        });

        forceUpdateBottomSheet.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
        forceUpdateBottomSheet.getBehavior().setState(BottomSheetBehavior.STATE_EXPANDED);
        forceUpdateBottomSheet.show();
    }

    /*@Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        System.out.println("permissions : "+permissions[0]);
        switch (requestCode) {
            case REQUEST_FINE_LOCATION:
                System.out.println("REQUEST_FINE_LOCATION");
                boolean allow = false;
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // user has allowed this permission
                    //webView.loadUrl();
                    allow = true;
                }
                if (geolocationCallback != null) {
                    // call back to web chrome client
                    geolocationCallback.invoke(geolocationOrigin, allow, false);
                }
                webView.loadUrl(afterPermissionUrl);
                break;
            case REQUEST_CAMERA_LOCATION:
                boolean allow2 = false;
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // user has allowed this permission
                    allow2 = true;
                }
                if(cameraRequest != null){
                    if(allow2){
                        cameraRequest.grant(cameraRequest.getResources());
                    }
                }

        }
    }*/



}