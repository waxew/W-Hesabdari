# موتور هسته حسابداری (Accounting Core Engine)

## هدف

این بخش هسته عمومی حسابداری پروژه است و نباید وابستگی به نوع کسب‌وکار داشته باشد.

## موجودیت‌های اصلی

- Account
- Transaction
- Ledger
- Journal Entry
- Invoice
- Payment
- Party
- Report

## قانون معماری

نام کسب‌وکارها فقط در Business Profile قرار می‌گیرند.

Core نباید شامل نام‌هایی مانند:

- mobile
- beauty
- restaurant
- store

باشد.

## جریان مالی

Invoice -> Payment -> Journal Entry -> Ledger -> Report
