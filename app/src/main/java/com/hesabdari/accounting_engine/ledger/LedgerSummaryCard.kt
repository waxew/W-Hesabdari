package com.hesabdari.accounting_engine.ledger

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun LedgerSummaryCard(state: LedgerState) {
    Column {
        Text(text = state.accountName)
        Text(text = "Opening Balance: ${state.openingBalance}")
        Text(text = "Debit: ${state.debitTotal}")
        Text(text = "Credit: ${state.creditTotal}")
        Text(text = "Closing Balance: ${state.closingBalance}")
    }
}
