package batch129.java.day16multidimensionalarrays;

import java.util.Arrays;

public class Md04 {
    public static void main(String[] args) {
        //Example 1 : Bir multi-dimensional array oluşturunuz ve bir dimensional array donusturunuz.
        //              [[2,5],[3],[4,7,11]]==> [2,5,3,4,7,11]
        int a[][] = {{2,5},{3},{4,7,11}};
        System.out.println(Arrays.deepToString(a));
        //"a" arrayinde toplam kaç eleman var
        int totalElement = 0;//6
        for(int [] w : a){
            totalElement = totalElement + w.length;
        }

        //"b" isimli  tek dimensianol li bir array oluşturunuz
        int b[] = new int[totalElement];
        System.out.println(Arrays.toString(b));

        //"a" arraydeki elemanlarını b arrayine transfer ediniz
        int idx = 0;
        for(int[] w : a){
            for(int k : w){
              b[idx]  = k;

              idx++;
            }
        }
        System.out.println(Arrays.toString(b));


    }
}
