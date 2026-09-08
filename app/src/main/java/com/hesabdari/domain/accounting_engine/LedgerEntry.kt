/*
================================================
نام فایل:
LedgerEntry.kt

وظیفه:
مدل ثبت گردش دفتر کل در هسته حسابداری.

ارتباط:
Transaction -> JournalEntry -> LedgerEntry

نکات توسعه:
این فایل عمومی است و نباید شامل اطلاعات کسب و کار باشد.
اطلاعات اختصاصی در Module یا Business Profile قرار می‌گیرد.
================================================
*/

package com.hesabdari.domain.accounting_engine

/**
 * نماینده یک رکورد دفتر کل.
 */
data class LedgerEntry(
    val id: String,
    val accountId: String,
    val journalEntryId: String,
    val debit: Long,
    val credit: Long,
    val description: String
)
