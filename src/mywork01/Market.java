package mywork01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Market {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Marketimiz Hoşgeldiniz");
        System.out.println("Lütfen istediginiz sezon bölümünde meyve seciniz");
        String tercih = ("1.Kış Meyvesi\n2.Yaz meyvesi");
        int toplam = 0;

        Meyve();
    }
    public static void  Meyve(){
        List<String> meyve = new ArrayList<>();
        meyve.add("muz");
        meyve.add("elma");
        meyve.add("karpuz");
        meyve.add("kiraz");
        meyve.add("portakal");
        meyve.add("mandalina");
        meyve.add("nar");
        meyve.add("kavun");
        meyve.add("erik");
        meyve.add("üzüm");
        meyve.add("armut");
        meyve.add("çilek");

        System.out.println(meyve.set(3, "Maydanoz"));
        System.out.println(meyve);

        List<Double> fiyat = new ArrayList<>();
        fiyat.add(12.45);
        fiyat.add(8.90);
        fiyat.add(4.90);
        fiyat.add(22.50);
        fiyat.add(6.75);
        fiyat.add(5.99);
        fiyat.add(14.25);
        fiyat.add(17.75);
        fiyat.add(25.00);
        fiyat.add(10.25);
        fiyat.add(8.99);
        fiyat.add(27.99);


        System.out.println(fiyat);


    }
}
