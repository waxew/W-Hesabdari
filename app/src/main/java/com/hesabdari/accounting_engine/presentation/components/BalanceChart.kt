package com.hesabdari.accounting_engine.presentation.components

import androidx.compose.runtime.Composable
import androidx.compose.material3.Text

@Composable
fun BalanceChart(
    income: Double,
    expense: Double
) {
    Text(text = "Income: $income | Expense: $expense")
}
