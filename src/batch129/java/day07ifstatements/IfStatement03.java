package batch129.java.day07ifstatements;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        //Example 3: Verilen bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.....");
        int num = input.nextInt();

        if(num>0){
            System.out.println("Sayı Pozitif...");
        }
        else if(num<0){
            System.out.println("Sayı negatif...");
        }
        else System.out.println("Sayı nort...");
    }
}
