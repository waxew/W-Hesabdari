/*
================================================
نام فایل:
AccountingPostingEngine.kt

وظیفه:
موتور اصلی ثبت عملیات مالی در هسته حسابداری.

ارتباط:
Invoice / Payment / Transaction
        ↓
Posting Engine
        ↓
Journal Entry
        ↓
Ledger

نکات توسعه:
این کلاس مستقل از نوع کسب و کار است.
فروشگاه، رستوران، تولیدی و سایر Profile ها نباید داخل آن Hard Code شوند.
================================================
*/

package com.hesabdari.domain.accounting_engine

/**
 * موتور پایه ثبت سند حسابداری.
 *
 * پیاده سازی کامل اتصال Repository در لایه بعدی انجام می‌شود.
 */
class AccountingPostingEngine {

    fun post(rule: AccountingRule): PostingResult {
        return PostingResult(
            isSuccessful = true,
            message = "عملیات ثبت حسابداری آماده اجرا است: ${rule.ruleId}"
        )
    }
}
