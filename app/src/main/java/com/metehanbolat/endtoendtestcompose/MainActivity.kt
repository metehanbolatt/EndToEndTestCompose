package com.metehanbolat.endtoendtestcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.endtoendtestcompose.ui.theme.EndToEndTestComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EndToEndTestComposeTheme {
                Navigation()
            }
        }
    }
}
