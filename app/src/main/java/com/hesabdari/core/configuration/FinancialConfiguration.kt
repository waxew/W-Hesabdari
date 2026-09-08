/*
================================================
نام فایل:
FinancialConfiguration.kt

وظیفه:
تعریف تنظیمات مالی عمومی سیستم حسابداری.

ارتباط:
این فایل متعلق به Core است و نباید به نوع خاصی از کسب و کار وابسته باشد.
Business Profile فقط مقادیر مناسب را تنظیم می‌کند.

نکات توسعه:
تنظیمات مالی مانند مالیات، ارز و سال مالی باید از این لایه مدیریت شوند.
================================================
*/

package com.hesabdari.core.configuration

/**
 * تنظیمات مالی عمومی که برای همه نسخه‌های حسابداری قابل استفاده است.
 */
data class FinancialConfiguration(
    val currency: String,
    val fiscalYear: String,
    val taxEnabled: Boolean
)
