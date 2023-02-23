package smallstudygroup;

import java.util.Scanner;

public class Switch02 {
    // Kullanicidan kacinci ay oldugunu alip mevsimi yazdiran bir
    // switch olusturun


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Bir mevsim giriniz: ");
        int seasons = input.nextInt();

        switch (seasons){
            case 12:
            case 1:
            case 2:
                System.out.println("Winter season...");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring season...");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer season...");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn season...");
                break;
            default:
                System.out.println("You entered invalid season number...");
        }
    }
}
