/*
================================================
نام فایل:
JournalEntry.kt

وظیفه:
مدل سند حسابداری عمومی.

ارتباط:
به Account و Transaction متصل می‌شود.

نکات توسعه:
این فایل بخشی از Core است و نباید وابسته به نوع کسب‌وکار باشد.
================================================
*/

package com.hesabdari.domain.journal

import com.hesabdari.domain.transaction.Transaction

/**
 * سند حسابداری شامل مجموعه‌ای از رویدادهای مالی.
 */
data class JournalEntry(
    val id: String,
    val description: String,
    val transactions: List<Transaction>
)
