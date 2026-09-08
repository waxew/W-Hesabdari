/*
================================================
نام فایل:
CustomerScreen.kt
وظیفه:
نمایش رابط کاربری مدیریت مشتری
ارتباط:
CustomerViewModel -> CustomerState -> این صفحه
نکات توسعه:
این فایل فقط UI است و منطق کسب‌وکار ندارد.
================================================
*/

package com.hesabdari.modules.customer.presentation

import androidx.compose.runtime.Composable

@Composable
fun CustomerScreen(
    state: CustomerState,
    onEvent: (CustomerEvent) -> Unit
) {
    // رابط کاربری مشتری در این بخش توسعه داده می‌شود.
    // نمایش لیست، جستجو و فرم مشتری به صورت مستقل از Core است.
}
