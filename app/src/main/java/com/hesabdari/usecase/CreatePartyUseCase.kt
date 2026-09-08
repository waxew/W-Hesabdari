/*
================================================
نام فایل:
CreatePartyUseCase.kt

وظیفه:
مدیریت ایجاد شخص در سیستم.

ارتباط:
UI -> UseCase -> PartyRepository

نکات توسعه:
Party یک مفهوم عمومی است و می‌تواند نقش‌های مختلف
مانند مشتری یا تامین کننده داشته باشد.
================================================
*/

package com.hesabdari.usecase

import com.hesabdari.domain.party.Party
import com.hesabdari.data.repository.PartyRepository

class CreatePartyUseCase(
    private val repository: PartyRepository
) {
    suspend operator fun invoke(party: Party) {
        repository.insert(party)
    }
}
