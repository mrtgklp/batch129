package advanced_pratice.practice02;

import java.util.Scanner;

public class Q03_DoWhile_TahminOyunu {
    public static void main(String[] args) {
        //0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
        //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!! ? tahminde sayiyi buldunuz. Puaniniz: ?
        Scanner input = new Scanner(System.in);

        int rastgeleSayı = (int)(Math.random()*101);

        int sayı;
        int sayac = 10;
        System.out.println("0-100 arası(dahil) bir tamsayı giriniz");
        do {
            sayac--;
            sayı = input.nextInt();
            if(sayı<rastgeleSayı){
                System.out.println(sayac+ " hakkınız kaldı");
                System.out.println("Daha büyük bir sayı giriniz..");
            } else if (sayı>rastgeleSayı) {
                System.out.println(sayac+ " hakkınız kaldı");
                System.out.println("Daha kücük bir sayı giriniz..");
            } else  {
                System.out.println("Tebrikler..."+ (10-sayac) + " tahminde bulundunuz");
                System.out.println("Puanınız: " +(sayac+1)*10);
            }
            if(sayac==0){
                System.out.println("Hakkınız bitti");
                //Ödev yeninden oynama hakkı...
            }
        }while (sayı!=rastgeleSayı);
    }
}
