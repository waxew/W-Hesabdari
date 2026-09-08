package com.hesabdari.accounting_engine.presentation.components

import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun FinancialSummaryCard(
    title: String,
    value: String
) {
    Card {
        Text(text = title)
        Text(text = value)
    }
}
