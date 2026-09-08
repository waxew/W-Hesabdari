/*
================================================
نام فایل:
InvoiceMapper.kt

وظیفه:
تبدیل مدل فاکتور بین Database و Domain.

ارتباط:
InvoiceEntity <-> Invoice

نکات توسعه:
فاکتور عمومی است و وابسته به هیچ Business Profile نیست.
================================================
*/

package com.hesabdari.data.mapper

import com.hesabdari.data.database.entity.InvoiceEntity
import com.hesabdari.domain.invoice.Invoice

object InvoiceMapper {

    fun toDomain(entity: InvoiceEntity): Invoice {
        return Invoice(
            id = entity.id,
            number = entity.number,
            totalAmount = entity.totalAmount,
            status = entity.status
        )
    }

    fun toEntity(domain: Invoice): InvoiceEntity {
        return InvoiceEntity(
            id = domain.id,
            number = domain.number,
            totalAmount = domain.totalAmount,
            status = domain.status
        )
    }
}
