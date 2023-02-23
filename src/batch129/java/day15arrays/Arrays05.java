package batch129.java.day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {
    public static void main(String[] args) {
        //Example 1: String Array elemanlarını character göre kücükten büyüğü sıralayınız.
        // ["michael","Ajda","Thomas","Tom"] ==> ["Tom","Ajda","Thomas","michael"]

        String arr[] = {"michael","Ajda","Thomas","Tom"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, Comparator.comparingInt(String::length));//Method Reference::
        System.out.println(Arrays.toString(arr));
        //Example 2: String Array elemanlarını character göre buyukten küçüğe sıralayınız.
        // ["michael","Ajda","Thomas","Tom"] ==> ["michael","Thomas","Cuneyt","Ajda","Tom"]
        String brr[] = {"michael","Ajda","Thomas","Tom","Cuneyt"};
        System.out.println(Arrays.toString(brr));

        Arrays.sort(brr,Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(brr));

        //Example 3: String Array elemanlarını character sayısınına göre buyukten küçüğe sıralayınız.
        //          Aynı chracter sayısına olanları da alfabetik siraya koyunuz
        // ["michael","Ajda","Reyhane","Gabriel","Thomas","Tom","Ali","Cem","Can"] ==>
        // ["Gabriel","michael","Reyhane","Thomas","Cuneyt","Ajda","Tom","Ali","Cem","Can"]

        String crr [] = {"michael","Ajda","Reyhane","Gabriel","Thomas","Tom","Ali","Cem","Can"};
        System.out.println(Arrays.toString(crr));

        Arrays.sort(crr,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(crr));

        
    }
}
