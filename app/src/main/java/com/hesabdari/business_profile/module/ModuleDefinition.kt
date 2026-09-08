/*
================================================
نام فایل:
ModuleDefinition.kt

وظیفه:
تعریف ساختار ماژول‌های قابل فعال‌سازی در Business Profile.

ارتباط:
- BusinessProfile
- ModuleRegistry
- Accounting Core

نکات توسعه:
Module فقط برای قابلیت‌هایی استفاده می‌شود که دارای منطق، فرآیند و Workflow هستند.
اطلاعات توصیفی باید در Attribute Schema نگهداری شود.
================================================
*/

package com.hesabdari.business_profile.module

/**
 * تعریف یک قابلیت قابل فعال‌سازی در نسخه‌های مختلف نرم‌افزار.
 */
data class ModuleDefinition(
    val id: String,
    val title: String,
    val enabled: Boolean = true
)
