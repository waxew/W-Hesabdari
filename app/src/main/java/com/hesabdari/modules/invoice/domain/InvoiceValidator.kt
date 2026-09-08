/*
================================================
نام فایل:
InvoiceValidator.kt

وظیفه:
اعتبارسنجی قوانین عمومی فاکتور.

ارتباط:
قبل از اجرای Workflow فاکتور استفاده می‌شود.

نکات توسعه:
قوانین اختصاصی کسب‌وکار باید از Configuration دریافت شوند.
================================================
*/

package com.hesabdari.modules.invoice.domain

class InvoiceValidator {

    fun validate(invoice: Invoice): Boolean {
        return invoice.customerId.isNotBlank() &&
                invoice.invoiceNumber.isNotBlank()
    }
}
