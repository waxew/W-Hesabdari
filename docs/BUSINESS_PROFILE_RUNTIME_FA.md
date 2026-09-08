# معماری Business Profile Runtime

## هدف

این بخش مسئول فعال سازی نسخه های مختلف نرم افزار حسابداری از یک Core مشترک است.

## جریان اجرا

```
Application Start
        |
        v
BusinessProfileInitializer
        |
        v
ProfileLoader
        |
        v
ProfileValidator
        |
        v
ActiveBusinessContext
        |
        v
RuntimeConfigurationManager
        |
        +---- ThemeResolver
        |
        +---- ModuleActivationResolver
        |
        +---- ConfigurationResolver
```

## قوانین معماری

- Core Accounting نباید نوع کسب و کار را بشناسد.
- Profile فقط تنظیمات و قابلیت های فعال را مشخص می کند.
- Moduleها منطق اختصاصی خود را نگهداری می کنند.
- Attribute Schema برای داده های متغیر استفاده می شود.

## ساخت نسخه جدید

برای ایجاد نسخه جدید:

1. یک Business Profile جدید تعریف شود.
2. Moduleهای مورد نیاز فعال شوند.
3. تنظیمات مالی و ظاهری تعیین شود.
4. بدون تغییر Core برنامه ساخته شود.
