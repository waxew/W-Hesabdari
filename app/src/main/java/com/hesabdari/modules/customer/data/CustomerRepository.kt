/*
================================================
نام فایل:
CustomerRepository.kt

وظیفه:
قرارداد دسترسی به اطلاعات مشتری.

ارتباط:
Presentation و UseCase فقط از این Interface استفاده می‌کنند.
پیاده‌سازی دیتابیس در لایه Data انجام می‌شود.

نکات توسعه:
Repository نباید منطق حسابداری یا منطق کسب‌وکار خاص داشته باشد.
================================================
*/

package com.hesabdari.modules.customer.data

import com.hesabdari.modules.customer.domain.Customer

interface CustomerRepository {

    suspend fun save(customer: Customer)

    suspend fun getAll(): List<Customer>
}
