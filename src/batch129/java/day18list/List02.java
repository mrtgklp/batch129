package batch129.java.day18list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List02 {
    public static void main(String[] args) {

        //Example 1: Bir tane Integer list oluşturunuz bu list en yakın iki tam sayı yazınız
        //           [12,23,9,11,35] ==> 12,11 answer

        List<Integer> nums = new ArrayList<>();

        nums.add(12);
        nums.add(23);
        nums.add(9);
        nums.add(11);
        nums.add(35);

        Collections.sort(nums);
        System.out.println(nums);//[9, 11, 12, 23, 35]

        int minDiff = nums.get(1) - nums.get(0);

        for (int i = 1; i < nums.size(); i++) {
          minDiff =  Math.min(minDiff,nums.get(i)-nums.get(i-1));
        }
        System.out.println(minDiff);

        for (int i = 1; i < nums.size() ; i++) {
            if (nums.get(i)-nums.get(i-1)==minDiff){
                System.out.println(nums.get(i) +" and " + nums.get(i-1) );
            }
        }


    }
}
