/*
================================================
نام فایل:
CustomerRepositoryImpl.kt

وظیفه:
پیاده سازی Repository مشتری.

ارتباط:
UseCase -> Repository -> DAO -> Database

نکات توسعه:
تبدیل Entity به Domain Model در این لایه انجام می‌شود.
================================================
*/

package com.hesabdari.modules.customer.data

import com.hesabdari.modules.customer.domain.Customer

class CustomerRepositoryImpl(
    private val dao: CustomerDao
) : com.hesabdari.modules.customer.data.CustomerRepository {

    override suspend fun create(customer: Customer) {
        dao.insert(
            CustomerEntity(
                id = customer.id,
                name = customer.name,
                phone = customer.phone,
                email = customer.email
            )
        )
    }

    override suspend fun getAll(): List<Customer> {
        return dao.getAll().map {
            Customer(
                id = it.id,
                name = it.name,
                phone = it.phone,
                email = it.email
            )
        }
    }
}
