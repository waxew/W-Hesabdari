package com.hesabdari.accounting_engine.financial_reports.balance_sheet

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun BalanceSheetScreen(
    state: BalanceSheetState
) {
    Column {
        Text(text = "Balance Sheet")
        Text(text = "Assets: ${state.assets}")
        Text(text = "Liabilities: ${state.liabilities}")
        Text(text = "Equity: ${state.equity}")
        Text(
            text = if (state.isBalanced) {
                "Balanced"
            } else {
                "Balance mismatch"
            }
        )
    }
}
