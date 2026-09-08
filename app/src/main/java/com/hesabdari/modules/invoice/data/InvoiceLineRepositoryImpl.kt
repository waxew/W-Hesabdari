package com.hesabdari.modules.invoice.data

class InvoiceLineRepositoryImpl(
    private val dao: InvoiceLineDao
) : InvoiceLineRepository {

    override fun save(line: InvoiceLineEntity) {
        dao.insert(line)
    }

    override fun getByInvoiceId(invoiceId: String): List<InvoiceLineEntity> {
        return dao.getByInvoiceId(invoiceId)
    }
}
