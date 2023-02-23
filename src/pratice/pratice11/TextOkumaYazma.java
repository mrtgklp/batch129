package pratice.pratice11;

import java.io.*;

public class TextOkumaYazma {
    //Bir text dosyasındaki her satırın kelime sayısını o dosyada her satırın sonun yazdıran bir kod yazınız.
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:/Users/ASUS/OneDrive/Desktop/Yeni klasör/HelloWorld.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String satır = bufferedReader.readLine();
        String yeniDosya = "";
        while (satır != null) {
            yeniDosya += satır + "==>Satır Kelime Sayısı: "+satır.split(" ").length+"\n";
            satır = bufferedReader.readLine();
        }
        System.out.println("Yenı dosya = " + yeniDosya);
        bufferedReader.close();
        FileWriter fileWriter = new FileWriter("C:/Users/ASUS/OneDrive/Desktop/Yeni klasör/Yeni Metin Belgesi.txt");
        fileWriter.write(yeniDosya);
        fileWriter.close();
    }
}
