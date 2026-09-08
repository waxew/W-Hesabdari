package com.hesabdari.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/** مدل ذخیره‌سازی تراکنش مالی در Room. */
@Entity(tableName = "transactions")
data class TransactionEntity(
    @PrimaryKey
    val id: Long,
    val accountId: Long,
    val amount: Double,
    val description: String
)
