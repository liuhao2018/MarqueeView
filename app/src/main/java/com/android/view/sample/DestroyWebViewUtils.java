package com.android.view.sample;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * @author malin on 16-11-4.
 */

public final class DestroyWebViewUtils {

    private DestroyWebViewUtils() {

    }

    /**
     * Destroy WebView OnDestroy()
     *
     * @param view WebView
     */
    public static void destroyWeBView(View view) {

        if (view instanceof WebView) {
            WebView webView = (WebView) view;
            try {
                webView.stopLoading();
            } catch (Throwable ignored) {

            }
            try {
                webView.removeAllViews();
            } catch (Throwable ignored) {

            }
            try {
                webView.setWebChromeClient(null);
            } catch (Throwable ignored) {

            }
            try {
                webView.setWebViewClient(null);
            } catch (Throwable ignored) {

            }
            try {
                webView.destroy();
            } catch (Throwable ignored) {

            }
            try {
                if (null != view.getParent() && view.getParent() instanceof ViewGroup) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
            } catch (Throwable ignored) {

            }


        }
    }


}
