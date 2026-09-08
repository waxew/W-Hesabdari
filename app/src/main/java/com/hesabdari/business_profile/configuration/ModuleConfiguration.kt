/*
================================================
نام فایل:
ModuleConfiguration.kt

وظیفه:
تعریف ماژول های فعال برای هر Business Profile.

ارتباط:
BusinessProfile -> ModuleConfiguration -> Application

نکات توسعه:
ماژول ها دارای منطق و Workflow هستند و نباید داخل Core Entity قرار بگیرند.
================================================
*/

package com.hesabdari.business_profile.configuration


data class ModuleConfiguration(
    val enabledModules: List<String>
)
