package com.yiddishlernen.app;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    WebView web = new WebView(this);
    web.setWebViewClient(new WebViewClient());
    web.setWebChromeClient(new WebChromeClient());
    web.getSettings().setJavaScriptEnabled(true);
    web.getSettings().setDomStorageEnabled(true);
    web.loadUrl("file:///android_asset/index.html");
    setContentView(web);
  }
  @Override public void onBackPressed() {
    WebView web = (WebView)findViewById(android.R.id.content).getRootView();
    super.onBackPressed();
  }
}
