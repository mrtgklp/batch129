package batch129.java.day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {
        // Arraylist oluştururken sag tarafa(constructor)ArrayList yazmak zorundasınız
        //Ama sol tarafa ister "Arraylist" yazın isterseniz de "Lİst" yazın ,  ikisi de calısır.
        List<Character> initials = new ArrayList<>();
        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');
        //Bir liste kaç eleman oldugunu nasıl oldugunu nasıl anlarız?
        int numOfElement = initials.size();
        System.out.println(numOfElement);//4

        //Note : Arrayler de bahsaderken legent() kullanın List'lerden bahsederken size() kullanın.

        //Bir List'ten istenen bir eleman nasıl alınır?
        char u = initials.get(2);
        System.out.println(u);// M

        //Example 1: Verilen bir String liste ki tüm elemanların toplam karakter sayısını bulan kodun yazınız.
        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");

        //1.yol : Recommended
        int sum = 0;
        for(String w : cities){
            sum = sum + w.length();
        }
        System.out.println(sum);
        //2.yol
        int toplam = 0;

        for (int i = 0;i<cities.size();i++){

            toplam = toplam + cities.get(i).length();
        }
        System.out.println(toplam);
        //Bir liste ki istenen bir elemanı nasıl degiştirebiliriz
        cities.set(0,"New York");
        System.out.println(cities);//[New York, Istanbul, Kayseri, Almaty]

        //Example 2: Maaş list oluşturunuz ve maaş lara %20 zam yapınız.
        List<Double> salary = new ArrayList<>();
        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);
        System.out.println(salary);//[19500.25, 8500.75, 32500.5]

        //1.Yol
        int idx = 0;
        for(Double w : salary){

            salary.set(idx,w*1.20);
            idx++;
        }
        System.out.println(salary);//[23400.3, 10200.9, 39000.6]
        //2.Yol

        for(int i = 0;i<salary.size();i++){

           salary.set(i,salary.get(i)*1.20);
        }
        System.out.println(salary);

    }
}
