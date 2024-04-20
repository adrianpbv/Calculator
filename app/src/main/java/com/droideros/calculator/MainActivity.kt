package com.droideros.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.droideros.calculator.presentation.CalculatorScreen
import com.droideros.calculator.ui.theme.CalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        com.droideros.calculator.Constants.BASE_URL // variable loaded from the different build variants source folder
        setContent {
            CalculatorTheme {
                CalculatorScreen()
            }
        }
    }
}