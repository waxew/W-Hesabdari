/*
================================================
نام فایل:
PaymentScreen.kt

وظیفه:
صفحه نمایش مدیریت پرداخت‌ها در برنامه حسابداری.

ارتباط:
PaymentViewModel -> RegisterPaymentUseCase -> Repository

نکات توسعه:
این فایل فقط مسئول UI است و منطق مالی نباید داخل آن قرار گیرد.
================================================
*/

package com.hesabdari.presentation.payment

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun PaymentScreen() {
    Text(text = "مدیریت پرداخت‌ها")
}
