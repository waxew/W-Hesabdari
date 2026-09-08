package com.hesabdari.domain.accounting_engine

/*
================================================
نام فایل:
DebitCreditValidator.kt

وظیفه:
اعتبارسنجی قوانین ثبت دوبل حسابداری.

ارتباط:
JournalEntry -> DebitCreditValidator -> Ledger

نکات توسعه:
در سیستم حسابداری استاندارد مجموع بدهکار و بستانکار هر سند باید برابر باشد.
این منطق مستقل از نوع کسب و کار است.
================================================
*/

object DebitCreditValidator {

    /**
     * بررسی تراز بودن سند حسابداری.
     */
    fun isBalanced(lines: List<JournalLine>): Boolean {
        val debit = lines.sumOf { it.debitAmount }
        val credit = lines.sumOf { it.creditAmount }

        return debit == credit
    }
}
