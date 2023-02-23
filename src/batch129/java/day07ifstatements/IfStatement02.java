package batch129.java.day07ifstatements;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //Example 2: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Kullanıncan Bir Sayı Giriniz ve Tek mi Çift Kontrol Ediniz : ");
        int num = input.nextInt();

        if(num%2==0){
            System.out.println("sayı çift..");
        }
        if(num%2!=0){
            System.out.println("sayı tek");
        }

        if(num%2==0){
            System.out.println("Çitf sayı...");
        }
        else {
            System.out.println("tek sayı...");
        }
    }
}
