/*
================================================
نام فایل:
EntityAttributeMapping.kt

وظیفه:
اتصال Attribute Schema به Entityهای عمومی Core.

مثال:
Product + Color
Product + Serial Number

نکات توسعه:
هیچ Attribute اختصاصی نباید داخل Entity Core به صورت Field ثابت اضافه شود.
================================================
*/

package com.hesabdari.business_profile.configuration

/**
 * نگاشت Attribute به Entity
 */
data class EntityAttributeMapping(
    val entityName: String,
    val attributeSchemas: List<AttributeSchema>
)
