/*
================================================
نام فایل:
ModuleRegistry.kt

وظیفه:
مدیریت ثبت و دسترسی به Module های فعال.

ارتباط:
Business Profile -> Module Activation -> Registry

نکات توسعه:
این Registry نباید نوع کسب و کار را بشناسد.
================================================
*/

package com.hesabdari.modules.core

class ModuleRegistry {

    private val modules = mutableMapOf<String, Module>()

    fun register(module: Module) {
        modules[module.moduleId] = module
    }

    fun get(moduleId: String): Module? {
        return modules[moduleId]
    }

    fun getAll(): List<Module> {
        return modules.values.toList()
    }
}
