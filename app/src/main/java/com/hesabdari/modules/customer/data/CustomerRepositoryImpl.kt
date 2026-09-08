/*
================================================
نام فایل:
CustomerRepositoryImpl.kt

وظیفه:
پیاده سازی Repository مشتری.

ارتباط:
UseCase -> Repository -> Database Adapter -> DAO -> Database

نکات توسعه:
این لایه نباید منطق کسب و کار اختصاصی داشته باشد.
تبدیل Entity و Domain Model در همین لایه انجام می‌شود.
================================================
*/

package com.hesabdari.modules.customer.data

import com.hesabdari.modules.customer.domain.Customer

class CustomerRepositoryImpl(
    private val databaseAdapter: CustomerDatabaseAdapter
) : CustomerRepository {

    override suspend fun create(customer: Customer) {
        databaseAdapter.getDao().insert(
            CustomerEntityMapper.toEntity(customer)
        )
    }

    override suspend fun getAll(): List<Customer> {
        return databaseAdapter.getDao().getAll().map {
            CustomerEntityMapper.toDomain(it)
        }
    }
}
