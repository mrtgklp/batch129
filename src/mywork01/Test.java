package mywork01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /* Ask user Name, Surname and credit card numbers than convert it to special form.
        (Initials for name and surname should be uppercase)
        (Check credit card number, if there aren’t 16 digit print “Invalid credit card number”

        Input :

        John White 1234234534561478*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen tam isiminiz giriniz : ");
        String fullName = input.nextLine().toUpperCase();
        System.out.println("Lütfen bir kredi kart numarası giriniz :");
        String ccn = "";

        for (int i = 1; i <= 16; i++) {
            if (i<16){
                System.out.print(i + ",");
            }else System.out.println(i);
        }


    }
}
