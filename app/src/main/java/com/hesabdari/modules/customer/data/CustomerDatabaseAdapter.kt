/*
================================================
نام فایل:
CustomerDatabaseAdapter.kt

وظیفه:
واسط ارتباط Customer Module با Database Core.

ارتباط:
CustomerRepositoryImpl -> Adapter -> CustomerDao

نکات توسعه:
این فایل نباید شامل منطق کسب و کار اختصاصی باشد.
اطلاعات مربوط به نوع کسب و کار باید از Business Profile دریافت شود.
================================================
*/

package com.hesabdari.modules.customer.data

class CustomerDatabaseAdapter(
    private val customerDao: CustomerDao
) {
    // عملیات دیتابیس مشتری در این لایه قرار می گیرد.
}
