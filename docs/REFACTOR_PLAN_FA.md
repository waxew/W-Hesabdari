# برنامه Refactor معماری W-Hesabdari

## هدف

حذف وابستگی Core به کسب و کارها و تبدیل پروژه به یک پلتفرم حسابداری قابل پیکربندی.

## مراحل

1. جداسازی Core از Business Profile
2. حذف نام های کسب و کاری از Package و Class
3. ایجاد Module Registry
4. ایجاد Attribute Schema Engine
5. اتصال Business Profile به Configuration Engine
6. توسعه Accounting Core مستقل

## قوانین

Business Profile مشخص می کند:

- چه Module هایی فعال هستند.
- چه Attribute Schema هایی وجود دارند.
- چه تنظیمات ظاهری و مالی استفاده شود.

Core فقط منطق عمومی را نگهداری می کند.
