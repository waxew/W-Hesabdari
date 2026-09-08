/*
================================================
نام فایل:
InvoiceRepository.kt

وظیفه:
تعریف قرارداد Repository برای Invoice Module.

ارتباط:
InvoiceUseCase -> InvoiceRepository -> Data Layer

نکات توسعه:
این Interface مستقل از Room و Database است.
================================================
*/

package com.hesabdari.modules.invoice.data

import com.hesabdari.modules.invoice.domain.Invoice

interface InvoiceRepository {
    suspend fun save(invoice: Invoice)
    suspend fun getInvoice(id: Long): Invoice?
}
