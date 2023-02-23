package pratice.pratice.nighttime06;

public class Vararags02 {
    // verilen sayılardan ilk haric tum sayıları toplayım  ilk sayı ile carpan bir method oluşturunuz
    public static void main(String[] args) {


        int sayi1=5;
        int sayi2=7;
        int sayi3=2;
        int sayi4=4;
        int sayi5=9;

        sonuc(sayi1,sayi2,sayi3,sayi4,sayi5);
    }

    private static void sonuc(int capılacakSayı,int...toplnacakSayı) {
        int toplam=0;

        for (int w:toplnacakSayı
             ) {
            toplam+=w;
        }
        System.out.println("Toplam = " + toplam);//22
        int sonuc = toplam*capılacakSayı;
        System.out.println("Sonuc = " + sonuc);
    }
}
