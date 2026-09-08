package com.hesabdari.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/** مدل ذخیره‌سازی حساب در Room. */
@Entity(tableName = "accounts")
data class AccountEntity(
    @PrimaryKey
    val id: Long,
    val code: String,
    val name: String,
    val type: String
)
