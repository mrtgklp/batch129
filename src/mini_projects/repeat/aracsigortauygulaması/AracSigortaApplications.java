package mini_projects.repeat.aracsigortauygulaması;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AracSigortaApplications {
    /*
Proje: Araç Sigorta Prim Hesaplama
       Araç tipleri:otomobil, kamyon, otobüs, motosiklet
                    -otobüs: 18-30 koltuk veya 31 ve üstü koltuk
       Tarife dönemi:Aralık 2022,Haziran 2022
       1.dönemi :Haziran 2022                            2.dönem : Aralık 2022
          otomobil: 2000                       otomobil: 2500
          kamyon:   3000                       kamyon:   3500
          otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
          motosiklet: 1500                     motosiklet: 1750
        Hatalı girişte hesaplama başarısız uyarsı verip tekrar menü gösterilsin.
 */
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Scanner inp = new Scanner(System.in);
        boolean isFail;//hesaplamanın durumunu kontrol etmek için bir flag kullanalım
        //Hatalı girişte veya yeni işlem için menu tekrar gösterilsin
        do {
            isFail = false;
            System.out.println("---Zorunlu Sigorta Primi Hesaplama---");
            System.out.println("Tarife dönemi seciniz: ");
            System.out.println("1.Haziran 2022");
            System.out.println("2.Aralık 2022");
            //exception handle etme
            int term = 0;
            try {
                term=inp.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Gecersiz giris,Lütfen sayı giriniz.");
            }
            inp.nextLine();
            //girilen dönem gecerli mi?
            if (term == 1 || term == 2) {
                Arac arac = new Arac();
                String termName = term == 1 ? "Haziran 2022" : "Aralık 2022";
                System.out.println("Arac tipini giriniz:");
                System.out.println("otomobil,kamyon,otobus,motorsiklet");
                String select = inp.next();//kamyon
                arac.type = select;
                arac.countPrime(term);
                if (arac.prim > 0) {
                    System.out.println("Hesaplama islemi basarıyla tamamlandı.");
                    //Sonuc yazdır
                    System.out.println("Arac Type : " + arac.type);
                    System.out.println("Tarife dönemi : " + termName);
                    System.out.println("Aracınızın iligili dönem sigorta primi = " + arac.prim);
                    isFail = isAgain(inp);
                } else {
                    System.out.println("Hesaplama basarısız,tekrar deneyiniz");
                    isFail = isAgain(inp);
                }
            } else {
                System.out.println("Hatalı giriş!!!");
                isFail = true;
            }


        } while (isFail);
        System.out.println("iyi günler dileriz...");


    }

    private static boolean isAgain(Scanner inp) {

        boolean isFail;
        System.out.println("Yeni islem için 1,çıkıs için 0 veya her hangi bir sayı giriniz:");
        int choice = inp.nextInt();
        if (choice == 1) {
            isFail = true;
        } else {
            isFail = false;
        }
        return isFail;
    }
}
