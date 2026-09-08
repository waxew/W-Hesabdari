package com.hesabdari.accounting_engine.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun TransactionHistoryScreen(
    state: AccountingState
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Transaction History")
        Text(text = "Transactions: ${state.transactionCount}")
    }
}
