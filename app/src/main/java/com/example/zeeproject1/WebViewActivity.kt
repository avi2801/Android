package com.example.zeeproject1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_web_view.*

class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        webview.webViewClient = WebViewClient()
        webview.loadUrl("https://www.facebook.com")
    }

    override fun onBackPressed() {
        if(webview.canGoBack())
        {
            webview.goBack()
        }else{
            super.onBackPressed()

        }

    }
}