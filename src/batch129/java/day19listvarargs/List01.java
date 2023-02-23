package batch129.java.day19listvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List01 {
    public static void main(String[] args) {
        //Example 1: Verilen bir listteki elemanları tekrarsız olarak yazdırınız.
        //          [2,3,2,2,3,5]===> [2,3,5]
        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(2);
        myList.add(3);
        myList.add(5);
        System.out.println(myList);//[2, 3,2,2,3, 5]
        List<Integer> varMı = new ArrayList<>();

        for (Integer w: myList
             ) {

            if (!varMı.contains(w)){
                varMı.add(w);
            }
        }
        System.out.println(varMı);//[2, 3, 5]

        //Example 2: Müşterinden ürün ismini alınız sonra
        //          müşterini ismini verdigi ürün listede varsa ürünü ismini yazdırınız
        //          müşterini ismini verdigi ürün listede yoksa depoda yok"out of stock" yazdırın
        Scanner input = new Scanner(System.in);
        System.out.println("Ürün aramayı sistemimize hoşgeldiniz");
        System.out.println("Ürün aramayı sonlandırmak için Q'ya basınız");


        List<String> products = new ArrayList<>();

        products.add("TV");
        products.add("Radio");
        products.add("iPad");
        products.add("PC");
        products.add("Notebook");
        products.add("Mobile Phone");
        /*
            for loop kurunuz, products listindeki tüm karakterlerini set() methodu kullanarak kucuk harfe ceiriniz
            Kullanıcıdan gelen ürün ismini de kücük harfe cevirin

         */

        do {

            System.out.println("Aradıgınız ürünün ismini giriniz...");

            String product = input.nextLine().toLowerCase();
            if (product.equalsIgnoreCase("Q")){
                break;
            }
            else if (products.contains(product)){
                System.out.println(product + " is in stock");
            }
            else{
                System.out.println(product + " Out of stock!....");
            }
        }while (true);
        System.out.println("Sitemizi kullandıgınız için teşekkür eder tekrar bekleriz...");



    }
}
