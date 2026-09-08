/*
================================================
نام فایل:
AccountCategory.kt

وظیفه:
تعریف گروه‌بندی حساب‌های مالی.

ارتباط:
Financial Configuration Engine
+
Chart Of Accounts

نکات توسعه:
این فایل وابسته به هیچ نوع کسب‌وکار نیست.
Profileها فقط تنظیمات خود را ارائه می‌کنند.
================================================
*/

package com.hesabdari.financial_configuration

data class AccountCategory(
    val id: String,
    val name: String,
    val type: AccountCategoryType
)

enum class AccountCategoryType {
    ASSET,
    LIABILITY,
    EQUITY,
    REVENUE,
    EXPENSE
}
