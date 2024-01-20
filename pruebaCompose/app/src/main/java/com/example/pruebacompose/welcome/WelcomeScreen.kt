package com.example.pruebacompose.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pruebacompose.R

@Composable
fun WelcomeScreen(){
    val buttonTextList = listOf("Create Account", "Login", "Back")

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.logoapp),
            contentDescription = "Logo app",
            modifier = Modifier.size(350.dp)
        )

        Column(modifier = Modifier.offset(y = -(25.dp)), horizontalAlignment = Alignment.CenterHorizontally) {
            WelcomeText()

            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 26.dp, start = 60.dp, end = 60.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceAround) {


                for (i in 0 .. 2){
                    AppButton(buttonTextList[i])
                    Spacer(modifier = Modifier.height(12.dp))
                }
            }

            FooterText()
        }
    }
}

@Composable
fun WelcomeText(){
    Text(
        text = "Welcome",
        style = TextStyle(
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold
        )
    )

    Spacer(modifier = Modifier.height(10.dp))

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Before enjoying Our services", color = Color.DarkGray)
        Text(text = "Please register first", color = Color.DarkGray)
    }
}

@Composable
fun AppButton(text: String) {
    val mainColor = Color(0xFF32b768)

    Button(
        onClick = {  },
        colors = ButtonDefaults.buttonColors(
            containerColor = mainColor,
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text(
            text = text,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        )
    }
}

@Composable
fun FooterText() {
    val mainColor = Color(0xFF32b768)

    Column(Modifier.padding(top = 16.dp)) {
        Text(text = "By logging in or registering, you have agreed to",
            fontSize = 14.sp,
            color = Color.DarkGray)
        Row {
            Text(text = "The Terms and Conditions",
                style = TextStyle(
                    fontSize = 14.sp,
                    color = mainColor
                ),
                modifier = Modifier.padding(end = 6.dp)
            )
            Text(text = "And",
                fontSize = 14.sp,
                color = Color.DarkGray)
            Text(text = "Privacy Policy",
                style = TextStyle(
                    fontSize = 14.sp,
                    color = mainColor
                ),
                modifier = Modifier.padding(start = 6.dp)
            )
        }
    }
}