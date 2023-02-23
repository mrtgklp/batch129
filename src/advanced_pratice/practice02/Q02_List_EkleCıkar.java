package advanced_pratice.practice02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_List_EkleCıkar {
    public static void main(String[] args) {
        //Kullanıcdan aldığınız bir sayıyı bir list'e ekleyen, list'ten çıkaran yada
        // mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();


        while (true) {
            System.out.println("Ekleme tapmak için : 'add'\n+" +
                    "Güncellemek için : 'set'\n+" +
                    "Silmek için : 'remove'\n+" +
                    "Çıkmak için : 'break' komutunu giriniz..");
            String komut = input.next();

            if(komut.equalsIgnoreCase("add")){
                System.out.println("Eklemek istediginiz tamsayı giriniz.");
                int eklenecekSayı =input.nextInt();
                list.add(eklenecekSayı);
            }
            else if(komut.equalsIgnoreCase("set")){
                System.out.println("Güncellemek istedginiz sayının indeksini giriniz..");
                int guncellenecekIndex = input.nextInt();
                System.out.println("Yerine girmek eklemek istediginiz sayı giriniz...");
                int newNum = input.nextInt();
                list.set(guncellenecekIndex,newNum);
            }
            else if(komut.equalsIgnoreCase("remove")){
                System.out.println("silmek istediginiz sayı giriniz...");
                Integer silinecekSayı = input.nextInt();
                list.remove(silinecekSayı);
            } else if (komut.equalsIgnoreCase("break")) {
                break;
            }
            else{
                System.out.println("Gecerli bir komut giriniz.....");
            }
            System.out.println(list);

        }
        System.out.println("goodbye goodbye");
    }
}
