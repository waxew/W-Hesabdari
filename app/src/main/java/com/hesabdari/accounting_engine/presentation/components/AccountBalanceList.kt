package com.hesabdari.accounting_engine.presentation.components

import androidx.compose.runtime.Composable
import androidx.compose.material3.Text

@Composable
fun AccountBalanceList(
    accounts: List<String>
) {
    accounts.forEach { account ->
        Text(text = account)
    }
}
