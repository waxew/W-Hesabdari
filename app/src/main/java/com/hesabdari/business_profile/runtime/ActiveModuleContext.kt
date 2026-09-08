/*
================================================
نام فایل:
ActiveModuleContext.kt

وظیفه:
نگهداری وضعیت Module های فعال در زمان اجرای برنامه.

ارتباط:
Business Profile -> Module Resolver -> ActiveModuleContext -> Application

نکات توسعه:
این فایل شامل منطق Module نیست.
فقط وضعیت فعال بودن قابلیت ها را نگهداری می کند.
================================================
*/

package com.hesabdari.business_profile.runtime

class ActiveModuleContext {

    private val activeModules = mutableSetOf<String>()

    fun activate(moduleId: String) {
        activeModules.add(moduleId)
    }

    fun deactivate(moduleId: String) {
        activeModules.remove(moduleId)
    }

    fun isActive(moduleId: String): Boolean {
        return activeModules.contains(moduleId)
    }

    fun getActiveModules(): Set<String> {
        return activeModules.toSet()
    }
}
