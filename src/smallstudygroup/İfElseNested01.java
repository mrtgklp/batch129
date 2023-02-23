package smallstudygroup;

import java.util.Scanner;

public class İfElseNested01 {
    public static void main(String[] args) {
        //Gündüz dersimiz varsa katılabilirim
        //Gece sınıfımız varsa ona da  katılabilirim

        boolean dt = true;
        boolean nt = false;
        boolean isActive = dt || nt;
        if(isActive){
            System.out.println("sınıfa katılabilirim");
        }else{
            System.out.println("sınıfa katılamazsın");
        }
        // girilen bir karakterin, harf olup olmadigini bulalim

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter=scan.next().toUpperCase().charAt(0);

        if(karakter>='A' && karakter <='Z' ){
            System.out.println("girdiniz karakter harfdir");
        }else{
            System.out.println("Girdiginiz karakter harf degil");
        }
        // Soru 3) Kullanicidan 100 uzerinden notunu isteyin.
        // Not'u harf sistemine cevirip yazdirin.
        // 50’den kucukse "D",
        // =50  <60 arasi "C",
        // =60  <80 arasi "B",
        // =80’nin uzerinde ise "A"

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        double notSayi= scan.nextDouble();
        if(notSayi>50){
            System.out.println("D");
        } else if (notSayi>=50 || notSayi<=60) {
            System.out.println("C");
        }
        else if(notSayi>=60 && notSayi<80){
            System.out.println("B");
        } else if (notSayi>=80) {
            System.out.println("A");
        }
        else{
            System.out.println("Gecersiz not");
        }
        // bir kisinin kan baginda olup olmadigini control ediniz .
        // yas:18 baslamali
        // kilo : 50 dan ust olmali
        //Yaş ve kilo için iki değişken oluşturma

        int yas = 18;
        int kilo = 50;

        if(yas>=18) {
            if (kilo>=50) {
                System.out.println(" kan bagısınında yapmaya uygunsunuz");
            } else {
                System.out.println("kan bagısınında yapmaya uygun degilsiz");
            }

        }else System.out.println("yasınız 18 den buyuk olmal");

    }
}
