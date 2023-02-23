package batch129.java.day36lambda;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Lambda03 {

    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>(Arrays.asList("Suleyman","Ebubekir","Ayse","Ada",
                "Okan","Semih","Gulsen","Ali","Zeynep","Semih","bilal","Abdullah","Abdulkadir"));
        /*
            allMatch() Mukemmeliyetcidir.butun elemanlar true dondururse sonuc true doner.
            1 eleman false olsa sonuc false dondurur
            anyMatch() en az true dondururse sonucu true dondurur
            noneMatch() hic bir eleman sartı saglamıyorsa true dondurur; 1 tanesi saglasa false dondurur

         */
        alfabetikBykTkrsz(isimler);
        System.out.println();
        chrctrtTrsTkrsz(isimler);
        System.out.println();
        chrctrKcktenByk(isimler);
        System.out.println();
        harfSays7denAz(isimler);
        System.out.println();
        wIleBslylr(isimler);
        System.out.println();
        xIleBtn(isimler);
        System.out.println();
        krktrEnBykElmn(isimler);
        System.out.println();
        snHrfIlkHrc(isimler);
        System.out.println();
        krktrSysCftKrTkrszNykKck(isimler);


    }//main
    // Yazdır Method Method Referance
    public static void yazdır( String a){
        System.out.println(a + " ");
    }
    //Task-1 = List elemanlarını lafabetik buyuk harf ve tekrarsız print ediniz.
    public static void alfabetikBykTkrsz( List<String> isimler){
        isimler.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted().
                forEach(t-> System.out.print(t + " "));
    }

   //Task-2 : List elemanlarının character sayısına ters sıralı olarak tekrarsız print ediniz.
    public  static void chrctrtTrsTkrsz( List<String> isimler){
        isimler.
                stream().//akısa alındı
                map(String::length).//karakter alır
                distinct().//benzersiz yapıldı
                sorted(Comparator.reverseOrder()).//ters sıralı
                forEach(t-> System.out.print(t + " "));
    }

   //Task -3: List elemanlarını,character sayısına gore kucukten buyugune gore print ediniz.
        public static void chrctrKcktenByk(List<String> isimler){
        isimler.stream().sorted(Comparator.comparing(String::length)).//String Dataları karsılastırdı
                forEach(t-> System.out.print(t + " "));
        }

   //Task -4 : List elemanlarının hepsinin karakter sayısının 7 ve 7'den az olma durumunu kontrol ediniz.
                public static void harfSays7denAz(List<String> isimler){
                    System.out.println(isimler.
                            stream().
                            allMatch(t -> t.length() <= 7) ? "list elemanları 7 ve 7den daha az harften olusuyor" :
                            "List elemanları 7 harften buyuk");
                }
    //-5 : List elemanlarının hepsinin "w" ile baslamasını noneMatch() ile kontrol ediniz.
            public static void wIleBslylr(List<String> isimler){
                System.out.println(isimler.stream().noneMatch(t -> t.startsWith("w")) ?
                        "w il baslayan isim bizde olmaz" : " w ile baslayan isimler");
            }

    //-6 : List elemanlarının "x" ile biten en az bir elemanı var mı kontrol ediniz.
    public static void xIleBtn(List<String> isimler){
        System.out.println(isimler.stream().anyMatch(t -> t.endsWith("x")) ?
                "x il biten isimler var" : " x ile biten isim yok");
    }
    //Task -7 : Karakter sayısı en buyuk elemanı yazdırınız.
    public static void krktrEnBykElmn(List<String> isimler){
       Stream<String> sonIsım = isimler.stream().sorted(Comparator.comparing(t->t.toString().length()).reversed()).
               limit(1);//limit() içerisine hangi rakamı yazarsanız o kadar data Stream <String> classından gelir.
               //limit(5) --> en fazla karaktere sahip ilk 5 elemanı getir
        System.out.println(Arrays.toString(sonIsım.toArray()));//sonIsım.toArray() stream olan akısı Array'e cevirdim
        //Arrays.toString(sonIsım.toArray())==>Array'i Stringe cevirir.
        //Son isim Stream oldugu için önce arraye sonra yazdırabilmek için Stringe cevirdik
    }
    //Task -8 : list elemanlarını son harfine gore sıralayıp ilk
    //    eleman hariç kalan elemanları print ediniz.
        public static void snHrfIlkHrc(List<String> isimler){
        isimler.
                stream().
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                skip(1).
                forEach(t-> System.out.print(t + " "));
        }

    //Task -9 : Karakter sayıları cift olan elemanlarin karakter sayılarının karelerini hesaplayan;
    //      tekrarli olanlari sadece bir kere buyukten kucuge yazdıran programı yazınız.
          public static void krktrSysCftKrTkrszNykKck(List<String> isimler){
                isimler.
                        stream().filter(t->t.length()%2==0).
                        map(t->t.length()*t.length()).
                        distinct().
                        sorted(Comparator.reverseOrder()).
                        forEach(t-> System.out.print(t + " "));
          }
}
