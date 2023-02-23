package batch129.java.day32collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
    public static void main(String[] args) {
        //LinkedHashSet olusturma
        LinkedHashSet<String> artist = new LinkedHashSet<>();
        artist.add("Ajda");
        artist.add("Tom");
        artist.add("Brad");
        //"Set"ler tekrarsız eleman içerirler.
        //Siz aynı elemanı tekrar tekrar eklerseniz java hata vermez,ama tekrarli eklenen elemani "Set" e sadece bir koyar.
        artist.add("Tom");
        artist.add("Angelina");
        System.out.println("lhs = " + artist);//lhs = [Ajda, Tom, Brad,Tom, Angelina]

        LinkedHashSet<String> actress = new LinkedHashSet<>();
        actress.add("Ajda");
        actress.add("Angelina");

        artist.removeAll(actress);
        System.out.println("artist = " + artist);//artist = [Tom, Brad]


    }
}
