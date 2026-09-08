/*
================================================
نام فایل:
DashboardScreen.kt
وظیفه:
صفحه اصلی رابط کاربری حسابداری.
این فایل فقط مسئول نمایش UI است و منطق حسابداری داخل آن قرار نمی‌گیرد.
ارتباط:
UI -> ViewModel -> UseCase -> Repository
نکات توسعه:
طراحی بر اساس Jetpack Compose انجام شده تا برای نسخه‌های مختلف Business Profile قابل استفاده باشد.
================================================
*/

package com.hesabdari.presentation.dashboard

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DashboardScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "داشبورد حسابداری",
            style = MaterialTheme.typography.headlineMedium
        )

        SummaryCard("فروش امروز", "0")
        SummaryCard("دریافت‌ها", "0")
        SummaryCard("پرداخت‌ها", "0")
        SummaryCard("مانده حساب", "0")

        Button(
            onClick = { },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("ایجاد فاکتور جدید")
        }
    }
}

@Composable
private fun SummaryCard(title: String, value: String) {
    Card(
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(title)
            Text(
                text = value,
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}
