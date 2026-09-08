/*
================================================
نام فایل:
AttributeDefinition.kt

وظیفه:
تعریف ویژگی‌های پویا برای موجودیت‌های مختلف.

ارتباط:
- Attribute Schema Engine
- Business Profile
- Entity Configuration

نکات توسعه:
هیچ Attribute اختصاصی کسب‌وکار نباید به صورت Field ثابت داخل Core Entity قرار گیرد.
این بخش فقط داده‌های قابل تنظیم را مدیریت می‌کند.
================================================
*/

package com.hesabdari.business_profile.schema

/**
 * تعریف یک ویژگی قابل اضافه شدن به Entityها.
 */
data class AttributeDefinition(
    val id: String,
    val title: String,
    val dataType: String
)
