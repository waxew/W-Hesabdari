/*
================================================
نام فایل:
FinancialReport.kt

وظیفه:
مدل گزارش‌های مالی عمومی.

ارتباط:
از داده‌های Core Accounting برای گزارش‌گیری استفاده می‌کند.

نکات توسعه:
گزارش‌های تخصصی هر کسب‌وکار باید در Module مربوطه قرار گیرند.
================================================
*/

package com.hesabdari.domain.report

/**
 * گزارش مالی پایه سیستم.
 */
data class FinancialReport(
    val id: String,
    val title: String,
    val description: String
)
