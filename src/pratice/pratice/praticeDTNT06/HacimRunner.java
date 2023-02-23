package pratice.pratice.praticeDTNT06;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class HacimRunner {
    public static void main(String[] args) {
        KarePrizma karePrizma = new KarePrizma();
        double karePrizmaHacim = karePrizma.hacimHesapla(5,6);
        System.out.println("karePrizmaHacim = " + karePrizmaHacim);

        NumberFormat obj = new DecimalFormat(".00");
        Koni koni = new Koni();
        double koniHacim = koni.hacimHesabla(3,5);
        System.out.println("koniHacim = " + obj.format(koniHacim));

       // NumberFormat classından bir obje olusturup DecimalFormat(".00") virgülden sonra 2 basamak yazdırır.
        // NumberFormat classından bir obje olusturup DecimalFormat(".000") virgülden sonra 3 basamak yazdırır

        Silindir silindir = new Silindir();
        double silindirHacim = silindir.hacimHesabla(1,5);
        System.out.println("silindirHacim = " + obj.format(silindirHacim));

        System.out.println(silindir.sayı);

    }//main
}//class
