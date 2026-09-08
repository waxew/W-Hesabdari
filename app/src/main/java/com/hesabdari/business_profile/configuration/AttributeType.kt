/*
================================================
نام فایل:
AttributeType.kt

وظیفه:
تعریف نوع داده Attribute Schema.

ارتباط:
AttributeSchema -> Entity Dynamic Attributes

نکات توسعه:
Attribute ها فقط داده هستند و نباید به صورت Field ثابت در Core Entity قرار بگیرند.
================================================
*/

package com.hesabdari.business_profile.configuration


enum class AttributeType {
    STRING,
    NUMBER,
    DATE,
    BOOLEAN,
    SELECT,
    IMAGE
}
