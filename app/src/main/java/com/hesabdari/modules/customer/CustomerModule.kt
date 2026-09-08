/*
================================================
نام فایل:
CustomerModule.kt

وظیفه:
ماژول عمومی مدیریت مشتری و اشخاص.

ارتباط:
این قابلیت توسط Profile های مختلف قابل فعال شدن است.

نکات توسعه:
مشتری به نوع کسب و کار وابسته نیست.
================================================
*/

package com.hesabdari.modules.customer

import com.hesabdari.modules.core.Module

class CustomerModule : Module {

    override val moduleId: String = "customer"

    override fun initialize() {
        // راه اندازی اولیه ماژول مشتری
    }
}
