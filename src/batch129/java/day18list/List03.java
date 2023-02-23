package batch129.java.day18list;

import java.util.ArrayList;
import java.util.List;

public class List03 {
    public static void main(String[] args) {

        //example 1 : Bir string listteki 7 haric tüm elemanlarını degerlerini 3 artırınız

        List<Integer> nums = new ArrayList<>();

        nums.add(12);
        nums.add(23);
        nums.add(7);
        nums.add(11);
        nums.add(12);
        nums.add(35);

        //1.Yol:
        for (Integer w:nums ) {
            if (w == 7) {
                continue;
            }
            nums.set(nums.indexOf(w),w+3);
        }
        System.out.println(nums);//[15, 26, 7, 14, 15, 38]

        //2.Yol. Recommended
        for (int i = 0; i < nums.size(); i++) {
            int eleman = nums.get(i);
            if(eleman==7){
                continue;
            }
            nums.set(i,eleman+3);
        }
        System.out.println(nums);//[18, 29, 7, 17, 18, 41]

        /*
        (nums.indexOf(w) ilk görünümü index verir List tekrarlı eleman sahip ise
        (nums.indexOf(w) kullanımı risk oluşturabilir.bu yüzden bu soruda en guvenli yol "for loop"tur

         */

    }
}
