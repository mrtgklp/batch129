package batch129.java.day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        cities.add("Kayseri");
        System.out.println(cities);//[Miami, Istanbul, Kayseri, Almaty]
        //remove() method index ile kullanılırsa o index teki elemanı siler
        //remove() methodu index ile kullanılırsa size sildigi elemanın verir
        String n = cities.remove(1);
        System.out.println(n);// Istanbul
        System.out.println(cities);//[Miami, Kayseri, Almaty]
        //remove () methodu eleman ile kullanırsa ilk gördügü elemanı siler
        //remove() methodu eleman ile kullanılırsa size o elemanı silip silmedigini ifade eden
        //true veya false verir
        //eger eleman list te var ise o elemanı siler ve size true der
        //eger eleaan list te yok ise o elemanı silmediginden ve size false der
        boolean p = cities.remove("Kayseri");
        System.out.println(cities);
        System.out.println(p);

    }
}
