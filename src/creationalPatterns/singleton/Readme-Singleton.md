# Singleton Pattern

Singletonun əsas məqsədi bir klassın yalnız və yalnız bir instance olmasını təmin etmək və bu nüsxəyə qlobal giriş
imkanı verməkdir.

## Niyə bizə Singleton lazımdır?

Singleton adətən iki problemi həll edir:

1. Ümumi resursa nəzarət:
   Təsəvvür edin ki, proqramınızda verilənlər bazası (database) var. Hər dəfə proqramın müxtəlif yerlərindən bazaya
   qoşulmaq üçün new DatabaseConnection() edib yeni obyekt yaratsanız, sistem çox yüklənəcək, ola bilsin ki, baza
   çökəcək. Bunun əvəzinə, bircə dənə əlaqə yaradıb, hamının o əlaqədən istifadə etməsi daha məqsədəuyğundur.

2. Qlobal giriş nöqtəsi:
   Qlobal dəyişənlər (global variables) proqramlaşdırmada təhlükəlidir, çünki kodun istənilən yerindən onu kimsə səhvən
   dəyişə bilər. Singleton isə həm qlobal əlçatanlıq verir (istənilən yerdən çağırmaq olur), həm də obyekti qoruyur (heç
   kim onu əzə bilmir, sadəcə istifadə edə bilir).

## Singleton necə işləyir?

Bu patterni tətbiq etmək üçün iki əsas qayda var:

1. Konstruktoru gizlətmək (private constructor):
   Adətən biz obyekt yaratmaq üçün new MyClass() yazırıq. Singleton patternində biz konstruktoru private (məxfi) edirik
   ki, kənardan heç kim new sözündən istifadə edib yeni obyekt yarada bilməsin.

2. Statik metod yaratmaq (static method):
   Klassın daxilində getInstance() adında statik bir method yaradılır. Bu metod:
   Əgər obyekt hələ yoxdursa -> Yaradır, dəyişəndə saxlayır və qaytarır.
   Əgər obyekt artıq varsa -> Saxlanılan obyekti qaytarır.

## Singleton patternin neçə növü var?

1. Eager initialization: Instance class load olunan zamanı yaradılır ki, bu da sadədir, lakin lazım olmasa belə
   resurslardan istifadə edir.

2. Lazy initialization: Instance yalnız getInstance() metodu ilk dəfə çağırıldıqda yaradılır.

3. Static block initialization: Eager initialization-a bənzəyir lakin yaradılma zamanı exceptionları handlle etməyə
   imkan verir

4. Thread-safe singleton (Synchronized Method): Multithread mühitlərdə yalnız bir instancenin yaradılmasını təmin
   etmək üçün *synchronized* keyword istifadə edir, amma bu hər dəfə instanceni çağıranda lock səbəbindən performansı
   azalda bilər

5. Double-checked locking: *synchronized* cəhətdən performans itkisini minimuma endirir.

6. Enum singleton: Java-da singleton tətbiq etməyin ən möhkəm və qısa yolu hesab olunur, serialization və thread-safe
   təhlükəsizliyini təmin edir.

7. Bill Pugh Singleton: Açıq synchronized olmadan lazy instance və thread-safe təmin etmək üçün statik inner sinifdən
   istifadə edir. 
