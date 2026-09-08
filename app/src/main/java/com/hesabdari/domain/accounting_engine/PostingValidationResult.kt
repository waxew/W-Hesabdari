/*
================================================
نام فایل:
PostingValidationResult.kt

وظیفه:
نتیجه اعتبارسنجی عملیات ثبت حسابداری.

ارتباط:
AccountingPostingEngine
        |
        ↓
PostingValidationResult

نکات توسعه:
قبل از ثبت سند در Ledger باید اعتبارسنجی انجام شود.
================================================
*/

package com.hesabdari.domain.accounting_engine

/**
 * نتیجه بررسی صحت عملیات ثبت مالی.
 */
sealed class PostingValidationResult {

    /** عملیات معتبر است */
    object Valid : PostingValidationResult()

    /** عملیات دارای خطا است */
    data class Invalid(
        val message: String
    ) : PostingValidationResult()
}
