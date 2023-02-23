package studylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C06_Arralist {
    public static void main(String[] args) {
        Random rnd = new Random();
        int tepm = 0;
        List<Integer> randomSayılar = new ArrayList<>();

        while (randomSayılar.size()<200){
            tepm = rnd.nextInt(1000);
            if (!randomSayılar.contains(tepm)){
                randomSayılar.add(tepm);
            }
        }
        System.out.println(randomSayılar);
        boolean bildiMi = false;
        int tahminSayısı = 1;
        while (!bildiMi){
            System.out.println("Lutfen 1000 den kucuk sayı giriniz");
            Scanner scan = new Scanner(System.in);
            tepm = scan.nextInt();

            if (randomSayılar.contains(tepm)){
                System.out.println("tebrikelr " + tahminSayısı + ". tahminde bukundunuz");
            }
            else {
                System.out.println("Yanlış tahminde bulundunuz");
            }
        }





    }
}
