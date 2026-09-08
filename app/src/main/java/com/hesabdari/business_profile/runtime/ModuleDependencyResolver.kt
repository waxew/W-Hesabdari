/*
================================================
نام فایل:
ModuleDependencyResolver.kt

وظیفه:
مدیریت وابستگی بین Module ها.

ارتباط:
Module Registry -> Dependency Resolver -> Module Loader

نکات توسعه:
برای جلوگیری از فعال شدن Module بدون وابستگی های لازم استفاده می شود.
================================================
*/

package com.hesabdari.business_profile.runtime

class ModuleDependencyResolver {

    fun validateDependencies(
        moduleId: String,
        activeModules: Set<String>,
        dependencies: Map<String, List<String>>
    ): Boolean {

        val requiredModules = dependencies[moduleId] ?: emptyList()

        return requiredModules.all {
            activeModules.contains(it)
        }
    }
}
