package mywork01;

import java.util.Scanner;

public class TersYazdır {
    public static void main(String[] args) {
        // Kullanıcıdan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdırın
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 4 harfli bir cümle giriniz: ");
        String words = input.nextLine();
        String newWords = "";


        if (words.length() == 4) {
            System.out.println("Kelime 4 harften oluşur");
            for (int i = words.length() - 1; i >= 0; i--) {
                newWords += words.charAt(i);
            }
            System.out.println("Ters Kelime : " + newWords);
        }
        else {
            System.out.println("kelime dört harften fazla");
        }
        

    }
}
