package com.example.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.calculator.presentation.CalculatorScreen
import com.example.calculator.ui.theme.CalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Constants.BASE_URL // variable loaded from the different build variants source folder
        setContent {
            CalculatorTheme {
                CalculatorScreen()
            }
        }
    }
}