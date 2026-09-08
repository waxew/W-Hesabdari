package com.hesabdari.modules.invoice.data

import com.hesabdari.modules.invoice.domain.Invoice

/**
 * مسئول تبدیل مدل‌های Domain و Data در ماژول Invoice است.
 * این کلاس نباید شامل منطق کسب و کار باشد.
 */
object InvoiceMapper {

    fun toDomain(entity: InvoiceEntity): Invoice {
        return Invoice(
            id = entity.id,
            customerId = entity.customerId,
            invoiceNumber = entity.invoiceNumber,
            date = entity.date,
            totalAmount = entity.totalAmount,
            status = entity.status
        )
    }

    fun toEntity(domain: Invoice): InvoiceEntity {
        return InvoiceEntity(
            id = domain.id,
            customerId = domain.customerId,
            invoiceNumber = domain.invoiceNumber,
            date = domain.date,
            totalAmount = domain.totalAmount,
            status = domain.status
        )
    }
}
