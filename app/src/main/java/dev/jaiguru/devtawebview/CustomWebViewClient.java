package dev.jaiguru.devtawebview;

import android.webkit.WebView;

/**
 * Created by Sunil on 06/04/17.
 */

public class CustomWebViewClient extends android.webkit.WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
