package batch129.java.day16multidimensionalarrays;

public class Md03 {
    public static void main(String[] args) {

        //Example 1: Bir multidimensional array oluşturunuz
        //          bu array' deki tüm sayıların toplamını veren kodu consola yazdırınız.

        int a[][] = {{2,62,82},{3,13}};//162
        int sum = 0;
        for(int[] w : a){
            for(int k : w){
                sum = sum + k;
            }
        }
        System.out.println(sum);//162
    }
}
