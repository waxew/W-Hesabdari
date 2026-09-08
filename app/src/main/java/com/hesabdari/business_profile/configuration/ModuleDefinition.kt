/*
================================================
نام فایل:
ModuleDefinition.kt

وظیفه:
تعریف یک قابلیت قابل فعال سازی در Business Profile.

ارتباط:
Business Profile -> Module Configuration -> Module Definition

نکات توسعه:
این فایل فقط تعریف Module است و نباید شامل منطق کسب و کار باشد.
================================================
*/
package com.hesabdari.business_profile.configuration

/**
 * تعریف عمومی یک ماژول نرم افزاری.
 */
data class ModuleDefinition(
    val moduleId: String,
    val title: String,
    val description: String,
    val enabled: Boolean = true
)
