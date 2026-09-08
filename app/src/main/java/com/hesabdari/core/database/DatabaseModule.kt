/*
================================================
نام فایل:
DatabaseModule.kt

وظیفه:
تعریف نقطه اتصال Database Core با لایه Dependency Injection.

ارتباط:
Application
    ↓
DatabaseModule
    ↓
AppDatabase

نکات توسعه:
این فایل نباید شامل اطلاعات اختصاصی کسب و کار باشد.
تمام Module ها باید از Database مرکزی استفاده کنند.
================================================
*/

package com.hesabdari.core.database

/**
 * محل آماده سازی Provider دیتابیس.
 * در مرحله بعد با Hilt/Koin تکمیل خواهد شد.
 */
object DatabaseModule {

    fun provideDatabaseConfiguration(): DatabaseConfiguration {
        return DatabaseConfiguration()
    }
}
