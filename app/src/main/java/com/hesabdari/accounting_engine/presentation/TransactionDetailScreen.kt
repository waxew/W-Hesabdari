package com.hesabdari.accounting_engine.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TransactionDetailScreen(
    transactionId: String,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.padding(16.dp)) {
        Text(text = "Transaction Detail")
        Text(text = "Reference: $transactionId")
        Text(text = "Journal Entries")
        Text(text = "Debit / Credit details will be loaded from Accounting Engine")
    }
}
