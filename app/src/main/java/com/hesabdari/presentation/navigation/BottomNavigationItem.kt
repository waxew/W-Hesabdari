/*
================================================
نام فایل:
BottomNavigationItem.kt

وظیفه:
تعریف آیتم‌های منوی پایین برنامه.

ارتباط:
این فایل فقط لایه نمایش را مدیریت می‌کند و هیچ وابستگی به Core حسابداری ندارد.

نکات توسعه:
صفحات و قابلیت‌ها از طریق Navigation به ViewModel و UseCase متصل می‌شوند.
================================================
*/

package com.hesabdari.presentation.navigation

sealed class BottomNavigationItem(val route: String, val title: String) {
    object Dashboard : BottomNavigationItem("dashboard", "داشبورد")
    object Invoice : BottomNavigationItem("invoice", "فاکتور")
    object Customer : BottomNavigationItem("customer", "اشخاص")
    object Reports : BottomNavigationItem("reports", "گزارش‌ها")
    object Settings : BottomNavigationItem("settings", "تنظیمات")
}
