package mywork01;

import java.util.Scanner;

public class TersYazdırma01 {
    public static void main(String[] args) {
        /*
            Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın
            ve tersine ters çevrilmiş String'e atayın.
            Test Data:
             sentence -> "Java is fun"
        reversed -> "fun is Java"
         */

        String cumle = "Java is fun";
        String tersCumle = "";
        for (int i = cumle.length()-1; i >=0; i--) {
            tersCumle = tersCumle + cumle.charAt(i);
        }
        System.out.println(tersCumle);
    }



}
