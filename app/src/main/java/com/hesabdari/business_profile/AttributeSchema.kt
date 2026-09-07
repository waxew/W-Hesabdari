/*
نام فایل:
AttributeSchema.kt

وظیفه:
تعریف فیلدهای پویا که وابسته به کسب و کار هستند.

ارتباط:
Business Profile این Schema ها را برای Entity ها فعال می کند.

نکات توسعه:
این اطلاعات نباید به صورت Column ثابت در Core Entity قرار بگیرند.
*/

package com.hesabdari.business_profile


data class AttributeSchema(
    val entityName: String,
    val key: String,
    val title: String,
    val dataType: String,
    val required: Boolean = false
)
