/*
================================================
نام فایل:
ModuleRegistry.kt

وظیفه:
مدیریت ماژول‌های فعال در Business Profile.

ارتباط:
- BusinessRegistry
- BusinessProfile
- ModuleDefinition

نکات توسعه:
این کلاس تعیین می‌کند چه قابلیت‌هایی در یک نسخه فعال باشند.
منطق خود ماژول‌ها در Core یا Module مربوطه قرار می‌گیرد.
================================================
*/

package com.hesabdari.business_profile.registry

import com.hesabdari.business_profile.module.ModuleDefinition

class ModuleRegistry {

    private val modules = mutableListOf<ModuleDefinition>()

    fun register(module: ModuleDefinition) {
        modules.add(module)
    }

    fun getActiveModules(): List<ModuleDefinition> {
        return modules.filter { it.enabled }
    }
}
