package batch129.java.day08nestedifternary;

import java.util.Scanner;

public class NestedIf04 {
    public static void main(String[] args) {
          /*
               Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
               Eger calisan kadin ise;
                60 yasindan buyukse "Emekli Olabilir "yazdirin
               Eger calisan erkek ise;
                65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
            */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi belirtiniz Erkek veya Kadın ");
        String gender = input.nextLine();
        System.out.println("Lütfen yasınızı giriniz ");
        byte age = input.nextByte();

        if(age<=0 || age>=120){
            System.out.println("lütfen 0 ile 120 hericinde bir deger giriniz..");
        }else if(gender.equalsIgnoreCase("Kadın")){
            if(age >=60){
                System.out.println("Emekli olabilir..");
            }else System.out.println("Emekli olamaz biraz daha gayret etmeli..");

        } else if (gender.equalsIgnoreCase("Erkek")) {
            if(age>= 65){
                System.out.println("Emekli olabilir eger hayattaysa");
            }
            else System.out.println("Emekliye daha var çalış aslan parcası");
        }else System.out.println("tanımlı değil");


    }
}
