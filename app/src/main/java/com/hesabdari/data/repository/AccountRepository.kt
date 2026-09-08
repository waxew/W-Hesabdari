/*
================================================
نام فایل:
AccountRepository.kt

وظیفه:
تعریف قرارداد دسترسی به اطلاعات حساب‌ها.

ارتباط:
Domain Account <- Repository <- Data Source

نکات توسعه:
این فایل نباید وابستگی به نوع کسب‌وکار داشته باشد.
================================================
*/

package com.hesabdari.data.repository

import com.hesabdari.domain.account.Account

interface AccountRepository {

    suspend fun save(account: Account)

    suspend fun getById(id: String): Account?

    suspend fun getAll(): List<Account>
}
