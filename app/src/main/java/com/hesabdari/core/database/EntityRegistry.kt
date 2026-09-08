/*
================================================
نام فایل:
EntityRegistry.kt

وظیفه:
مدیریت Entity های قابل ثبت در Database Core.

ارتباط:
Module
    ↓
Entity Registry
    ↓
Database

نکات توسعه:
Entity اختصاصی کسب و کار نباید مستقیم وارد Core شود.
مواردی مانند IMEI یا FoodCost باید در Module مربوطه باشند.
================================================
*/

package com.hesabdari.core.database

/**
 * رجیستری اولیه Entity ها.
 * برای توسعه Database پویا آماده شده است.
 */
object EntityRegistry {

    private val entities = mutableListOf<String>()

    fun register(entityName: String) {
        if (!entities.contains(entityName)) {
            entities.add(entityName)
        }
    }

    fun getRegisteredEntities(): List<String> {
        return entities.toList()
    }
}
