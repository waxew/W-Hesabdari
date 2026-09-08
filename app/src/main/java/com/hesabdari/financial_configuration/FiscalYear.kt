/*
================================================
نام فایل:
FiscalYear.kt

وظیفه:
تعریف سال مالی در هسته تنظیمات مالی.

ارتباط:
Business Profile -> Financial Configuration -> Fiscal Year

نکات توسعه:
این فایل وابسته به نوع کسب و کار نیست و برای تمام نسخه های حسابداری استفاده می شود.
================================================
*/

package com.hesabdari.financial_configuration

/**
 * مدل سال مالی عمومی سیستم حسابداری
 */
data class FiscalYear(
    val id: String,
    val title: String,
    val startDate: Long,
    val endDate: Long,
    val isClosed: Boolean = false
)
