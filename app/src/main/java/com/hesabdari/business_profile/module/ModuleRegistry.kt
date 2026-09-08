/*
================================================
نام فایل:
ModuleRegistry.kt

وظیفه:
مدیریت Module های فعال هر Business Profile.

ارتباط:
- BusinessProfile
- ModuleDefinition

نکات توسعه:
Module دارای منطق و Workflow است.
نباید با Attribute Schema ترکیب شود.
================================================
*/

package com.hesabdari.business_profile.module

class ModuleRegistry {

    private val modules = mutableMapOf<String, List<ModuleDefinition>>()

    fun register(profileId: String, definitions: List<ModuleDefinition>) {
        modules[profileId] = definitions
    }

    fun getModules(profileId: String): List<ModuleDefinition> {
        return modules[profileId] ?: emptyList()
    }
}
