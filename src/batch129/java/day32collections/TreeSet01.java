package batch129.java.day32collections;

import java.util.*;

public class TreeSet01 {
    public static void main(String[] args) {
        long one = System.nanoTime();//Çalıştıgınız an da ki kodun milliseconde verir
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(25);
        ts.add(8);
        ts.add(32);
        ts.add(3);
        System.out.println("ts = " + ts);//ts = [3, 8, 12, 25, 32]
        long two = System.nanoTime();//Çalıştıgınız an da ki millisecond
        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(25);
        hs.add(8);
        hs.add(32);
        hs.add(3);
        TreeSet<Integer> hts = new TreeSet<>(hs);//TreeSet fazla zaman kaybı oldugu için ilk başta HashSet oluşturulur ve TreeSet içine koyulur
        System.out.println("hs = " + hts);//Random rastgele sayı hs = [32, 3, 8, 25, 12]
        long three = System.nanoTime();//Çalıştıgınız an da ki millisecond
        System.out.println("TreeSet in uygulama suresi: " + (two-one));
        System.out.println("HashSet in uygulama suresi: " + (three-two));

        //Note: TreeSet eleman ekleme'de coook yava,HashSet ise coook hızlıdır.
        //      TreeSet'in bu negatif yonunden kurtulmak için;HashSet oluşturur elemanları ekler ve sonra HashSet'i TreeSet'e ceviririz.
        int first = ts.first();
        System.out.println("first = " + first);//first = 3
        
        int last = ts.last();
        System.out.println("last = " + last);//last = 32
        
        int floor = ts.floor(15);
        System.out.println("floor = " + floor);//floor = 12==>15 elemanlardan biri degil o yuzden 15 den bir önceki eleman yazdırıldı

        //floor() method'unda kullanabileceginiz sayı en kucuk elemandan az olamaz
        int floor1 = ts.floor(12);
        System.out.println("floor = " + floor);//floor = 12 ==> elemanlardan biri o yuzden 12 direkt yazdırıldı.

        int cliling1 = ts.ceiling(15);
        System.out.println("cliling1 = " + cliling1);//cliling1 = 25==>15 elemanlardan biri degil o yuzden 15 den bir sonraki eleman yazdırıldı
        //ceiling () method'unda kullanabileceginiz sayı en buyuk elemandan buyuk olamaz.
        int cliling2 = ts.ceiling(25);
        System.out.println("cliling2 = " + cliling2);//cliling2 = 25 ==> 25 elemanlardan biri o yuzden 25 direkt yazdırıldı.

        SortedSet<Integer> tailSet1 = ts.tailSet(12);
        System.out.println("tailSet1 = " + tailSet1);//tailSet1 = [12, 25, 32]==> 12 elemanlardan biri o yuzden  "12 ve sonraki elemanlar" bir Set içinde yazdırıldı.

        SortedSet<Integer> tailSet2 = ts.tailSet(15);
        System.out.println("tailSet2 = " + tailSet2);//tailSet2 = [ 25, 32] ==> 15 elemanlardan biri degil o yuzden "15 den sonraki elemanlar" bir Set içinden yazdırıldı.

        NavigableSet<Integer> tailSet3 = ts.tailSet(12,false);
        System.out.println("tailSet3 = " + tailSet3);//tailSet3 = [25, 32] ==> 12 elemanlardan biri normalde "12 ve sonraki elemanlar" bir Set içinde yazdırılırdı
                                                    //  ama ikinci parametre'de "false" kullandıgım için 12 haric tutuldu.

        SortedSet<Integer> headSet1 = ts.headSet(12);
        System.out.println("headSet1 = " + headSet1);//headSet1 = [3, 8] ==> 12 elemanlardan biri "önceki elemanlar" bir Set içinde yazdırıldı. 12 yazdırılmadı

        SortedSet<Integer> headSet2 = ts.headSet(12,true);
        System.out.println("headSet2 = " + headSet2);//headSet2 = [3, 8, 12]

        //Generic Method: Normal method'lar parametrelerde belirtilen data type'ları ile calısırlar
        //                Genetic Method'lar ise  verilen her turlu data type ile calısma becerisine sahiptirle.
        Integer higher1 =  ts.higher(12);
        System.out.println("higher1 = " + higher1);//higher1 = 25 ==> 12 den bir sonraki elemanı verir

       Integer lower1 = ts.lower(12);
        System.out.println("lower1 = " + lower1);// 8 ==> 12 den bir önceki elemanı verir
    }
}
