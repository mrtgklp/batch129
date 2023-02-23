package batch129.java.day10switchloops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        //Example 1: Kulanicidan iki sayi ve yapilacak islemi alan ve +, -, *, /, % islemlerini yapan kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz..");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Lütfen İşleminizi Seciniz==> +,-,*,/,%");
        char islem = input.next().charAt(0);

        switch (islem){
            case '+':
                System.out.println(a + "+" + b + "=" + (a+b));
                break;
            case '-':
                System.out.println(a + "-" + b + "=" + (a-b));
                break;
            case 'x':
                System.out.println(a + "x" + b + "=" + (a*b));
                break;
            case '/':
                System.out.println(a + "/" + b + "=" + (a/b));
                break;
            case '%':
                System.out.println(a + "%" + b + "=" + (a*b/100));
                break;
            default:
                System.out.println("Gecerli bir sayı giriniz...");

        }
    }
}
