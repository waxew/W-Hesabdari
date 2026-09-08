package com.hesabdari.modules.invoice.data

import com.hesabdari.modules.invoice.domain.InvoiceLine

object InvoiceLineMapper {
    fun toDomain(entity: InvoiceLineEntity): InvoiceLine {
        return InvoiceLine(
            id = entity.id,
            invoiceId = entity.invoiceId,
            description = entity.description,
            quantity = entity.quantity,
            unitPrice = entity.unitPrice
        )
    }
}
