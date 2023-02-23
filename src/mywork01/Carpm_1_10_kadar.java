package mywork01;

public class Carpm_1_10_kadar {
    /*
        3----elirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.
    Örnek Sonuç:
    5 x 1 = 5
    5 x 2 = 10
    5 x 3 = 15
    5 x 4 = 20
    5 x 5 = 25
    5 x 6 = 30
    5 x 7 = 35
    5 x 8 = 40
    5 x 9 = 45
    5 x 10 = 50
     */

    public static void main(String[] args) {
        int num = 10;
        int sum = 1;

        for (int i = 1; i <=num ; i++) {

            System.out.println( sum + " x " + i + " = " + (sum*i));
        }
        System.out.println("******************");

        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
            System.out.println("***************************");
        }
    }
    
}
