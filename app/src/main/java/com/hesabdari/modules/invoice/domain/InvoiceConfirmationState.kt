package com.hesabdari.modules.invoice.domain

/**
 * وضعیت تایید فاکتور قبل از ارسال به جریان حسابداری.
 */
enum class InvoiceConfirmationState {
    DRAFT,
    CONFIRMED,
    POSTED
}
