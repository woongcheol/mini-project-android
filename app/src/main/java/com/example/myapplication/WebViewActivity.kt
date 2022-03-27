package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doBeforeTextChanged
import androidx.core.widget.doOnTextChanged

class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)


        val webview = findViewById<WebView>(R.id.webview)
        webview.setWebViewClient(object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: WebResourceRequest?
            ): Boolean {
                // true -> 주도권을 가져오지 않는다.
                // fasle -> 주도권을 가져오겠다.
                return false
            }
        })

        try {
            webview.loadUrl(
                intent.data!!.toString()
            )
        } catch (exception: Exception) {
        }

        val urlPrefix = "http://"
        var finalUrl = ""

        val address = findViewById<EditText>(R.id.address)

        // addTextChangedListner 사용법
        address.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                finalUrl = urlPrefix + s.toString()
            }
        })

        // addTextChangedListner 사용법 - 람다
        address.doBeforeTextChanged { text, start, count, after -> }
        address.doOnTextChanged { text, start, before, count -> }
        address.doAfterTextChanged { }

        val open = findViewById<TextView>(R.id.open)
        open.setOnClickListener {
            val url = address.text.toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }
}