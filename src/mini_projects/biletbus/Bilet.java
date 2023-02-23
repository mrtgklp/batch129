package mini_projects.biletbus;

import java.util.Scanner;

public class Bilet {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int km = 0;
        int yas = 0;
        int yolculukTipi = 1;

        String plakaNumarası = "33 MG 34";

        System.out.println("Lütfen gidecegiz mesafeyi km olarak veriniz.");
        km = scanner.nextInt();

        System.out.println("Lütfen yasınız giriniz");
        yas = scanner.nextInt();

        System.out.println("Lütfen yolculuk tipini giriniz " +
                "Sadece gidis ise 1\ngidis-donus ise 2");
        yolculukTipi = scanner.nextInt();

        if (km > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            double biletUcreti = km * 0.10;
            System.out.println("Indirimsiz Bilet Ucreti = " + biletUcreti);
            double yasIndırımOranı = 0;
            if (yas < 12) {
                yasIndırımOranı = 0.5;
            } else if (yas < 24) {
                yasIndırımOranı = 0.1;
            } else if (yas > 65) {
                yasIndırımOranı = 0.3;
            }
            /*
             double dusulecekDeger = 0;
             dusulecekDwger = bıletUcreti * yasIndırımOranı;//100*0.1=10tl
             biletUcreti = bıletUcreti-dusulecekDeger;
             Not: Asagıda tek satırda yapıldı
             */
            biletUcreti -= biletUcreti * yasIndırımOranı;
            if (yolculukTipi == 2) {
                biletUcreti -= biletUcreti * 0.2;
                biletUcreti *= 2;
            }

            biletDokum(plakaNumarası, km, yolculukTipi, biletUcreti, yasIndırımOranı);
            System.out.println("Bilet Ücreti = " + biletUcreti);

        } else
            System.out.println("Hatalı Veri Girdiniz...");

    }//main

    private static void biletDokum(String plakaNumarası, int km, int yolculukTipi, double biletUcreti, double yasIndırımoranı) {
        System.out.println("============================Bilet Dokum==========================");
        System.out.println(" Otobusun Plakası " + plakaNumarası);
        System.out.println("Mesafe " + km);
        System.out.println("Yolculuk Tipi " + (yolculukTipi == 1 ? " Tek Yon" : " Gidis Donus "));
        System.out.println("Bilet Ucreti = " + biletUcreti);
        System.out.println("Yas Indırım = " + yasIndırımoranı);
        slowPrint("....Keyifli Yolculuklar....", 50);
    }

    public static void slowPrint(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}//class
