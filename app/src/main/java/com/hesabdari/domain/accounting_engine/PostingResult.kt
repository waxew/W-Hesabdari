/*
================================================
نام فایل:
PostingResult.kt

وظیفه:
مدل نتیجه ثبت عملیات حسابداری.

ارتباط:
AccountingPostingEngine -> PostingResult

نکات توسعه:
این فایل فقط نتیجه عملیات را نگهداری می‌کند.
منطق مالی نباید در این کلاس قرار گیرد.
================================================
*/

package com.hesabdari.domain.accounting_engine

/**
 * نتیجه ثبت یک عملیات حسابداری.
 */
data class PostingResult(
    val isSuccessful: Boolean,
    val message: String,
    val journalId: String? = null
)
