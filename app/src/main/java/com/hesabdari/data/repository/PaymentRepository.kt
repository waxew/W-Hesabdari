/*
================================================
نام فایل:
PaymentRepository.kt

وظیفه:
تعریف قرارداد مدیریت پرداخت‌ها.

ارتباط:
Payment Domain -> Repository -> Database

نکات توسعه:
روش پرداخت و Workflowهای اختصاصی در Moduleها توسعه داده می‌شوند.
این Repository عمومی باقی می‌ماند.
================================================
*/

package com.hesabdari.data.repository

import com.hesabdari.domain.payment.Payment

interface PaymentRepository {
    suspend fun save(payment: Payment)
    suspend fun getAll(): List<Payment>
}
