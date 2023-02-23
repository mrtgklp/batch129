package batch129.java.day18list;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class List01 {
    public static void main(String[] args) {
        //Example 1: Integer bir List oluşturunuz
        //sonrada Lİstte 5 tane eleman yerleştiriniz
        //      bu elemanlarda 12 siliniz

        List<Integer> ages = new ArrayList<>();
        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(12);


        //NOte Siz Java da tam sayı yazdıgınız da java o tam sayının data typer otomatik olarak primitive olarak kabul eder.
        //     Bu yüzden remove() method unun içine yazdıgınız tamsayı eleman olarak degil index olarak kabul eder
        //     Tamsayı yı eleman olarak gostermenin birkaç yolu vardır

        //1.yol
        /*Integer nonprimitive = 12;
        ages.remove(nonprimitive);*/

        //2.yol: Recommended
       // ages.remove((Integer) 12);
        // 3.yol
        //ages.remove(Integer.valueOf((12)));

        //4.yol
       //ages.remove(ages.indexOf(12));

        //System.out.println(ages);


        //bir List oluşturunuz
        //sonrada Lİstte 5 tane eleman yerleştiriniz
        //      tüm  12 siliniz

        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(25);
        nums.add(12);
        nums.add(8);
        nums.add(12);
        System.out.println(nums);
        List<Integer> silinecekler = new ArrayList<>();
        silinecekler.add(12);
        silinecekler.add(25);


        // RemoveAll() method u list ile çalışır
        //  RemoveAll() method u bir veya birden fazla elemanın görümünü silmek için kullanılır
        nums.removeAll(silinecekler);

        System.out.println(nums);



    }
}
