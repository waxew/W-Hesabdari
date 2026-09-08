/*
================================================
نام فایل:
ClosingProcess.kt

وظیفه:
تعریف فرآیند بستن دوره مالی.

ارتباط:
FiscalPeriod -> ClosingProcess -> Ledger

نکات توسعه:
منطق نهایی بستن حساب ها بعداً در Service Layer پیاده سازی می شود.
================================================
*/

package com.hesabdari.financial_configuration

/**
 * وضعیت عملیات بستن دوره مالی
 */
data class ClosingProcess(
    val fiscalPeriodId: String,
    val closedAt: Long?,
    val completed: Boolean
)
