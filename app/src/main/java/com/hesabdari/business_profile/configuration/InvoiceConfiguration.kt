/*
================================================
نام فایل:
InvoiceConfiguration.kt

وظیفه:
نگهداری تنظیمات ظاهری و رفتاری فاکتور.

ارتباط:
Business Profile -> Invoice Configuration -> Invoice UI

نکات توسعه:
قوانین ثبت حسابداری در Core قرار دارند.
این فایل فقط تنظیمات نسخه کسب و کار است.
================================================
*/

package com.hesabdari.business_profile.configuration

/**
 * تنظیمات قابل تغییر فاکتور
 */
data class InvoiceConfiguration(
    val templateId: String,
    val showTax: Boolean,
    val showDiscount: Boolean,
    val currencyLabel: String
)
