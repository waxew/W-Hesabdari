/*
================================================
نام فایل:
Transaction.kt

وظیفه:
مدل ثبت رویداد مالی در موتور حسابداری.

ارتباط:
- Account
- Ledger
- Reports

نکات توسعه:
این مدل عمومی است و به هیچ Business Profile وابستگی ندارد.
================================================
*/

package com.hesabdari.domain.transaction

import com.hesabdari.domain.account.Account

/**
 * تراکنش مالی عمومی.
 */
data class Transaction(
    val id: String,
    val account: Account,
    val amount: Double,
    val type: TransactionType,
    val description: String
)

enum class TransactionType {
    DEBIT,
    CREDIT
}
