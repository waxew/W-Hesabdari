/*
================================================
نام فایل:
QuickActionCard.kt

وظیفه:
کامپوننت عمومی کارت عملیات سریع داشبورد.

استفاده:
- ایجاد فاکتور
- ثبت پرداخت
- مشاهده مشتریان
- گزارش‌ها

نکات توسعه:
این کامپوننت مستقل از نوع کسب‌وکار است.
نباید شامل اطلاعات فروشگاه، موبایل، سالن یا سایر Profileها باشد.
================================================
*/

package com.hesabdari.presentation.dashboard.components

import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun QuickActionCard(
    title: String,
    onClick: () -> Unit
) {
    Card(onClick = onClick) {
        Text(text = title)
    }
}
