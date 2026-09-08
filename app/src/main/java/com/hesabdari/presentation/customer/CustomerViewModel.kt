/*
================================================
نام فایل:
CustomerViewModel.kt

وظیفه:
مدیریت وضعیت صفحه اشخاص سیستم.

ارتباط:
Customer UI -> ViewModel -> CreatePartyUseCase

نکات توسعه:
در Core مفهوم عمومی Party وجود دارد.
Customer فقط یک Role از Party است و وابسته به نوع کسب‌وکار نیست.
================================================
*/

package com.hesabdari.presentation.customer

import androidx.lifecycle.ViewModel

class CustomerViewModel : ViewModel() {

    // عملیات دریافت و ثبت Party در مراحل بعدی اضافه می‌شود.
}
