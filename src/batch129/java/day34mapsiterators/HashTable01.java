package batch129.java.day34mapsiterators;


import java.util.Hashtable;

public class HashTable01 {
    /*
       1)HashTable "Thread-safe" ve "synchronized"dir.
       2)HashTable entryleri rastgele sıralar.
       3)Hashtable lar HAshMap lere daha yavastırlar
       4)HashTable lar key lerde ve "value"larda "null" kullanılmasına musade etmezler

       note : i)"MultıThread" ve synchronized" kullanmanız gerekirse,
       ii) key lerde ve value larda "null" kullanmak yasak ise HashTable kullanmak gerekir.

     */
    public static void main(String[] args) {
        Hashtable<Integer,Integer> ht = new Hashtable<>();
        ht.put(1,2);//1 ve -1
        ht.put(2,4);//1,-1,2,-2
        ht.put(6,8);//1,2,3,4,-1,-2,-3,-4

        System.out.println(ht);//{6=8, 2=4, 1=2}


    }
}
