package com.hesabdari.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/** مدل ذخیره‌سازی فاکتور در Room. */
@Entity(tableName = "invoices")
data class InvoiceEntity(
    @PrimaryKey
    val id: Long,
    val number: String,
    val totalAmount: Double,
    val status: String
)
