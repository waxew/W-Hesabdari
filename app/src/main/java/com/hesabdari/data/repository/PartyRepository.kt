/*
================================================
نام فایل:
PartyRepository.kt

وظیفه:
تعریف قرارداد مدیریت اشخاص سیستم.

ارتباط:
Party Domain -> Repository -> Data Layer

نکات توسعه:
Customer و Supplier در معماری جدید نقش‌های Party هستند
و نباید Entityهای جدا و وابسته به کسب‌وکار ایجاد شوند.
================================================
*/

package com.hesabdari.data.repository

import com.hesabdari.domain.party.Party

interface PartyRepository {
    suspend fun save(party: Party)
    suspend fun getAll(): List<Party>
}
