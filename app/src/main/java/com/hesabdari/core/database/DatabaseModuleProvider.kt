/*
================================================
نام فایل:
DatabaseModuleProvider.kt

وظیفه:
فراهم کردن نقطه اتصال Database Core با لایه Dependency Injection.

ارتباط:
Application -> Database Provider -> AppDatabase -> Repository

نکات توسعه:
این فایل نباید شامل منطق کسب و کار باشد.
تمام Module ها باید فقط از Database Core استفاده کنند.
================================================
*/

package com.hesabdari.core.database

/**
 * Provider عمومی برای آماده سازی Database.
 * پیاده سازی نهایی Hilt/Koin در لایه DI تکمیل می شود.
 */
object DatabaseModuleProvider {
    fun provideDatabaseConfiguration(): DatabaseConfiguration {
        return DatabaseConfiguration()
    }
}
