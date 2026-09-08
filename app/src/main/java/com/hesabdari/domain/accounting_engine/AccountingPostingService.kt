/*
================================================
نام فایل:
AccountingPostingService.kt

وظیفه:
تعریف سرویس مرکزی ثبت عملیات حسابداری.

ارتباط:
Invoice / Payment
        ↓
AccountingPostingService
        ↓
Journal
        ↓
Ledger

نکات توسعه:
این سرویس نباید منطق کسب و کار خاص داشته باشد.
Profile و Module ها فقط قوانین اختصاصی خود را اضافه می‌کنند.
================================================
*/

package com.hesabdari.domain.accounting_engine

/**
 * سرویس پایه ثبت عملیات مالی.
 */
class AccountingPostingService {

    /**
     * بررسی آماده بودن سند برای ثبت.
     */
    fun validate(lines: List<JournalLine>): PostingValidationResult {
        return if (DebitCreditValidator.isBalanced(lines)) {
            PostingValidationResult.Valid
        } else {
            PostingValidationResult.Invalid(
                "جمع بدهکار و بستانکار برابر نیست"
            )
        }
    }
}
