package com.hesabdari.accounting_engine.ledger

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable

@Composable
fun LedgerEntriesList(entries: List<String>) {
    Column {
        entries.forEach { entry ->
            LedgerEntryItem(entry = entry)
        }
    }
}
