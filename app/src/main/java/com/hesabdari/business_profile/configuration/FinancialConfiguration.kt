/*
================================================
نام فایل:
FinancialConfiguration.kt

وظیفه:
تعریف تنظیمات مالی قابل تغییر توسط Business Profile.

ارتباط:
BusinessProfile -> FinancialConfiguration -> Accounting Core

نکات توسعه:
این فایل نباید شامل منطق حسابداری باشد.
فقط تنظیمات را نگهداری می‌کند.
================================================
*/

package com.hesabdari.business_profile.configuration

/**
 * تنظیمات مالی اختصاصی هر نسخه کسب و کار
 */
data class FinancialConfiguration(
    val configurationId: String,
    val currency: String,
    val taxEnabled: Boolean,
    val accountingMethod: String,
    val invoiceTemplateId: String
)
