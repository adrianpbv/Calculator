package com.droideros.calculator.presentation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import com.droideros.calculator.domain.Operation

val calculatorActions = listOf(
    CalculatorUiAction(
        text = "AC",
        highlightLevel = HighlightLevel.Highlighted,
        action = com.droideros.calculator.domain.CalculatorAction.Clear
    ),
    CalculatorUiAction(
        text = "()",
        highlightLevel = HighlightLevel.SemiHighlighted,
        action = com.droideros.calculator.domain.CalculatorAction.Parentheses
    ),
    CalculatorUiAction(
        text = "%",
        highlightLevel = HighlightLevel.SemiHighlighted,
        action = com.droideros.calculator.domain.CalculatorAction.Op(Operation.PERCENT)
    ),
    CalculatorUiAction(
        text = "÷",
        highlightLevel = HighlightLevel.SemiHighlighted,
        action = com.droideros.calculator.domain.CalculatorAction.Op(Operation.DIVIDE)
    ),
    CalculatorUiAction(
        text = "7",
        highlightLevel = HighlightLevel.Neutral,
        action = com.droideros.calculator.domain.CalculatorAction.Number(7)
    ),
    CalculatorUiAction(
        text = "8",
        highlightLevel = HighlightLevel.Neutral,
        action = com.droideros.calculator.domain.CalculatorAction.Number(8)
    ),
    CalculatorUiAction(
        text = "9",
        highlightLevel = HighlightLevel.Neutral,
        action = com.droideros.calculator.domain.CalculatorAction.Number(9)
    ),
    CalculatorUiAction(
        text = "x",
        highlightLevel = HighlightLevel.SemiHighlighted,
        action = com.droideros.calculator.domain.CalculatorAction.Op(Operation.MULTIPLY)
    ),
    CalculatorUiAction(
        text = "4",
        highlightLevel = HighlightLevel.Neutral,
        action = com.droideros.calculator.domain.CalculatorAction.Number(4)
    ),
    CalculatorUiAction(
        text = "5",
        highlightLevel = HighlightLevel.Neutral,
        action = com.droideros.calculator.domain.CalculatorAction.Number(5)
    ),
    CalculatorUiAction(
        text = "6",
        highlightLevel = HighlightLevel.Neutral,
        action = com.droideros.calculator.domain.CalculatorAction.Number(6)
    ),
    CalculatorUiAction(
        text = "-",
        highlightLevel = HighlightLevel.SemiHighlighted,
        action = com.droideros.calculator.domain.CalculatorAction.Op(Operation.SUBTRACT)
    ),
    CalculatorUiAction(
        text = "1",
        highlightLevel = HighlightLevel.Neutral,
        action = com.droideros.calculator.domain.CalculatorAction.Number(1)
    ),
    CalculatorUiAction(
        text = "2",
        highlightLevel = HighlightLevel.Neutral,
        action = com.droideros.calculator.domain.CalculatorAction.Number(2)
    ),
    CalculatorUiAction(
        text = "3",
        highlightLevel = HighlightLevel.Neutral,
        action = com.droideros.calculator.domain.CalculatorAction.Number(3)
    ),
    CalculatorUiAction(
        text = "+",
        highlightLevel = HighlightLevel.SemiHighlighted,
        action = com.droideros.calculator.domain.CalculatorAction.Op(Operation.ADD)
    ),
    CalculatorUiAction(
        text = "0",
        highlightLevel = HighlightLevel.Neutral,
        action = com.droideros.calculator.domain.CalculatorAction.Number(0)
    ),
    CalculatorUiAction(
        text = ".",
        highlightLevel = HighlightLevel.Neutral,
        action = com.droideros.calculator.domain.CalculatorAction.Decimal
    ),
    CalculatorUiAction(
        text = null,
        content = {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant
            )
        },
        highlightLevel = HighlightLevel.Neutral,
        action = com.droideros.calculator.domain.CalculatorAction.Delete
    ),
    CalculatorUiAction(
        text = "=",
        highlightLevel = HighlightLevel.StronglyHighlighted,
        action = com.droideros.calculator.domain.CalculatorAction.Calculate
    ),
)