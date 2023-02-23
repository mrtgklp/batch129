package pratice.pratice.praticeDTNT;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {
         /*
        Kullanicidan bir gun alin
        Eger gun cuma ise "Muslumanlar Icin Kutsal Gun" ;
        Eger gun cumartesi ise "Yahudiler icin Kutsal Gun"
        Eger gun pazar ise "Hristyanlar icin Kutsal Gun"
         yazdiran kodu olusturunuz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("LÜtfen Dini Günler için Önemli bir gün giriniz..");
        String days = input.next().toLowerCase();//kucuk harfe cevirdik Cuma


        if(days.equals("cuma")){
            System.out.println("Müslümanlar için Kutsal gün");
        }else if (days.equals("cumartesi")){
            System.out.println("Yahudiler için kutsal bir gün");
        }else if (days.equals("pazar")){
            System.out.println("Hristiyanlar için kutsal bir gün");
        }else System.out.println("Kutsal Bir Gün degil.....");

    }
}
