package com.hesabdari.accounting_engine.financial_reports

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProfitLossReportScreen(
    state: ProfitLossReportState
) {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(text = "Profit & Loss Report")
        Text(text = "Revenue: ${state.revenue}")
        Text(text = "Expense: ${state.expense}")
        Text(text = "Net Profit: ${state.netProfit}")
    }
}
