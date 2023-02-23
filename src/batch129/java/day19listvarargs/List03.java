package batch129.java.day19listvarargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class List03 {
    public static void main(String[] args) {
         /*
                SAYI TAHMIN OYUNU
                Oyuncudan 1-10 arasi bir sayi isteyiniz
                Elinizdeki listede oyuncunun tahmin ettigi sayi varsa "BINGO" yazdiriniz
                Yoksa verdigi sayiyi listenize ekleyiniz.
                Ilk "BINGO" yu tamamlayana " KAZANDINIZ" yazdiriniz
                [5,8,2,9]  ==> 2 ==> [5,8,BINGO,9]
                [5,8,2,9]  ==> 3  ==>[5,8,BINGO,9,3]
                [5,8,BINGO,9,3] ==> [BINGO,BINGO,BINGO,BINGO,BINGO] ==> KAZANDINIZ
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Oyunumuza Hoşgeldiniz...");
        System.out.println("Oyunu sonlandırmak için Q basınız..");
        //Arrays.aslist ile list oluşturulabilir
        // ama listlerdeki eleman sayısını degiştiren hiçbir method bu list için kullanamaz
        //Dolsıyla bu sorunuhn cozumnunde ihtiycımız olan Lİst "Arrays.aslist" kullanrak oluşturmamalısınız
        //list<Integer>numlist = Arrays.aslist(5,8,2,9)
        List<String> numsList = new ArrayList<>();
        numsList.add("5");
        numsList.add("8");
        numsList.add("2");
        numsList.add("9");
        String num="";
        int counter = 0;
        do {
            System.out.println("Lütfen 1 ile 10 arasında bir tamsayı giriniz...");
            num = input.next();
            if (num.equalsIgnoreCase("Q")){
                break;
            }
            else if (numsList.contains(num)) {
                numsList.set(numsList.indexOf(num), "Bingo");
                counter++;
            }else {
                numsList.add(num);
            }

        } while (counter!= numsList.size());
        System.out.println();
        if (!num.equalsIgnoreCase("Q")){
            System.out.println("Kazandınız");
        }else System.out.println("Oyundan isteyerek ayrıdınız tekrar bekleriz");
        System.out.println("Final report " + numsList);
    }
}
