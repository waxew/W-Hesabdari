/*
================================================
نام فایل:
ErrorMapper.kt

وظیفه:
تبدیل خطاهای داخلی به پیام استاندارد برنامه.

ارتباط:
Repository / UseCase -> ErrorMapper -> UI

نکات توسعه:
این فایل نباید شامل قوانین کسب و کار باشد.
================================================
*/

package com.hesabdari.core.result

object ErrorMapper {
    fun map(error: Throwable): String {
        return error.message ?: "خطای نامشخص رخ داده است"
    }
}
