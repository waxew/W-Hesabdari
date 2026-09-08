/*
================================================
نام فایل:
ModuleActivationResolver.kt

وظیفه:
تشخیص Moduleهای فعال بر اساس Business Profile.

ارتباط:
BusinessProfile -> ModuleRegistry -> Runtime

نکات توسعه:
Moduleهای اختصاصی نباید وارد Core شوند.
================================================
*/
package com.hesabdari.business_profile.runtime

class ModuleActivationResolver {
    fun isEnabled(moduleId: String, activeModules: List<String>): Boolean {
        return activeModules.contains(moduleId)
    }
}
