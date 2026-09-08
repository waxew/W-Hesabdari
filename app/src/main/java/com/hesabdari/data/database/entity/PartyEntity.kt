package com.hesabdari.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/** مدل ذخیره‌سازی طرف حساب در Room. */
@Entity(tableName = "parties")
data class PartyEntity(
    @PrimaryKey
    val id: Long,
    val name: String,
    val phone: String,
    val type: String
)
