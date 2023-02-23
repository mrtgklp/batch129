package mywork01;

import java.util.Arrays;

public class SayıAltYazdırma {
    public static void main(String[] args) {
        /*
         2---1 den 20 ye kadar tam sayıları alt alta yazan Java kodu yazınız.
    Hint: For döngüsü kullanınız.
    Beklenen Çıktı:
    1
    2
    3
    4
    .
    .
    .
    19
    20
         */

        int sayı = 20;
        int sum = 0;

        for (int i = 1; i <=sayı ; i++) {
            sum = i;
            System.out.print(sum + " ");
        }
        System.out.println();
        int sayilar [][]={{9,1,2,3},{4,5,6},{9,12,14,55},{2}};
        int sumn=0;
        for (int i = 0; i < sayilar.length;i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                if(i==j){
                    sumn+=sayilar[i][j];

                }

            }

        }
        System.out.println(sumn);





    }

}
