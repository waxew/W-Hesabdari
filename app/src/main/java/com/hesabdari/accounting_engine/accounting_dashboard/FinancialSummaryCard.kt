package com.hesabdari.accounting_engine.accounting_dashboard

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun FinancialSummaryCard(
    title: String,
    value: String
) {
    Card {
        Column {
            Text(text = title)
            Text(text = value)
        }
    }
}
