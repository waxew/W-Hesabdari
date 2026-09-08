/*
================================================
نام فایل:
BusinessThemeConfig.kt

وظیفه:
تعریف تنظیمات ظاهری قابل تغییر بر اساس Business Profile.

ارتباط:
Business Profile اطلاعات برند را تامین می‌کند و UI فقط این تنظیمات را مصرف می‌کند.

نکات توسعه:
رنگ، نام نرم‌افزار، لوگو و ظاهر نباید داخل Core حسابداری قرار گیرد.
================================================
*/

package com.hesabdari.presentation.theme


data class BusinessThemeConfig(
    val applicationName: String,
    val primaryColor: String,
    val logoPath: String?
)
