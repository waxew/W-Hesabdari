/*
================================================
نام فایل:
InvoiceDao.kt

وظیفه:
مدیریت ذخیره و بازیابی فاکتورهای عمومی.

ارتباط:
InvoiceEntity -> DAO -> Repository

نکات توسعه:
قوانین اختصاصی کسب و کار در این بخش قرار نمی گیرد.
================================================
*/

package com.hesabdari.data.database.dao

import com.hesabdari.data.database.entity.InvoiceEntity

interface InvoiceDao {

    suspend fun insert(invoice: InvoiceEntity)

    suspend fun getById(id: Long): InvoiceEntity?
}
