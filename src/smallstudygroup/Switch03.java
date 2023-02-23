package smallstudygroup;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        //Toplama, Çıkarma, Çarpma, Bölme ve yüzde Hesaplama yapan basit bir Hesap Makinesi oluşturun:
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day first number...");
        double firstNumber = input.nextDouble();
        System.out.println("Enter day second number...");
        double secondNumber = input.nextDouble();
        System.out.println("Select Operating..+,-,x,/...");
        char operating = input.next().charAt(0);

        switch (operating){
            case '+':
                System.out.println("Total : " + (firstNumber+secondNumber));
                break;
            case '-':
                System.out.println("Difference : " + (firstNumber-secondNumber));
                break;
            case 'x':
                System.out.println("Multiply : " + (firstNumber*secondNumber));
                break;
            case '/':
                System.out.println("Splitting : " + (firstNumber/secondNumber));
                break;
            default:
                System.out.println("Operating inValid....");
        }

    }
}
