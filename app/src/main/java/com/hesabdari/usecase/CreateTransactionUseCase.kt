/*
================================================
نام فایل:
CreateTransactionUseCase.kt

وظیفه:
مدیریت فرآیند ایجاد تراکنش مالی در لایه کاربردی.

ارتباط:
UI -> UseCase -> Repository -> Data Layer

نکات توسعه:
این کلاس مستقل از نوع کسب و کار است و نباید شامل
منطق مربوط به فروشگاه، موبایل یا هر Business Profile باشد.
================================================
*/

package com.hesabdari.usecase

import com.hesabdari.domain.transaction.Transaction
import com.hesabdari.data.repository.TransactionRepository

class CreateTransactionUseCase(
    private val repository: TransactionRepository
) {
    suspend operator fun invoke(transaction: Transaction) {
        repository.insert(transaction)
    }
}
