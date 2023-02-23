package batch129.java.day31collections;

import java.util.HashSet;

public class HashSet01 {
/*
 1)"Hash" bir tekniktir, Java bu teknigi kullanarak benzersiz datalar uretir.
 2)"Set" tekrarsiz data depolamak icin kullanilan bir Collection'dir.
 3)Set tekrar kabul etmez. Yani;tekrarsiz verileri depolamak icin kullanilir.
 "Set" ler 3'e ayrilir;
  i)HashSet:a) Super hizlidir,cunku HashSet'ler verdiginiz elemanlari siralamak icin zaman kaybetmez
             yani HashSet'lere eklenen elemanlar rastgele siralanirlar.
            b)Hashset()ler terarlı elemana musade etmezler.
            c)Hashset ler sadece 1 tane "null" eleman olarak kabul ederler.

  ii)LinkedHashSet: a)LinkedHashSet elemanları "ınertion order" a gore dizer.
                    b)LinkedHashSet elemanları sıralamakta zaman kaybettigi için hashSet gore yavaştır
                    c)Hashset()ler terarlı elemana musade etmezler.
  iii)TreeSet: a)TreeSet elemanları "natural order" (kucukten buyuge ya da alfabetik sıraya)  a gore dızer
               b)TreeSet, "natural order" yaparken cok zaman harcar o yuzden en yavas "set" tir.
               c)Hashset()ler terarlı elemana musade etmezler.
 */

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(235);
        hs.add(78);
        hs.add(5);
        System.out.println("hs = " + hs);//hs = [5, 235, 12, 78]==>gordugunuz gibi elemanlar rastgele(random) sıraladı

        int hc = hs.hashCode();
        System.out.println(hc);//330 hs tum elemanlarını toplamı
        
    }
}
