package pratice.pratice.praticeDTNT;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {
         /*
        Kullanicidan alacaginiz 2 sayiyi yine kullaniciya
        sectireceginiz dort islemden biri ile isleme koyup yazdiriniz

         */
        Scanner input = new Scanner(System.in);
        System.out.println("1.Toplama işlem \n2.Çıkarma işlemi \n"+
                "3.Çarpma islemi \n4.Bolme islemi");//kullaniciya secmesi icin menu olusturdum
        System.out.println("Lütfen bir işlem seciniz..");
        int islem = input.nextInt();
        System.out.println("Lütfen iki sayı giriniz...");
        double a = input.nextDouble();//1.sayi assign edildi
        double b = input.nextDouble();//2.sayi assign edildi

        if(islem==1){
            System.out.println("Toplama işelemi sonucu : " + a + "+" + "b" + "=" + (a + b));
        }else if(islem==2){
            System.out.println("Cıkarma islemi sonucu : " + a + "-" + b + "=" + (a-b));
        }else if(islem==3){
            System.out.println("Carpma islemi sonucu : " + a + "x" + b + "=" + (a*b));
        }else if(islem==4){
            System.out.println("Bolme islemi sonucu : " + a + "/" + b + "=" + (a/b));
        }else System.out.println("Lütfen gecerli bir islem giriniz");

    }
}
