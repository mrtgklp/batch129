package pratice.pratice.praticeDTNT;

import java.util.Scanner;

public class C03_Ternary {
       /*
            Kullanicidan sifirdan buyuk pozitif bir tamsayi girmesini isteyin
            Girilen pozitif tamsayi 3 basamakli ise ekrana "3 Basamakli " yazdirin
            3 basamakli degilse cift olup olmadigini kontrol edin
            Cift ise "3 basamakli olmayan cift sayi" yazdirin
            Cift degilse " 3 basamakli olmayan tek sayi" yazdirin
     */
       public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           System.out.println("Lütfen pozitif tamsayı giriniz..");
           int sayi = input.nextInt();
           System.out.println("*********If else cözümü*********");
           boolean sifirdanBuyukUcBas = sayi > 99 && sayi < 1000;
           boolean sifirdanBuyukUcBasOlmayanCift = !(sayi > 99 && sayi < 1000) && sayi % 2 == 0;


           if(sayi>0) {
               if (sifirdanBuyukUcBas) {
                   System.out.println("Uc basamaklı sayı..");
               } else if (sifirdanBuyukUcBasOlmayanCift) {
                   System.out.println("3 basamaklı olmayan pozitif çift sayı..");
               } else System.out.println("3 basamaklı olmayan pozitif tek sayı");
           }else System.out.println("Lütfen pozitif bir tamsayı giriniz..");//negatif sayilar icin burasi calisır

           System.out.println("*******Ternary cözümü*********");
           boolean pozitifseTernary=sayi>0;
           boolean sifirdanBuyukUcBasTernary = sayi > 99 && sayi < 1000;
           boolean sifirdanBuyukUcBasDegilCiftTernary = !(sayi > 99 && sayi < 1000) && sayi % 2 == 0;
          /*   ActionDataType variable=(şart)        ? trueAction                                        : falseAction;
               Data   variable=    sartim          ?  Dogruysa                                       :  Yanlissa;
               Type
           */

           String  sonuc  = (pozitifseTernary) ?(sifirdanBuyukUcBasTernary) ? ("3 basamaklı sayi") ://0'dan buyuk 3 basamakli ise incelendi
                   (sifirdanBuyukUcBasDegilCiftTernary ? "3 basamaklı olmayan çift sayı" : "3 basamaklı olmayan tek sayı ") :     //0'dan buyuk 3 basamakli degilse incelendi
                   ("Lutfen Sifirdan buyuk pozitif bir tamsayi giriniz");//0'dan kucuk olma durumu incelendi
           System.out.println(sonuc);

       }
}
