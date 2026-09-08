# استاندارد نام گذاری پروژه W-Hesabdari

## قانون اصلی

هسته نرم افزار حسابداری نباید وابسته به نوع کسب و کار باشد.

نام هایی مانند:

- mobile
- beauty
- restaurant
- store

نباید در Package، Entity، Repository، Service و Core استفاده شوند.

این موارد فقط داخل Business Profile تعریف می شوند.

## نمونه صحیح

Product
Invoice
Party
WarrantyService
InventoryService

## نمونه اشتباه

MobileProduct
BeautyCustomer
StoreInvoice

## معماری

Core وظیفه منطق عمومی را دارد و Business Profile فقط تنظیمات نسخه کسب و کار را مشخص می کند.
