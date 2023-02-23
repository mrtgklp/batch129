package advanced_pratice.practice02.practice12;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Q04_Random_AdOlusturma {
    //Rastgele alınan harfleri bir Stringe ekleyerek adınızı oluşturan ve bunu kaç deneme ile yaptığını yazdıran bir kod yazınız.
    public static void main(String[] args) {
        String alfabe = "abcçdefgğhıijklmnoöpqrstuüvwxyzABCÇDEFGĞHIİJKLMNOÖPQRSTUÜVXYZ ";
        String isim = "Ali Can";
        String yeniIsım = "";

        int sayac = 0;

        for (int i = 0;i<isim.length();i++){
            while (true){
                char rastgeleHarf = alfabe.charAt((int) (Math.random() * alfabe.length()));
                sayac++;
                if (isim.charAt(i)==rastgeleHarf){
                   yeniIsım+=rastgeleHarf;
                    System.out.println(" Yeni isim = " + yeniIsım);
                    System.out.println("sayac = " + sayac);
                    break;
                }
            }
            System.out.println(sayac);
        }

    }
}
