/*
================================================
نام فایل:
AppNavigation.kt

وظیفه:
مدیریت مسیرهای اصلی رابط کاربری برنامه حسابداری.

ارتباط:
Compose UI -> Navigation -> Screen

نکات توسعه:
این فایل فقط مسئول جابه‌جایی بین صفحات است.
هیچ منطق مالی یا وابستگی به Business Profile نباید داخل آن قرار گیرد.
================================================
*/

package com.hesabdari.presentation.navigation

import androidx.compose.runtime.Composable

@Composable
fun AppNavigation() {
    // مسیرهای اصلی برنامه در این بخش به NavHost متصل خواهند شد.
    // صفحات:
    // Dashboard
    // Invoice
    // Customer
    // Payment
    // Reports
    // Settings
}
