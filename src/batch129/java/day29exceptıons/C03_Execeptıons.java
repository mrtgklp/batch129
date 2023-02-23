package batch129.java.day29exceptıons;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_Execeptıons {
    public static void main(String[] args) throws IOException {
        //available() == kullanılabilir byte sayısını bize verir.

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/day29exceptıons/TextExceptıons");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Kullanılabilir byte sayısını bize verir " + fis.available());//5922
        //Dosyadan 3 byte  lik data okudu
        fis.read();
        fis.read();
        fis.read();
        System.out.println("Kullanılabilir byte sayısını bize verir " + fis.available());//5919






    }//main
}//class
