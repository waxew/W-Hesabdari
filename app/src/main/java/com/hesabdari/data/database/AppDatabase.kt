/*
================================================
نام فایل:
AppDatabase.kt

وظیفه:
تعریف پایگاه داده اصلی برنامه با معماری Room.

ارتباط:
Entity ها و DAO ها از این کلاس استفاده می‌کنند.

نکات توسعه:
این فایل فقط زیرساخت ذخیره‌سازی است و نباید شامل منطق کسب‌وکار باشد.
منطق حسابداری در Domain و UseCase قرار دارد.
================================================
*/

package com.hesabdari.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hesabdari.data.database.dao.AccountDao
import com.hesabdari.data.database.dao.InvoiceDao
import com.hesabdari.data.database.dao.PartyDao
import com.hesabdari.data.database.dao.TransactionDao
import com.hesabdari.data.database.entity.AccountEntity
import com.hesabdari.data.database.entity.InvoiceEntity
import com.hesabdari.data.database.entity.PartyEntity
import com.hesabdari.data.database.entity.TransactionEntity

@Database(
    entities = [
        AccountEntity::class,
        TransactionEntity::class,
        InvoiceEntity::class,
        PartyEntity::class
    ],
    version = 1,
    exportSchema = true
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun accountDao(): AccountDao

    abstract fun transactionDao(): TransactionDao

    abstract fun invoiceDao(): InvoiceDao

    abstract fun partyDao(): PartyDao
}
