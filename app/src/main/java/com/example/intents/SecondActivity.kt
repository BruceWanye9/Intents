package com.example.intents

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.intents.ui.theme.IntentsTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {
            IntentsTheme {
                Text(
                    text = "Hello World",
                    modifier = Modifier.fillMaxSize(), color = Color.Yellow, textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 67.sp,
                        fontFamily = FontFamily.Default
                    )
                )
            }
        }
    }
}