package com.example.batallaapp

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat

class DetalleNoticiaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        setContentView(R.layout.activity_detalle_noticia)


        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val navigationIcon = toolbar.navigationIcon
        navigationIcon?.let {
            val color = ContextCompat.getColor(this, android.R.color.white)
            DrawableCompat.setTint(it, color)
        }

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        val titulo = intent.getStringExtra("tituloLargo")
        val descripcion = intent.getStringExtra("descripcionLarga") ?: ""
        val imagenResId = intent.getIntExtra("imagen", 0)
        val urlVideo = intent.getStringExtra("urlVideo")

        val imageView: ImageView = findViewById(R.id.imageView)
        val tituloTextView: TextView = findViewById(R.id.tituloTextView)
        val descripcionTextView: TextView = findViewById(R.id.descripcionTextView)

        if (imagenResId != 0) {
            imageView.setImageResource(imagenResId)
        }

        tituloTextView.text = titulo
        descripcionTextView.text = descripcion

        val webView: WebView = findViewById(R.id.webView)
        webView.settings.javaScriptEnabled = true
        webView.settings.pluginState = WebSettings.PluginState.ON
        webView.webChromeClient = WebChromeClient()
        webView.settings.loadWithOverviewMode = true
        webView.settings.useWideViewPort = true

        val html =
            "<html><body><iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$urlVideo\" frameborder=\"0\" allowfullscreen></iframe></body></html>"
        webView.loadDataWithBaseURL("https://www.youtube.com", html, "text/html", "utf-8", null)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}
