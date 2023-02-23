package batch129.java.day29exceptıons;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_Exceptıons {
    /*
    8)  InputMismatchExceptıons
     */
    public static void main(String[] args) {
        //Verilen bir arrayden kullanıcıdan index isteyin verilen index deki datayı yazdırır
        int arr[] = {2,3,5,9,7,45};
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen index için sayı giriniz.");
        //
        int index = 0;
        try {
            index = input.nextInt();
            System.out.println("Girilen indexdeki eleman : " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz index te eleman arrayde yok " + e.getMessage());
            e.printStackTrace();
        }
        catch (InputMismatchException e) {
            System.out.println("Girdiginiz index sayı olmalı InputMismatchException " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Do not stop,keep going road");


    }//main
}
