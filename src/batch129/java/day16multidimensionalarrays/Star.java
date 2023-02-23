package batch129.java.day16multidimensionalarrays;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        /*
                Aşagıdaki şekli çizen kodu yazınız

                            *
                           *  *
                          *    *
                         *      *
                        * * *  * *
         */


        int row = 5;

        for(int i = 1;i<=row;i++){
            for(int k = 1; k<=row;k++){
                System.out.print(" ");
            }

            for(int b = 1; b<=2*i-1;b++){
                if(i==row || b==1 || b==2*i-1){
                    System.out.print("* ");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
