# معماری Module و Attribute Schema

## هدف

هسته حسابداری نباید وابسته به نوع کسب و کار باشد.

دو مفهوم از هم جدا هستند:

## Module

برای قابلیت هایی که دارای منطق، فرآیند و Workflow هستند.

نمونه:

- Accounting
- Invoice
- Payment
- Inventory
- IMEI
- Warranty
- Repair
- Reservation
- Delivery

Module دارای منطق اجرایی، سرویس، قوانین و عملیات است.

## Attribute Schema

برای اطلاعات توصیفی و متغیر است.

نمونه:

- Size
- Color
- Material
- Volume
- Expiration Date
- Serial Number

این موارد نباید Field ثابت در Core Entity باشند.

## قانون Core

Core فقط اطلاعات عمومی را نگهداری می کند.

Business Profile تعیین می کند:

1. چه Module هایی فعال باشند.
2. چه Attribute Schema هایی برای Entity ها فعال باشند.
