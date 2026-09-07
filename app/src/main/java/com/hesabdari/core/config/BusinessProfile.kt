/*
================================================
File: BusinessProfile.kt

وظیفه:
مدیریت تمام اطلاعات متغیر مربوط به کسب و کار.

این فایل نباید شامل منطق حسابداری باشد.
فقط اطلاعات برند، ظاهر و تنظیمات هر نسخه را نگهداری می کند.

با تغییر این فایل می توان نسخه جدیدی از نرم افزار برای کسب و کار متفاوت تولید کرد.

مثال:
- فروشگاه ۱
- سالن فشیال ۳
- موبایل فروشی ۲
================================================
*/

package com.hesabdari.core.config


data class BusinessProfile(

    // شناسه یکتا برای هر کسب و کار
    val businessId: String,

    // نام نمایشی کسب و کار
    val businessName: String,

    // نام پکیج برنامه تولید شده
    val packageName: String,

    // مسیر لوگو
    val logo: String,

    // رنگ اصلی برنامه
    val primaryColor: String,

    // ماژول های فعال
    val enabledModules: List<String>
)
