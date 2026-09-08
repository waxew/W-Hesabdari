/*
================================================
نام فایل:
Account.kt

وظیفه:
مدل پایه حساب در موتور حسابداری.

ارتباط:
- Accounting Core
- Ledger
- Transaction

نکات توسعه:
این فایل مستقل از نوع کسب و کار است.
هیچ اطلاعاتی مانند فروشگاه، موبایل یا خدمات داخل آن قرار نمی‌گیرد.
================================================
*/

package com.hesabdari.domain.account

/**
 * حساب عمومی در سیستم حسابداری.
 */
data class Account(
    val id: String,
    val code: String,
    val name: String,
    val accountType: AccountType
)

enum class AccountType {
    ASSET,
    LIABILITY,
    EQUITY,
    REVENUE,
    EXPENSE
}
