package com.hesabdari.modules.invoice.data

/**
 * واسط ارتباط Invoice Module با لایه Database Core.
 * ماژول Invoice نباید مستقیماً به جزئیات ذخیره‌سازی وابسته باشد.
 */
class InvoiceDatabaseAdapter(
    private val invoiceDao: InvoiceDao
) {

    suspend fun save(invoice: InvoiceEntity) {
        invoiceDao.insert(invoice)
    }

    suspend fun findById(id: Long): InvoiceEntity? {
        return invoiceDao.findById(id)
    }
}
