package com.hesabdari.modules.invoice.data

import com.hesabdari.modules.invoice.domain.InvoiceLine

interface InvoiceLineRepository {
    suspend fun save(line: InvoiceLine)
    suspend fun getByInvoiceId(invoiceId: Long): List<InvoiceLine>
}
