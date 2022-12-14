package com.example.webviewexample;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWebView();
    }

    protected void initWebView() {
        webView = findViewById(R.id.web_view);
        webView.loadUrl("https://www.example.com/");
    }
}