package com.example.batallaapp

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat

class PrincipalActivity : AppCompatActivity() {
    private var isDarkModeEnabled = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        isDarkModeEnabled = savedInstanceState?.getBoolean("isDarkModeEnabled") ?: false
        updateTheme()

        setContentView(R.layout.activity_principal)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val navigationIcon = toolbar.navigationIcon
        navigationIcon?.let {
            val color = ContextCompat.getColor(this, android.R.color.white)
            DrawableCompat.setTint(it, color)
        }

        // Aplicar estilo en modo oscuro a los botones si es necesario
        if (isDarkModeEnabled) {
            findViewById<Button>(R.id.buttonEnter).setTextAppearance(R.style.ButtonStyle_Dark)
            findViewById<Button>(R.id.buttonExit).setTextAppearance(R.style.ButtonStyle_Dark)
        }

        val switchDarkMode: Switch = findViewById(R.id.switchDarkMode)
        switchDarkMode.isChecked = isDarkModeEnabled
        switchDarkMode.setOnCheckedChangeListener { _, isChecked ->
            isDarkModeEnabled = isChecked
            updateTheme()
            recreate()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putBoolean("isDarkModeEnabled", isDarkModeEnabled)
        super.onSaveInstanceState(outState)
    }

    private fun updateTheme() {
        if (isDarkModeEnabled) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
    }

    fun irAEntrar(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun buttonExit(view: View) {
        finishAffinity()
    }
}
