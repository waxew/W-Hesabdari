/*
================================================
نام فایل:
TransactionRepository.kt

وظیفه:
تعریف قرارداد دسترسی به تراکنش‌های مالی.

ارتباط:
Domain Transaction -> Repository -> Data Source

نکات توسعه:
این فایل فقط قرارداد Repository است.
منطق ذخیره‌سازی در لایه Data قرار می‌گیرد.
این بخش نباید وابسته به نوع کسب‌وکار باشد.
================================================
*/

package com.hesabdari.data.repository

import com.hesabdari.domain.transaction.Transaction

interface TransactionRepository {
    suspend fun save(transaction: Transaction)
    suspend fun getAll(): List<Transaction>
}
