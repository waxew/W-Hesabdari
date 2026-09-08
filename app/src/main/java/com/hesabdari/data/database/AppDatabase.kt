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

/** پایگاه داده اصلی حسابداری. */
@Database(
    entities = [
        AccountEntity::class,
        TransactionEntity::class,
        InvoiceEntity::class,
        PartyEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun accountDao(): AccountDao
    abstract fun transactionDao(): TransactionDao
    abstract fun invoiceDao(): InvoiceDao
    abstract fun partyDao(): PartyDao
}
