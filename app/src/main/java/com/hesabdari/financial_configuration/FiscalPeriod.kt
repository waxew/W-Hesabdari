/*
================================================
نام فایل:
FiscalPeriod.kt

وظیفه:
تعریف دوره های مالی داخل سال مالی.

ارتباط:
FiscalYear -> FiscalPeriod -> Accounting Transactions

نکات توسعه:
برای بستن ماهانه و کنترل ثبت اسناد استفاده خواهد شد.
================================================
*/

package com.hesabdari.financial_configuration

/**
 * دوره مالی عمومی
 */
data class FiscalPeriod(
    val id: String,
    val fiscalYearId: String,
    val title: String,
    val startDate: Long,
    val endDate: Long,
    val isClosed: Boolean = false
)
