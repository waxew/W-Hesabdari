/*
================================================
نام فایل:
InvoiceRepository.kt

وظیفه:
تعریف قرارداد ذخیره و بازیابی فاکتورهای عمومی سیستم.

ارتباط:
Invoice Domain <- Repository <- Database

نکات توسعه:
فاکتور Core است و به هیچ Business Profile خاصی وابسته نیست.
================================================
*/

package com.hesabdari.data.repository

import com.hesabdari.domain.invoice.Invoice

interface InvoiceRepository {

    suspend fun save(invoice: Invoice)

    suspend fun getById(id: String): Invoice?

    suspend fun getAll(): List<Invoice>
}
