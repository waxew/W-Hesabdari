/*
================================================
نام فایل:
AccountingRule.kt

وظیفه:
تعریف قوانین عمومی ثبت حسابداری.

ارتباط:
Invoice / Payment / Transaction
        ↓
AccountingRule
        ↓
Posting Engine

نکات توسعه:
قوانین اختصاصی کسب و کارها نباید اینجا قرار بگیرند.
آن‌ها باید در Module مربوطه پیاده‌سازی شوند.
================================================
*/

package com.hesabdari.domain.accounting_engine

/**
 * قانون پایه ثبت مالی.
 */
data class AccountingRule(
    val ruleId: String,
    val description: String
)
