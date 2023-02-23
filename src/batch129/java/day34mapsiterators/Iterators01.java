package batch129.java.day34mapsiterators;

import javax.swing.text.html.HTMLDocument;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    /*
         Iterator'lar Loop'ların yaptıgı işi yapar.
         Iterator'lar tıpkı loop'larda oldugu gibi eleman işleme sokarç
         Java'nın Iterator'ları ortaya çıkarma sebebi Infinite Loop riskini bitirmektir.
         Iterator'larda sonsuz loop yoktur.
         Iterator'lar java tarafından sonradan oluşturulmuşlardır be loop'ların yaptıkları bütün işlemleri yapabilir.
         Iterator'lar eleman silme ve update etmede daha basarilidirlar.
 Iki tip Iterator var;
 i)Iterator: Sadece elemanlari remove edebilirsiniz.
             Sadece soldan saga calisir yani tek yonludur.
 ii)ListIterator: Elemani remove etme ve update etme,"add" yapabilirsiniz.
                  Hem soldan saga hem de sagdan sola calisabilir yani cift yonludur.


  Iterator'larin update etme ozelligi olmadigi icin degistirilmesini istemedigimiz datalari bu sekilde kullanabiliriz



    */
    public static void main(String[] args) {


        //Iterator
        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");
        System.out.println(list1);//[Ali, Can, Aliye]

        Iterator<String> itr1 = list1.iterator();

        while (itr1.hasNext()){
            itr1.next();
            itr1.remove();
        }
        System.out.println(list1);//[]
        //ListIterator example 1
        List<String> list2 = new ArrayList<>();
        list2.add("Ali");
        list2.add("Can");
        list2.add("Aliye");

        ListIterator<String> listItr = list2.listIterator();
        while (listItr.hasNext()){
            String el = listItr.next();
            listItr.set(el + "!");//update etmek
        }
        System.out.println(list2);//[Ali!, Can!, Aliye!]
        //Example2
        List<String> list3 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("Aliye");
        System.out.println(list3);

        ListIterator<String> listItr2 = list3.listIterator();
       //Aşagıdaki loop pointer en saga almak için yazıldı
        while (listItr2.hasNext()){
           listItr2.next();
       }
        System.out.println(list3);//[Ali, Can, Aliye]
       //Aşagıdaki loop elemanları en sondan en basa dogru yazdırmak için yazıldı.
        while (listItr2.hasPrevious()){//sondan gelip çalıştırır
           String el = listItr2.previous();
           System.out.println((el + "<=="));//Aliye<= ,Can<==, Ali<==
       }
    }
}
