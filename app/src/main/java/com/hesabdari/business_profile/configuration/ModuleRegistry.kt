/*
================================================
نام فایل:
ModuleRegistry.kt

وظیفه:
ثبت و مدیریت Module های قابل استفاده در سیستم.

ارتباط:
Business Profile -> Module Registry -> Active Modules

نکات توسعه:
این Registry فقط مدیریت فعال بودن Module ها را انجام می دهد.
منطق Module ها باید داخل Package مستقل خودشان باشد.
================================================
*/
package com.hesabdari.business_profile.configuration

class ModuleRegistry {

    private val modules = mutableMapOf<String, ModuleDefinition>()

    fun register(module: ModuleDefinition) {
        modules[module.moduleId] = module
    }

    fun get(moduleId: String): ModuleDefinition? {
        return modules[moduleId]
    }

    fun getAll(): List<ModuleDefinition> {
        return modules.values.toList()
    }
}
