package batch129.java.day07ifstatements;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        //Example 1) Verilen character buyuk harf ise ekrana “Buyuk Harf” yazdiran
        //           kucuk harf ise ekrana "Kucuk Harf" yazdiran kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Bir karakter giriniz...");
        char ch = input.next().charAt(0);

        /*if(ch >= 'A' && ch<='Z'){
            System.out.println("Büyük Harf...");
        }
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Kücük Harf...");
        }*/

        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Büyük harf...");
        }
        else if( ch >= 'a' && ch <= 'z'){
            System.out.println("Kücük harf...");
        }
        else System.out.println("Harf Degil...");

    }
}
