package com.project.anime;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebViewClient;

public class WebView extends AppCompatActivity {


    android.webkit.WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webView=findViewById(R.id.WebViewAnime);
        String name=getIntent().getStringExtra("name");
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://personajes-de-ficcion-database.fandom.com/es/wiki/Especial:Buscar?query="+name);
    }
}