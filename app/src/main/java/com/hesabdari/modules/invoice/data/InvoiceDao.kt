/*
================================================
نام فایل:
InvoiceDao.kt

وظیفه:
تعریف عملیات دسترسی به داده برای Invoice Module.

ارتباط:
InvoiceRepositoryImpl -> InvoiceDao -> Database Core

نکات توسعه:
این فایل نباید شامل منطق کسب و کار باشد.
منطق Workflow داخل Domain و UseCase قرار می‌گیرد.
================================================
*/

package com.hesabdari.modules.invoice.data

interface InvoiceDao {
    suspend fun insert(invoiceEntity: InvoiceEntity)
    suspend fun insertLine(lineEntity: InvoiceLineEntity)
    suspend fun getById(id: Long): InvoiceEntity?
}
