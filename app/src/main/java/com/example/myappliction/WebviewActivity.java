package com.example.myappliction;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class WebviewActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        webView = findViewById(R.id.web_view);

       webView.loadUrl("https://www.javatpoint.com/");
       webView.getSettings().setJavaScriptEnabled(true);
       webView.getSettings().setLoadsImagesAutomatically(true);
       webView.setWebViewClient(new MyWebview());
    }
    private class MyWebview extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String request) {
            view.loadUrl(request);
            return true;
        }
    }
    @Override
    public void onBackPressed() {
        // super.onBackPressed();

        if (webView.canGoBack()){
            webView.goBack();
        }else {
            //exit or not
            finish();
        }
    }

}