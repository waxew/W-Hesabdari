package com.hesabdari.modules.invoice.data

interface InvoiceLineDao {
    fun insert(line: InvoiceLineEntity)
    fun getByInvoiceId(invoiceId: String): List<InvoiceLineEntity>
}
