/*
================================================
نام فایل:
MainActivity.kt

وظیفه:
نقطه شروع رابط کاربری اندروید.
این فایل فقط مسئول راه‌اندازی Compose و اتصال Navigation است.

ارتباط:
MainActivity
        ↓
AppNavigation
        ↓
Compose Screens

نکات توسعه:
منطق حسابداری نباید داخل Activity قرار گیرد.
تمام عملیات مالی در Domain و UseCase مدیریت می‌شود.
================================================
*/

package com.hesabdari.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.hesabdari.presentation.navigation.AppNavigation
import com.hesabdari.presentation.theme.AppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AppTheme {
                AppNavigation()
            }
        }
    }
}
