/*
================================================
نام فایل:
ModuleLoader.kt

وظیفه:
بارگذاری Module های مورد نیاز بر اساس Business Profile.

ارتباط:
Business Profile -> Module Activation -> Module Loader

نکات توسعه:
این کلاس فقط هماهنگ کننده است.
منطق هر Module داخل خود Module قرار دارد.
================================================
*/

package com.hesabdari.business_profile.runtime

import com.hesabdari.modules.core.Module

class ModuleLoader {

    fun loadModules(
        availableModules: List<Module>,
        activeModuleIds: Set<String>
    ): List<Module> {
        return availableModules.filter {
            activeModuleIds.contains(it.moduleId)
        }
    }
}
