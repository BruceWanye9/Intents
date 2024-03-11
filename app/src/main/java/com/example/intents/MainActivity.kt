package com.example.intents

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.Intents
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat.startActivity
import com.example.intents.ui.theme.IntentsTheme
import android.content.Context

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntentsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    activity(context = LocalContext.current)
                }
            }
        }
    }
}

@Composable
fun activity(context: Context) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
 Button(onClick = {
//     Intent(context,SecondActivity::class.java).also{
//       startActivity(context,it,null)
//   Intent(Intent.ACTION_MAIN).also {
//       it.`package`="com.google.android.youtube"
//    try {
//        startActivity(context,it,null)
//    }catch (e:ActivityNotFoundException){
//        e.printStackTrace()
//    }
val intent=Intent(Intent.ACTION_SEND).apply {
    type="text/plain"
    putExtra(Intent.EXTRA_EMAIL, arrayOf("test@test.com"))
    putExtra(Intent.EXTRA_SUBJECT,"Email to give response on ....")
    putExtra(Intent.EXTRA_TEXT,"This is the body of email")
}
     if(intent.resolveActivity(context.packageManager) !=null)
     {
         context.startActivity(intent)
     }


 }) {
     Text(text = "Click ME")
 }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IntentsTheme {
        activity(context = LocalContext.current)
    }
}