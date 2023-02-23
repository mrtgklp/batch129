package batch129.java.day34mapsiterators;

import java.util.HashMap;

public class HashMapMechanism {
    /*
        1)siz "HashMap" olusturmak için " HashMap<String,Integer> hm = new HashMap<>()" kodunu yazdıgınızda Java
          16 tane "bucket(kova)" olusturur ve bu "backet" ları 0 dan 15 e kadar index'ler.
        2)Siz "entry(Eleman)" eklemek için "hm.put("Istanbul",17000000)" kodunu yazdıgınızda JAva;
          i)"key" için hashCode uretir.
          ii)"hashCode" u 16 ya boler
          iii)Kalanı index olarak kullanıp,indexi kalana esit olan bucket a bu "entry" i yerlestirir.
           iv)Bucket'a "entry" eklenirken, Java o bucket icinde "LinkedList" yapisini kullanir.

     */
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("İstanbul",17000000);
        hm.put("Miami",5000000);
        hm.put("Moscow",18000000);
        hm.put("New Delhi",30000000);
        System.out.println(hm);
    }
}
