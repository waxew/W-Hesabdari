package com.hesabdari.accounting_engine.financial_reports.cash_flow

import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Column

@Composable
fun CashFlowScreen(
    state: CashFlowState
) {
    Column {
        Text(text = "Cash Flow Report")
        Text(text = "Operating Cash Flow: ${state.operatingCashFlow}")
        Text(text = "Investing Cash Flow: ${state.investingCashFlow}")
        Text(text = "Financing Cash Flow: ${state.financingCashFlow}")
        Text(text = "Net Cash Change: ${state.netCashChange}")
    }
}
