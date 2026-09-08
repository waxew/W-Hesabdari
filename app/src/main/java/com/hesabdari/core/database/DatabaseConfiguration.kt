/*
================================================
نام فایل:
DatabaseConfiguration.kt

وظیفه:
نگهداری تنظیمات عمومی دیتابیس.

ارتباط:
Database Layer و Application Configuration

نکات توسعه:
تنظیمات کسب و کار از Business Profile تامین می شود.
================================================
*/

package com.hesabdari.core.database

/** تنظیمات عمومی دیتابیس */
data class DatabaseConfiguration(
    val databaseName: String = "hesabdari_database"
)