/*
================================================
نام فایل:
GenerateLedgerUseCase.kt

وظیفه:
مدیریت فرآیند تولید دفتر کل از تراکنش ها.

ارتباط:
Transaction -> Ledger

نکات توسعه:
این بخش در Core حسابداری قرار دارد و مستقل از نوع کسب و کار است.
================================================
*/

package com.hesabdari.usecase

import com.hesabdari.domain.ledger.Ledger

class GenerateLedgerUseCase {
    operator fun invoke(): Ledger {
        return Ledger()
    }
}
