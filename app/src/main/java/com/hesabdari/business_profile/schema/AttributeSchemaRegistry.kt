/*
================================================
نام فایل:
AttributeSchemaRegistry.kt

وظیفه:
مدیریت Schema های ویژگی های پویا برای Business Profile.

ارتباط:
- BusinessProfile
- AttributeDefinition
- Core Entity ها

نکات توسعه:
این فایل نباید شامل اطلاعات یک کسب و کار خاص باشد.
ویژگی ها فقط از طریق Profile فعال می شوند.
================================================
*/

package com.hesabdari.business_profile.schema

class AttributeSchemaRegistry {

    private val schemas = mutableMapOf<String, List<AttributeDefinition>>()

    fun register(profileId: String, attributes: List<AttributeDefinition>) {
        schemas[profileId] = attributes
    }

    fun getSchema(profileId: String): List<AttributeDefinition> {
        return schemas[profileId] ?: emptyList()
    }
}
