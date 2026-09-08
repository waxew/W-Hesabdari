package com.hesabdari.accounting_engine.ledger

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable

@Composable
fun LedgerEntriesList(entries: List<String>) {
    Column {
        entries.forEach { entry ->
            LedgerEntryItem(
                title = entry,
                date = "",
                debit = 0.0,
                credit = 0.0,
                balance = 0.0
            )
        }
    }
}
