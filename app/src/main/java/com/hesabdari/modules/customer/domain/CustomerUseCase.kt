/*
================================================
نام فایل:
CustomerUseCase.kt

وظیفه:
لایه عملیات مشتری.

ارتباط:
UI از UseCase استفاده می‌کند و مستقیماً با Repository ارتباط ندارد.

نکات توسعه:
Workflow های مشتری در این لایه قرار می‌گیرند.
منطق Core Accounting نباید وارد این قسمت شود.
================================================
*/

package com.hesabdari.modules.customer.domain

import com.hesabdari.modules.customer.data.CustomerRepository

class CustomerUseCase(
    private val repository: CustomerRepository
) {

    suspend fun createCustomer(customer: Customer) {
        repository.save(customer)
    }

    suspend fun loadCustomers(): List<Customer> {
        return repository.getAll()
    }
}
