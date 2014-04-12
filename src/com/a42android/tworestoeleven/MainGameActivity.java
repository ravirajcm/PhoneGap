
package com.a42android.tworestoeleven;

import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.AdView;

import org.apache.cordova.DroidGap;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainGameActivity extends DroidGap {
    private static final String AdMob_Ad_Unit = "a15348dbe36cca5";

    private AdView adView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
        adView = new AdView(this, AdSize.BANNER, AdMob_Ad_Unit);
        LinearLayout layout = super.root;
        layout.addView(adView);
        AdRequest adRequest = new AdRequest();
        adView.loadAd(adRequest);

    }
}
