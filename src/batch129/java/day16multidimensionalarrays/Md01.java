package batch129.java.day16multidimensionalarrays;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        //MultiDimensional Array nasıl oluşturulur //a =[[5,12],[81,45],[123,0]]
        int a[][] = new int[3][2];
        //MultiDimensional Array'ler nasıl yazdırılır
        System.out.println(Arrays.deepToString(a));//[[0, 0], [0, 0], [0, 0]]
        //MultiDimensional Array'ler eleman nasıl eklenir
        a[0][0] = 5;
        a[0][1] = 12;
        a[1][0] = 81;
        a[1][1] = 45;
        a[2][0] = 123;
        a[2][1] = 0;
        System.out.println(Arrays.deepToString(a));//[[5, 12], [81, 45], [123, 0]]

        //Note : Array'lere non-Primitive data konulamaz
        //      Array'lere non-Primitive data veya reference konulur.
        //      Ama siz bir array i yazdırmak istediginizde java adres'ler yardımı ile non-primitive data'ya ulasır
        //      ve o non-primitive data'yi sanki array'in içindeymiş gibi gösterir.


        //MultiDimensional Array'lerdeki belli elemanlara nasıl ulaşılır?
        System.out.println(Arrays.toString(a[2]));//[123,0]

        System.out.println(a[1][0]);//  81

        System.out.println(Arrays.toString(a[0]));// [5,12]
        System.out.println(a[2][1]);// 0

    }
}
