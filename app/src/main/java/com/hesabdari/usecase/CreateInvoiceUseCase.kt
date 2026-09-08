/*
================================================
نام فایل:
CreateInvoiceUseCase.kt

وظیفه:
مدیریت فرآیند ایجاد فاکتور.

ارتباط:
UI -> UseCase -> InvoiceRepository -> Domain

نکات توسعه:
این UseCase عمومی است و برای تمام Business Profileها استفاده می‌شود.
منطق اختصاصی کسب‌وکار باید در Module مربوطه قرار گیرد.
================================================
*/

package com.hesabdari.usecase

import com.hesabdari.domain.invoice.Invoice
import com.hesabdari.data.repository.InvoiceRepository

class CreateInvoiceUseCase(
    private val repository: InvoiceRepository
) {
    suspend operator fun invoke(invoice: Invoice) {
        repository.save(invoice)
    }
}
