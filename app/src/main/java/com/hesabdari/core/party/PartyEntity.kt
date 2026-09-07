/*
================================================

File:
PartyEntity.kt

Module:
Core Party Management

وظیفه:
مدل اصلی اشخاص مرتبط با حسابداری.

این کلاس عمدا مستقل از نوع کسب و کار طراحی شده است.
می تواند برای مشتری، تامین کننده، کارمند یا شریک استفاده شود.

================================================
*/

package com.hesabdari.core.party


/**
 * موجودیت پایه طرف حساب.
 *
 * در آینده به جدول Room Database متصل خواهد شد.
 */
data class PartyEntity(

    // شناسه داخلی طرف حساب
    val id: Long = 0,

    // نام شخص یا مجموعه
    val name: String,

    // شماره تماس
    val phone: String? = null,

    // نوع طرف حساب
    // CUSTOMER
    // SUPPLIER
    // EMPLOYEE
    // PARTNER
    val partyType: String,

    // آدرس
    val address: String? = null,

    // توضیحات اضافی
    val note: String? = null,

    // زمان ایجاد رکورد
    val createdAt: Long
)
