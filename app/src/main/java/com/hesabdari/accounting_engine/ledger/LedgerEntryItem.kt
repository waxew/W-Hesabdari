package com.hesabdari.accounting_engine.ledger

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

/**
 * Ledger movement item component.
 * Displays one debit/credit ledger entry.
 */
@Composable
fun LedgerEntryItem(
    title: String,
    date: String,
    debit: Double,
    credit: Double,
    balance: Double
) {
    Text(
        text = "$date | $title | Debit: $debit | Credit: $credit | Balance: $balance"
    )
}
