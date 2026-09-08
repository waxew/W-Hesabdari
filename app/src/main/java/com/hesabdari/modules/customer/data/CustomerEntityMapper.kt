/*
================================================
نام فایل:
CustomerEntityMapper.kt

وظیفه:
تبدیل مدل Domain مشتری به مدل ذخیره سازی Database و بالعکس.

ارتباط:
Customer Domain <-> Customer Entity

نکات توسعه:
این Mapper نباید اطلاعات اختصاصی کسب و کارها را بداند.
ویژگی هایی مانند Attribute Schema از Business Profile تامین می شوند.
================================================
*/

package com.hesabdari.modules.customer.data

import com.hesabdari.modules.customer.domain.Customer

object CustomerEntityMapper {

    fun toDomain(entity: CustomerEntity): Customer {
        return Customer(
            id = entity.id,
            name = entity.name,
            phone = entity.phone,
            email = entity.email
        )
    }

    fun toEntity(domain: Customer): CustomerEntity {
        return CustomerEntity(
            id = domain.id,
            name = domain.name,
            phone = domain.phone,
            email = domain.email
        )
    }
}
