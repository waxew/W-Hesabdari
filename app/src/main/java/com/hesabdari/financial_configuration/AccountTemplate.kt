/*
================================================
نام فایل:
AccountTemplate.kt

وظیفه:
تعریف قالب اولیه حساب‌ها.

ارتباط:
Financial Configuration Engine
+
Business Profile

نکات توسعه:
هر Profile می‌تواند قالب حسابداری خود را معرفی کند.
منطق حسابداری داخل این فایل قرار نمی‌گیرد.
================================================
*/

package com.hesabdari.financial_configuration

data class AccountTemplate(
    val code: String,
    val title: String,
    val category: AccountCategoryType
)
