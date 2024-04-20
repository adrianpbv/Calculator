package com.droideros.calculator.presentation

import androidx.compose.runtime.Composable

data class CalculatorUiAction(
    val text: String?,
    val highlightLevel: HighlightLevel, // to determine button's background and text color
    val action: com.droideros.calculator.domain.CalculatorAction,
    val content: @Composable () -> Unit = {}
)

sealed interface HighlightLevel {
    object Neutral: HighlightLevel
    object SemiHighlighted: HighlightLevel
    object Highlighted: HighlightLevel
    object StronglyHighlighted: HighlightLevel
}
