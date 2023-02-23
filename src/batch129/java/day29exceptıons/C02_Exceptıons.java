package batch129.java.day29exceptıons;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_Exceptıons {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            FileInputStream fis = new FileInputStream("src/day29exceptıons/TextExceptıons");
            fis.skip(45);//45 byte lik data atlanıldı
            System.out.println("45 byte lik data atlanıldı");
            int i = fis.read();
            while (i != -1){
                System.out.print((char)i);
                i = fis.read();
            }
        } catch (Exception e) {
            System.out.println(" FilePath yolu yanlıs yada dosya silinmis: " + e.getMessage());
        }//Catch
        System.out.println("Not stop road Keep going..");

    }//main
}//Class
