package batch129.java.day18list;

import java.util.ArrayList;
import java.util.List;

public class List04 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Mahsun");
        names.add("Müslüm");
        names.add("Orhan");

        List<String> females = new ArrayList<>();
        females.add("Emel");
        females.add("Ajda");
        //names.containsAll(females) "names" list de females listedeki tüm elemanlarını var olup olmadıgını kontrol eder
        //tamamı varsa true döndürür herhangi bir yoksa size false döndürür
        boolean artist = names.containsAll(females);
        System.out.println(artist);
        //names.subList (1,3) names listindeki index i 1,2, ve 3 olan elemanları bir list in içinde size verir
        List<String> subList = names.subList(1, 3);
        System.out.println(subList);


        names.retainAll(females);
        System.out.println(names);
        System.out.println(females);

        //Example 1 : Elektronik aletler ve ev aletleri listleriniz var
        //              elektronik  ev aletlerini listeleyiniz

        List<String> electronics = new ArrayList<>();
        electronics.add("TV");
        electronics.add("Radio");
        electronics.add("Refrigerator");
        electronics.add("Mobile Phone");
        electronics.add("Notebook");

        List<String> homeGoods = new ArrayList<>();
        homeGoods.add("Carpet");
        homeGoods.add("Fork");
        homeGoods.add("Radio");
        homeGoods.add("Chair");
        homeGoods.add("TV");
        //homeGoods.retainAll(electronics) homeGoods ile electronics list lerinin ortak elemanlarını homeGoods listi içinde verir
        //Baska bir deyişle (ın other words) homeGoods listindeki ortak olmayan elemanları siler
        homeGoods.retainAll(electronics);
        System.out.println(homeGoods);//[Radio,Tv]
        //isEmpty() Lİst te hiç eleman yoksa size true verir 1 veya daha fazla eleman varsa size false verir
        //isEmpty() esasına "name.size()==0" demektir
        names.isEmpty();

        System.out.println(names.hashCode());
    }
}
