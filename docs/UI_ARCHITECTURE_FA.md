# معماری رابط کاربری حسابداری

## هدف

لایه UI مستقل از هسته حسابداری طراحی می‌شود.

مسیر ارتباط:

UI

↓

ViewModel

↓

UseCase

↓

Repository

↓

Database

## قوانین

- UI نباید شامل منطق مالی باشد.
- نوع کسب‌وکار نباید داخل Screen ها Hard Code شود.
- ظاهر برنامه از Business Profile دریافت می‌شود.
- قابلیت‌های اختصاصی در Module مربوطه توسعه داده می‌شوند.

## صفحات اصلی

- Dashboard
- Invoice
- Customer
- Payment
- Reports
- Settings
