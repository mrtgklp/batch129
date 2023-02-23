package mywork01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listornek {
    public static void main(String[] args) {
        //Example 1: Integer bir List oluşturunuz
        //sonrada Lİstte 5 tane eleman yerleştiriniz
        //      bu elemanlarda 12 siliniz

       List<Integer> nums = new ArrayList<>();
       nums.add(8);
       nums.add(12);
       nums.add(18);
       nums.add(12);
       nums.add(21);

       //Silme işleminde remove method kullanırız ve bir kaç tane örnekle bu şekilde yapabiliriz
       //nums.remove((Integer) 12);
        //nums.remove(Integer.valueOf(12));
        //nums.remove(nums.indexOf(12));
        //Integer sayı = 12;
        //nums.remove(sayı);
        //System.out.println(nums);


        //bir List oluşturunuz
        //sonrada Lİstte 5 tane eleman yerleştiriniz
        //      tüm  12 siliniz
        List<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(18);

        nums.removeAll(ages);
        //System.out.println(nums);
        //Example 1: Bir tane Integer list oluşturunuz bu list en yakın iki tam sayı yazınız
        //           [12,23,9,11,35] ==> 12,11 answer
        List<Integer> numList = new ArrayList<>();
        numList.add(12);
        numList.add(9);
        numList.add(23);
        numList.add(11);
        numList.add(35);

        Collections.sort(numList);
        System.out.println(numList);

        int n = numList.get(1)- numList.get(0);

        for (int i = 1; i < numList.size(); i++) {
            n = Math.min(n,numList.get(i)-numList.get(i-1));
        }
        System.out.println(n);

        for (int i = 1; i < numList.size(); i++) {
            if (numList.get(i)-numList.get(i-1)==n){
                System.out.println(numList.get(i) + "and" + numList.get(i-1));
            }
        }
        //example 1 : Bir string listteki 7 haric tüm elemanlarını degerlerini 3 artırınız
        List<Integer> ınteger = new ArrayList<>();
        ınteger.add(23);
        ınteger.add(7);
        ınteger.add(13);
        ınteger.add(29);
        ınteger.add(18);
        ınteger.add(0);

        Collections.sort(ınteger);

        for (Integer w:ınteger
             ) {
            if (w==7) {
                continue;
            }
            ınteger.set(ınteger.indexOf(w),w+3);
        }
        System.out.println(ınteger);

        for (int i = 0; i <ınteger.size() ; i++) {
            int eleman = ınteger.get(i);
            if (eleman==7){
                continue;
            }
            ınteger.set(i,eleman+3);
        }
        System.out.println(ınteger);

    }
}
