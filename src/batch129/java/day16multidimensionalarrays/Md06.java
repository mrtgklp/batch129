package batch129.java.day16multidimensionalarrays;

public class Md06 {
    public static void main(String[] args) {

        //Example 1: Bir multi-dimensianol array deki en büyük ve en kücük sayının toplanın kodu yazdırın
        int a [][] = {{21,5},{14,70,11}};

        int small = a[0][0];
        int big = a[0][0];

        for(int [] w: a){
            for(int k : w){
                small = Math.min(small,k);
                big = Math.max(big,k);
            }
        }
        System.out.println(small);
        System.out.println(big);
    }
}
