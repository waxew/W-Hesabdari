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
این لایه مسئول هماهنگی داده بین Domain و Storage است.
================================================
*/

package com.hesabdari.modules.customer.data

class CustomerDatabaseAdapter(
    private val customerDao: CustomerDao
) {
    fun getDao(): CustomerDao {
        return customerDao
    }
}
