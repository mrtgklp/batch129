package recap_lambda1;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) {
       List<String> meyve = new ArrayList<>(Arrays.asList("elma","portagal","uzum","cilek","greyfut","nar",
                "mandalina","armut","elma","keciboynuzu","elma"));
        ilkHarfVeyac(meyve);
        System.out.println("\n **********");
        elemanBasVeSonunYıldız(meyve);
        System.out.println("\n **********");
        System.out.println(karakterSayGoreBuyKucSırKarSayEnBuyIlk3(meyve));
        System.out.println("\n **********");


    }
    //Soru1 : list elemanlarının ilk harfi 'e' veya 'c' olanları,Method References ile aralarında bosluk bırakarak yazdıralım
    public static void ilkHarfVeyac(List<String> meyve){
        meyve.stream().filter(t->t.startsWith("e")|| t.startsWith("c")).forEach(Utilies::yazdır);
    }
    //Soru2: List elemanlarının hepsinin basına ve sonuna yıldız ekleyerek yazdırılam
    public static void elemanBasVeSonunYıldız(List<String> meyve){
        meyve.stream().map(t->"*" + t + "*").forEach(Utilies::yazdır);
    }
    //Soru3: List elemanlarını karakter sayısına gore buyukten kucuge sıralayınız.
    //      karakter sayısı en buyuk ilk 3 elemanı list halinde return ederek yazdırınız.
    public static List<String> karakterSayGoreBuyKucSırKarSayEnBuyIlk3(List<String> meyve){

    List<String> sonuc = meyve.
                stream().
                sorted(Comparator.comparing(t->t.toString().length()).//toString() eklemek gerekir
                reversed()).limit(3).collect(Collectors.toList());
        return sonuc;
    }
}
