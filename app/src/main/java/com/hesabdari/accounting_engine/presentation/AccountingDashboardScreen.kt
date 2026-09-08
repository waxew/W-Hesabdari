package com.hesabdari.accounting_engine.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AccountingDashboardScreen(
    state: AccountingState,
    onEvent: (AccountingEvent) -> Unit
) {
    Column(modifier = Modifier.padding(16.dp)) {
        Card {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "Financial Dashboard")
                Text(text = "Balance: ${state.balance}")
                Text(text = "Income: ${state.totalIncome}")
                Text(text = "Expense: ${state.totalExpense}")
            }
        }
    }
}
