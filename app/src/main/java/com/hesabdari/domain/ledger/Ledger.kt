/*
================================================
نام فایل:
Ledger.kt

وظیفه:
مدیریت دفتر حسابداری در Core Engine.

ارتباط:
- Account
- Transaction
- Report

نکات توسعه:
دفتر کل نباید هیچ شناختی از نوع کسب و کار داشته باشد.
================================================
*/

package com.hesabdari.domain.ledger

import com.hesabdari.domain.transaction.Transaction

/**
 * دفتر ثبت تراکنش‌های مالی.
 */
data class Ledger(
    val id: String,
    val transactions: List<Transaction>
)
