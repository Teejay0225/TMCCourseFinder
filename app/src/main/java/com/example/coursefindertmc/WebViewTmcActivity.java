package com.example.coursefindertmc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebViewTmcActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_tmc);
        webView = (WebView) findViewById(R.id.webViewTmc);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.tmc.edu.sg/");
    }
}
