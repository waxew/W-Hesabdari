/*
================================================
نام فایل:
AttributeSchema.kt

وظیفه:
تعریف ساختار Attribute های پویا برای Business Profile.

ارتباط:
BusinessProfile -> AttributeSchema -> Entity

نکات توسعه:
این کلاس فقط تعریف داده است و منطق کسب و کار ندارد.
================================================
*/

package com.hesabdari.business_profile.configuration


data class AttributeSchema(
    val name: String,
    val type: AttributeType,
    val required: Boolean = false
)
