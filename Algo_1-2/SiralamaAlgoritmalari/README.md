# Sıralama Algoritmaları Performans Karşılaştırması

Bu proje, farklı sıralama algoritmalarının performansını Java dilinde karşılaştırmak amacıyla oluşturulmuştur. Proje, büyük bir tamsayı dizisi üzerinde Selection Sort, Insertion Sort ve Merge Sort algoritmalarının çalışma sürelerini ölçer.

## İçindekiler

- [Hakkında](#hakkında)
- [Uygulanan Algoritmalar](#uygulanan-algoritmalar)
- [Nasıl Çalışır?](#nasıl-çalışır)
- [Nasıl Çalıştırılır?](#nasıl-çalıştırılır)
- [Notlar](#notlar)

## Hakkında

Bu program, 100.000 rastgele tamsayıdan oluşan bir dizi oluşturur. Ardından bu dizinin kopyaları üzerinde aşağıdaki sıralama algoritmalarını çalıştırarak her birinin ne kadar sürede tamamlandığını milisaniye cinsinden ölçer ve konsola yazdırır:

- Selection Sort
- Insertion Sort
- Merge Sort

Bu sayede, farklı sıralama algoritmalarının aynı veri seti üzerindeki verimlilikleri gözlemlenebilir.

## Uygulanan Algoritmalar

Kod içerisinde aşağıdaki sıralama algoritmaları bulunmaktadır:

- `SelectionSort`: Diziyi tarayarak en küçük elemanı bulur ve doğru konuma yerleştirir. Bu işlemi dizi sıralanana kadar tekrarlar.
- `InsertionSort`: Diziyi baştan sona tarar ve her elemanı kendisinden önceki sıralı kısımdaki doğru yerine ekler.
- `MergeSort`: Diziyi özyinelemeli olarak ikiye böler ve ardından bu parçaları sıralı bir şekilde birleştirir.
- `BubbleSort`: Komşu elemanları karşılaştırıp yer değiştirerek diziyi sıralar. (Not: Bu metot kodda mevcut olmasına rağmen ana akışta çağırılmamaktadır.)

## Nasıl Çalışır?

1.  `main` metodu, 100.000 elemanlı ve 0-99999 arasında rastgele sayılarla doldurulmuş bir tamsayı dizisi (`arr`) oluşturur.
2.  `ExecutionTime` metodu çağrılır. Bu metot, orijinal dizinin üç adet kopyasını oluşturur (`arr1`, `arr2`, `arr3`).
3.  Her bir sıralama algoritması (Selection, Insertion, Merge), kendi kopyası üzerinde çalıştırılır.
4.  Her bir çalıştırma öncesi ve sonrası sistem zamanı (`System.currentTimeMillis()`) alınarak algoritmanın ne kadar sürdüğü hesaplanır.
5.  Her bir algoritmanın çalışma süresi konsola "Geçen zaman: X msec" formatında yazdırılır.

## Nasıl Çalıştırılır?

1.  Dosyayı `MehmetEmreÖk_23010310055_Sort.java` olarak kaydedin.
2.  Bir terminal veya komut istemi açın ve aşağıdaki komutla dosyayı derleyin:
    ```bash
    javac MehmetEmreÖk_23010310055_Sort.java
    ```
3.  Derleme başarılı olduktan sonra, programı çalıştırmak için aşağıdaki komutu kullanın:
    ```bash
    java ödev6.MehmetEmreÖk_23010310055_Sort
    ```
4.  Program çalışacak ve sıralama sürelerini konsola yazdıracaktır.

## Notlar

-   `MergeSort` metodunun içerisinde, sıralanmış alt dizileri birleştirmesi gereken `merge` metodu çağrısı yorum satırı (`//`) haline getirilmiştir. Bu nedenle `MergeSort` tam olarak çalışmayacak ve sıralama işlemini tamamlamayacaktır. Sadece diziyi bölme işlemini yapacaktır.
-   Kodda bir `BubbleSort` metodu tanımlanmış olmasına rağmen, bu metot `ExecutionTime` metodu içerisinde çağırılmadığı için çalışma süresi ölçülmemektedir.