package batch129.java.day29exceptıons;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_Exceptıon {
    public static void main(String[] args) throws IOException{
        /*
          6) FileNotFoundExceptıons
          7)IOExceptıons

          Java da bir dataya ulaşmak istedigimizde kullanırız.Bir obje oluştururuz.
          Cesitli methodları vardır.
          read() ==> Tas ta ki Dataları okuyor ve getiriyor.
          Okuyacak hic bir data kalmadıgında -1 donduruyor.
          skip() ==>Belirli bir kısmı atlayıp kalan dataları dondurur
          Available() ==> Tas te kac byte lik data oldugunu size gösterir
         */

        FileInputStream fis = new FileInputStream("src/day29exceptıons/TextExceptıons");
        int i;
        try {
            while ((i = fis.read()) != -1){
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            System.out.println(" FilePath yolu yanlıs yada dosya silinmis: " + e.getMessage());


        }
        catch (IOException e){
            System.err.println("Dosya okurken problem olustu" + e.getMessage());
        }
        System.out.println("Durmak Yola devam");

    }
}
