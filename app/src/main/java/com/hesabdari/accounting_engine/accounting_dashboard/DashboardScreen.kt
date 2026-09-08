package com.hesabdari.accounting_engine.accounting_dashboard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * Executive accounting dashboard.
 *
 * This composable is intentionally state-driven so it can be used with
 * DashboardViewModel, previews, tests, and alternative navigation hosts.
 */
@Composable
fun DashboardScreen(
    state: DashboardState,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "Accounting Dashboard",
            style = MaterialTheme.typography.headlineSmall
        )

        if (state.isLoading) {
            Spacer(modifier = Modifier.height(8.dp))
            CircularProgressIndicator(
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        } else {
            DashboardSummaryRow(
                leftTitle = "Net Profit",
                leftValue = formatFinancialValue(state.netProfit),
                rightTitle = "Cash Balance",
                rightValue = formatFinancialValue(state.cashBalance)
            )

            DashboardSummaryRow(
                leftTitle = "Total Assets",
                leftValue = formatFinancialValue(state.totalAssets),
                rightTitle = "Total Liabilities",
                rightValue = formatFinancialValue(state.totalLiabilities)
            )

            if (state.financialStatus.isNotBlank()) {
                Text(
                    text = "Financial Status: ${state.financialStatus}",
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }

        state.errorMessage?.let { message ->
            Text(
                text = message,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.error
            )
        }
    }
}

@Composable
private fun DashboardSummaryRow(
    leftTitle: String,
    leftValue: String,
    rightTitle: String,
    rightValue: String
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Column(modifier = Modifier.weight(1f)) {
            FinancialSummaryCard(
                title = leftTitle,
                value = leftValue
            )
        }

        Column(modifier = Modifier.weight(1f)) {
            FinancialSummaryCard(
                title = rightTitle,
                value = rightValue
            )
        }
    }
}

private fun formatFinancialValue(value: Double): String =
    String.format("%,.2f", value)
