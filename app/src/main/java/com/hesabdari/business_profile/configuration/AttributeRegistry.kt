/*
================================================
نام فایل:
AttributeRegistry.kt

وظیفه:
مدیریت Attribute Schema های پویا.

ارتباط:
Business Profile -> Attribute Registry -> Entity Attributes

نکات توسعه:
Attribute ها نباید به صورت Field ثابت در Core Entity قرار بگیرند.
================================================
*/
package com.hesabdari.business_profile.configuration

class AttributeRegistry {

    private val attributes = mutableMapOf<String, AttributeSchema>()

    fun register(attribute: AttributeSchema) {
        attributes[attribute.name] = attribute
    }

    fun get(name: String): AttributeSchema? {
        return attributes[name]
    }

    fun getAll(): List<AttributeSchema> {
        return attributes.values.toList()
    }
}
