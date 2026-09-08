/*
================================================
نام فایل:
AppTheme.kt
وظیفه:
تم اصلی رابط کاربری برنامه.
این فایل برای جداسازی ظاهر از منطق برنامه ایجاد شده است.
در آینده رنگ، لوگو و ظاهر از Business Profile خوانده خواهد شد.
================================================
*/

package com.hesabdari.presentation.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun HesabdariTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        content = content
    )
}
