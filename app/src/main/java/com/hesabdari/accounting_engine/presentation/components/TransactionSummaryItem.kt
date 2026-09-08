package com.hesabdari.accounting_engine.presentation.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun TransactionSummaryItem(
    title: String,
    amount: String
) {
    Text(text = "$title : $amount")
}
