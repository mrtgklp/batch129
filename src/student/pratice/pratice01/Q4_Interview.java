package student.pratice.pratice01;

import java.util.Scanner;

public class Q4_Interview {
      /*

     Interview Question
     Kullanicidan 100’den kucuk bir tamsayi isteyin.
     1’den baslayarak girilen sayiya kadar tum sayilari yazdirin.
     Ancak;
     - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
     - Sayi 5’in kati ise sayi yerine "Guzeldir" yazdirin.
     - Sayi hem 3’un hem 5’in kati ise sayi yerine " ** Java Guzeldir ** " yazdirin.
*/
      public static void main(String[] args) {


          Scanner input = new Scanner(System.in);
          System.out.println("lütfen 100 den kucuk bir tamsayı giriniz");
          int sayı = input.nextInt();

          for (int i = 0; i <=sayı ; i++) {
              if (i%3==0 && i%5==0){
                  System.out.println(" ** Java Güzeldir");
              }
              else if(i%3==0){
                  System.out.println("Java");
              } else if (i%5==0) {
                  System.out.println("Guzeldir");
              }else System.out.println(i + "");
          }
      }
}
