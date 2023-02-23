package batch129.java.day34mapsiterators;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
    /*
     1)TreeMap entry leri "key"lere gore "natural order"a koyar.
     2)TreeMap coook yavastır cunku "natural order" yapmak cook zaman ister.
     3)TreeMap "Thread-safe" ve "synchronized" degildir.
     4)TreeMap'lerde "key"lerinde "null" kullanılmaz.Ama value'larda istediginiz kadar kullanabilirsiniz.
     */
    public static void main(String[] args) {
        long one = System.nanoTime();
        TreeMap<String,Integer> stdAges = new TreeMap<>();
        stdAges.put("Ali",21);
        stdAges.put("Ayse",25);
        stdAges.put("Zeynep",25);
        stdAges.put("Kemal",19);
        stdAges.put("Murat",22);
        //key lere gore alfabetik sıra yaptı
        System.out.println("stdAges = " + stdAges);//stdAges = {Ali=21, Ayse=25, Kemal=19, Murat=22, Zeynep=25}

        long two = System.nanoTime();
        HashMap<String,Integer> stdAges1 = new HashMap<>();
        stdAges1.put("Ali",21);
        stdAges1.put("Ayse",25);
        stdAges1.put("Zeynep",25);
        stdAges1.put("Kemal",19);
        stdAges1.put("Murat",22);
        //key lere gore alfabetik sıra yaptı
        System.out.println("stdAges = " +stdAges1);
        long three = System.nanoTime();

        HashMap<String,Integer> stdAges2 = new HashMap<>();
        stdAges2.put("Ali",21);
        stdAges2.put("Ayse",25);
        stdAges2.put("Zeynep",25);
        stdAges2.put("Kemal",19);
        stdAges2.put("Murat",22);
        TreeMap<String,Integer> stdAges4 = new TreeMap<>();
        System.out.println("stdAges = " +stdAges2);
        long four = System.nanoTime();
        System.out.println("TreeMapc: " + (two-one));
        System.out.println("HashMapc: " + (three-two));
        System.out.println("HashMap --> TreeMap = " + (four-three));
    }
}
