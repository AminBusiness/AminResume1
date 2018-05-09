package com.example.amin_elhasan.resume1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView



class Main2Activity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val myWebView = findViewById<View>(R.id.webview) as WebView
        myWebView.loadUrl("http://iwt.ranken.edu/aelhasan/Portfolio/Portfolio.html")
    }

}

