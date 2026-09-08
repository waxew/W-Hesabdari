/*
================================================
نام فایل:
CustomerModuleProvider.kt

وظیفه:
تعریف وابستگی‌های ماژول مشتری.

ارتباط:
این فایل بین لایه DI و Customer Module ارتباط ایجاد می‌کند.

نکات توسعه:
این فایل نباید شامل منطق کسب‌وکار باشد.
منطق مشتری در Domain و Data Layer قرار می‌گیرد.
================================================
*/

package com.hesabdari.modules.customer.di

/**
 * نقطه توسعه برای ثبت وابستگی‌های Customer Module.
 *
 * در نسخه‌های بعدی با Hilt/Koin تکمیل خواهد شد.
 */
object CustomerModuleProvider {
    const val MODULE_ID = "customer"
}
