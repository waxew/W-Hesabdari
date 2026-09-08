/*
================================================
نام فایل:
OpeningBalance.kt

وظیفه:
مدیریت مانده های اولیه هنگام شروع حسابداری.

ارتباط:
FiscalYear -> OpeningBalance -> Account

نکات توسعه:
برای انتقال از سیستم قبلی یا شروع سال مالی جدید استفاده می شود.
================================================
*/

package com.hesabdari.financial_configuration

/**
 * مانده افتتاحیه حساب
 */
data class OpeningBalance(
    val accountId: String,
    val debit: Double,
    val credit: Double
)
