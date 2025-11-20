package com.example.praktikum6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.praktikum6.ui.theme.Praktikum6Theme
import com.example.praktikum6.view.uicontroller.SiswaApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Praktikum6Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SiswaApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}