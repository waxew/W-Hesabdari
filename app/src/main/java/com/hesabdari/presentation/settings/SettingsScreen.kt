/*
================================================
نام فایل:
SettingsScreen.kt

وظیفه:
صفحه تنظیمات عمومی نرم افزار.

ارتباط:
Business Profile و تنظیمات برنامه

نکات توسعه:
تنظیمات کسب و کار نباید داخل Core ذخیره شود و باید از Profile دریافت شود.
================================================
*/

package com.hesabdari.presentation.settings

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SettingsScreen() {
    Text(text = "تنظیمات برنامه")
}
