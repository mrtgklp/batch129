package batch129.java.day16multidimensionalarrays;

import java.util.Arrays;

public class Md05 {
    public static void main(String[] args) {
        //Example 1: Bir Multi-deminsianol array oluşturulun
        //          Bu array deki tum elemanların  carpımını consola yazdıran kodu yazınız.
        int a[][] = {{2,3},{5,7}};

        int çarpım = 1;

        for(int [] w: a){
            for(int k : w){
                çarpım = çarpım * k;
            }
        }
        System.out.print(çarpım);//210
    }
}
