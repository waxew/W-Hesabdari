package com.hesabdari.modules.invoice.data

import com.hesabdari.modules.invoice.domain.Invoice

/**
 * Invoice Repository Implementation
 *
 * وظیفه:
 * اتصال Workflow فاکتور به لایه ذخیره سازی.
 *
 * این کلاس نباید شامل منطق کسب و کار Profile ها باشد.
 * تنظیمات اختصاصی کسب و کار از Business Profile خوانده می شود.
 */
class InvoiceRepositoryImpl(
    private val databaseAdapter: InvoiceDatabaseAdapter
) : InvoiceRepository {

    override suspend fun save(invoice: Invoice): Result<Invoice> {
        return try {
            databaseAdapter.save(
                InvoiceMapper.toEntity(invoice)
            )
            Result.success(invoice)
        } catch (exception: Exception) {
            Result.failure(exception)
        }
    }

    override suspend fun getById(id: String): Result<Invoice?> {
        return try {
            val entity = databaseAdapter.getById(id)
            Result.success(entity?.let { InvoiceMapper.toDomain(it) })
        } catch (exception: Exception) {
            Result.failure(exception)
        }
    }
}
