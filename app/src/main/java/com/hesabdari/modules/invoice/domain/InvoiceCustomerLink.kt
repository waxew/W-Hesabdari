package com.hesabdari.modules.invoice.domain

/**
 * ارتباط عمومی بین مشتری و فاکتور.
 *
 * این کلاس فقط رابطه Domain را نگهداری می‌کند.
 * اطلاعات اختصاصی کسب و کار نباید در این لایه قرار گیرد.
 */
data class InvoiceCustomerLink(
    val customerId: String,
    val invoiceId: String
)
