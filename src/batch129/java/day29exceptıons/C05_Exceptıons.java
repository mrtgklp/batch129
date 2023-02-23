package batch129.java.day29exceptıons;

import java.util.Scanner;

public class C05_Exceptıons {
    //Yası ekrana yazdıran bir code yazınız
    public static void main(String[] args) {
        //throw Applicatıons kurallarını biz belirlemek istiyorsak throw exceptıons kullanabiliriz
        // throw key word 2 {} arasında body de yer alır
        // throw new key worduyla consctructor olusturur
        // throw bir kez kullanılır
        // throws istenildigi kadar kullanılabilir.
        Scanner input = new Scanner(System.in);
        int yası = input.nextInt();
        System.out.println(yası);

        if (yası<0){
            throw new IllegalArgumentException("Yas negatif olmaz");
        }
        else {
            System.out.println("throw hersey olunda" + yası);
        }
    }
}
