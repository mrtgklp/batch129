package mywork01;

import java.util.Scanner;

public class Elenam {
    public static void main(String[] args) {
        Scanner elena = new Scanner(System.in);
        System.out.println("Welcome to My heart ");
        int elenam = elena.nextInt();
        switch (elenam){
            case 1:
                System.out.println("I love you very much");
              break;
            case 2:
                System.out.println("Elena everything for me");
                break;
            case 3:
                System.out.println("Elenam my sunshine");
                break;
            case 4:
                System.out.println("I wait elenam in istanbul");
                break;
            default:
                System.out.println("I will love you forever..");
        }
    }
}
