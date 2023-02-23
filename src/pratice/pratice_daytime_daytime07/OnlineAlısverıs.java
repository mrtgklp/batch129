package pratice.pratice_daytime_daytime07;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineAlısverıs {
    /*
     * Basit bir online alisveris programi yaziniz.
     *
     * 1. Adim : "urunListesi"nden urun sectir ve kac adet istedigini sor.
     * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
     *           istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
     *           Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
     * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini "toplamOdeme" ekle.
     * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
     * */

    static List<String> urunListesi = new ArrayList<>();
    static List<Double> urunFıyatı = new ArrayList<>();
    static double toplamOdeme;
    static Scanner input = new Scanner(System.in);

   public static void main(String[] args) {
      urunListesi.add("Kemer : urun kodu 1");
      urunListesi.add("Cuzdan : urun kodu 2");
      urunListesi.add("Ayakabı : urun kodu 3");
      urunListesi.add("Canta : urun kodu 4");
      urunListesi.add("Tesbih : urun kodu 5");

      urunFıyatı.add(40.00);
      urunFıyatı.add(30.00);
      urunFıyatı.add(100.00);
      urunFıyatı.add(200.00);
      urunFıyatı.add(20.00);

      musterıSecım();
   }

   private static void musterıSecım() {
      System.out.println("Lutfen secmek istediginiz urun kodunu giriniz: ");
      int secim = input.nextInt();
      System.out.println("Lutfen secmek istediginiz urunden kaç adet girmek istediginiz giriniz :");
      int adet = input.nextInt();
      double urunTutarı = adet*urunFıyatı.get(secim-1);
      toplamOdeme+=urunTutarı;
      System.out.println("Devam etmek için 1\nOdemek için 2 basınız");
      int devamMI = input.nextInt();

      if (devamMI==1){
         musterıSecım();//recusive method
      }
      else {
         odeme();
      }



   }//Musteri Secimi

   private static void odeme() {
      LocalDate KurulusGunumuz = LocalDate.of(2023,02,11);

      LocalDate date = LocalDate.now();

      if (date.isEqual(KurulusGunumuz)){
         System.out.println("Bugun Kurulusumuz gunu dolasıyla aldıgınız urunler beleş..");
      }
      else {
         System.out.println("Yıne Bekleriz Toplam Odeme : " + toplamOdeme+ "$");
      }

   }//odeme


}
