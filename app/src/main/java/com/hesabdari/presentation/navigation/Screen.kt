package com.hesabdari.presentation.navigation

/*
================================================
نام فایل:
Screen.kt
وظیفه:
تعریف مسیرهای اصلی صفحات برنامه.

ارتباط:
این فایل فقط Navigation را مدیریت می‌کند و
هیچ منطق حسابداری در آن قرار نمی‌گیرد.

نکات توسعه:
صفحات جدید باید به صورت Route اضافه شوند.
================================================
*/

sealed class Screen(val route: String) {
    data object Dashboard : Screen("dashboard")
    data object Invoice : Screen("invoice")
    data object Customer : Screen("customer")
    data object Payment : Screen("payment")
    data object Reports : Screen("reports")
    data object Settings : Screen("settings")
}
