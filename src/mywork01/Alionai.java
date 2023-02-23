package mywork01;

import java.util.Scanner;

public class Alionai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How I can win heart alionai");
        System.out.println("Entry about Alionai");
        String love = input.nextLine();
        int a = 0;
        try {
            a = 1;
            for (int i = 0; i < a; i++) {
                System.out.println("I love you very much");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



        switch (love){

            case "A":
                System.out.println("Alionai süper person...");
                break;
            case "l":
                System.out.println("love work, Alionai is very successful everything...");
                break;
            case "i":
                System.out.println("in Alionai heart very great...");
                break;
            case "o":
                System.out.println("On the home very beautiful my love...");
                break;
            case "n":
                System.out.println("New Alionai need travel in istanbul...");
                break;
            case "a":
                System.out.println("Alionai very beautiful a woman like angels...");
                break;
            case "İ":
                System.out.println("inside Alionai heart in place give me...");
                break;
            default:
                System.out.println("Alionai need me...");

        }

    }


}
