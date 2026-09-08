/*
================================================
نام فایل:
DefaultAccountProvider.kt

وظیفه:
ارائه حساب‌های پیش‌فرض عمومی.

ارتباط:
Financial Configuration Engine

نکات توسعه:
در آینده Business Profile می‌تواند قالب اختصاصی خود را معرفی کند.
================================================
*/

package com.hesabdari.financial_configuration

object DefaultAccountProvider {

    fun provide(): List<AccountTemplate> {
        return listOf(
            AccountTemplate("1000", "Cash", AccountCategoryType.ASSET),
            AccountTemplate("2000", "Payable", AccountCategoryType.LIABILITY),
            AccountTemplate("4000", "Revenue", AccountCategoryType.REVENUE),
            AccountTemplate("5000", "Expense", AccountCategoryType.EXPENSE)
        )
    }
}
