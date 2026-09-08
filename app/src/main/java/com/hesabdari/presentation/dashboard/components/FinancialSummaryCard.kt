/*
================================================
نام فایل:
FinancialSummaryCard.kt

وظیفه:
کامپوننت کارت خلاصه اطلاعات مالی داشبورد.

ارتباط:
DashboardScreen

نکات توسعه:
این کامپوننت عمومی است و نباید به Business Profile خاصی وابسته شود.
================================================
*/

package com.hesabdari.presentation.dashboard.components

import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun FinancialSummaryCard(title: String, value: String) {
    Card {
        Text(text = "$title : $value")
    }
}
