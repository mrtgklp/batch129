package student.pratice.pratice01;

import java.util.Scanner;

public class Q5_BasitTahminOyunu {
    public static void main(String[] args) {
        /*
      10 tane String bir dilek olusturunuz ve kullanicidan bir den 10 a kadar rakamla sayiyi aliniz ve bir sans oyunu olusturunuz
        */

        String bir = "Araba";
        String iki = "Ev";
        String uc = "Is";
        String dört = "Kariyer";
        String bes = "Telefon";
        String altı = "tatil";
        String yedi = "Euro";
        String sekiz = "Dolar";
        String dokuz = "Altın";
        String on = "Saglık";

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 1 den 10 a kadar bir sayı giriniz :");
        String sayı = input.next().toLowerCase();


        switch (sayı){
            case "1":
                System.out.println("Yeni Yılda seni " + bir + " bekliyor");
                break;
            case "2":
                System.out.println("Yeni Yılda seni " + iki + " bekliyor");
                break;
            case "3":
                System.out.println("Yeni Yılda seni " + uc + " bekliyor");
                break;
            case "4":
                System.out.println("Yeni Yılda seni " + dört + " bekliyor");
                break;
            case "5":
                System.out.println("Yeni Yılda seni " + bes + " bekliyor");
                break;
            case "6":
                System.out.println("Yeni Yılda seni " + altı + " bekliyor");
                break;
            case "7":
                System.out.println("Yeni Yılda seni " + yedi + " bekliyor");
                break;
            case "8":
                System.out.println("Yeni Yılda seni " + sekiz + " bekliyor");
                break;
            case "9":
                System.out.println("Yeni Yılda seni " + dokuz + " bekliyor");
                break;
            case "10":
                System.out.println("Yeni yılda seni " + on + " bekliyor");
            default:
                System.out.println("Yanlış bir sayı girdiniz");
        }
    }
}
