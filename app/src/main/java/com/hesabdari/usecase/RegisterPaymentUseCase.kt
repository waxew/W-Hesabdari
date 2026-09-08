/*
================================================
نام فایل:
RegisterPaymentUseCase.kt

وظیفه:
ثبت فرآیند پرداخت در سیستم مالی.

ارتباط:
UI -> UseCase -> PaymentRepository

نکات توسعه:
پرداخت یک مفهوم عمومی حسابداری است و به Business Profile وابسته نیست.
================================================
*/

package com.hesabdari.usecase

import com.hesabdari.domain.payment.Payment
import com.hesabdari.data.repository.PaymentRepository

class RegisterPaymentUseCase(
    private val repository: PaymentRepository
) {
    suspend operator fun invoke(payment: Payment) {
        repository.insert(payment)
    }
}
