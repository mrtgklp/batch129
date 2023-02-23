package batch129.java.day17arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayLists01 {
    /*
        1.) arrayList(List) ler çok data depolamak için kullanılır.
        2) Arraylist(List)ler non-primitive data type'deki çoklu dataları depolamak içn kullanılır.
            Listler non-primitive kabul ederler Arraylar is primitive data veya referece kabul ederler
        3)Arraylist leri oluştururken içine koyacagız eleman sayısını baştan söylemeye gerek yoktur.
          Arraylists ler eleman sayısıda "flexible" dirlar ama "Array" ler "flexible" degildirler
         4)Madem Arrayler eleman sayısında "flexible" degil nicin Java "Array" leri iptal etmedi?
            i)Eleman sayısı belli olan data ları depolamak için Array ler tercih edilir.
            ii)Array'ler cok hızlı calısır.
            ii)Array ler memory de cok az yer kaplar.
     */
    public static void main(String[] args) {
        //List nasıl oluşturulur?
        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(ages);// []

        //Listlere eleman nasıl eklenir
        //List e eleman eklemek için add method kullanırız
        //add() methodu elemanları sizin verdiginiz sıradı "List"e ekler(Insertion Order)
        ages.add(12);
        ages.add(9);
        ages.add(10);
        ages.add(888);

        ages.add(1,656);
        ages.add(3,766);
        System.out.println(ages);// [12, 656, 9, 766, 10, 888]

        //List e coklu eleman nasıl eklenir?veya liste baska bir list nasıl eklenir?
        //Bir list coklu eleman eklemek için o elemanları önce bir list içine koymalısınız
        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        ages.addAll(2,newAges);//[12, 656, 8, 9, 10, 9, 766, 10, 888, 8, 9, 10]

        System.out.println(newAges);//[8, 9, 10]
        System.out.println(ages);// [12, 656, 8, 9, 10, 9, 766, 10, 888, 8, 9, 10]
        //Bir list te ki tum elemanlarını nasıl silebilir?
        //ages.clear();
        //System.out.println(ages);// []
        //Contanins() method bir elemanın List var olup olmadıgı nasıl kontrol ederiz?
        boolean arr = ages.contains(9);
        System.out.println(arr);

        //bir listin başka bir list ile aynı olup olmadıhını nasıl kontrol ederiz?
        //iki list eşit olabilmesi için olabilmesi için aynı index de aynı elemanlar olmalıdır.
        ArrayList<String>names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("jim");
        names1.add("Kim");

        ArrayList<String>names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("jim");

        boolean s = names1.equals(names2);
        System.out.println(s);//false

        //Example 1: Verilen iki Interge list te tamamıyla aynı elemanlarını
        //           olup olmadıgını kontrol eden kodu yazınız.

        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(8);
        num1.add(10);
        num1.add(9);

        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(8);
        num2.add(9);
        num2.add(10);

        Collections.sort(num1);
        Collections.sort(num2);

        boolean t = num1.equals(num2);
        System.out.println(t);//true



    }
}
