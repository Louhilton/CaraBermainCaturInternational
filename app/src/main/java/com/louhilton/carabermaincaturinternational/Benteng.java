package com.louhilton.carabermaincaturinternational;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.webkit.WebView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by user on 29/07/2017.
 */

public class Benteng extends Activity {
    private AdView adView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.benteng);

        String image= "file:///android_asset/benteng2.png";

        String text="Benteng dapat dijalankan secara vertikal maupun horizontal.";

        WebView webView=(WebView)findViewById(R.id.isiBenteng);
        webView.loadDataWithBaseURL(null,"<body style=\"font-family: monospace\">" +
                "<center><img src='"+image+"' width=200px /></center>" +
                "<p style =\"text-align: justify\">"+text+"</p>" +
                "</body>","text/html","UTF-8",null);
        webView.setBackgroundColor(0x00000000);
        webView.getSettings().setTextZoom(150);

        adView=(AdView) this.findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    public void btnPrev(View view){
        Intent intent=new Intent(this,Pion.class);
        startActivity(intent);
    }

    public void btnNext(View view){
        Intent intent=new Intent(this,Kuda.class);
        startActivity(intent);
    }
}
