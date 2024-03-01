package com.example.mirelayapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.mirelayapp.account.Account
import com.example.mirelayapp.enter.Enter
import com.example.mirelayapp.loginfirst.LoginFirst
import com.example.mirelayapp.registrationfirst.RegistrationFirst
import com.example.mirelayapp.ui.theme.MiRelayAppTheme
import com.example.mirelayapp.welcome.Welcome

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiRelayAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

