package mywork01;

public class TekSayınıToplamı {
    public static void main(String[] args) {
        /*
                 1---Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.
                     Test Data
                     34
                    Beklenen Çıktı
                    7
         */

        int sayı = 34;
        int toplam = 0;

        while (sayı>0){
            toplam+=(sayı%10);
            sayı/=10;
        }
        System.out.println("Sayılar arasında Toplamı = " + toplam);
    }
}
