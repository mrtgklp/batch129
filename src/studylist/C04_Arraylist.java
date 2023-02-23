package studylist;

import java.util.ArrayList;
import java.util.List;

public class C04_Arraylist {

    public static void main(String[] args) {
        List<String> urunIsmi = new ArrayList<>();
        List<String> eskiUrunler = new ArrayList<>();


        urunIsmi.add("Cay");
        urunIsmi.add("ikram");
        urunIsmi.add("cekirdek");
        urunIsmi.add("kahve");

        String silinecekUrun = "cekirdek";
        int temp =urunIsmi.indexOf(silinecekUrun);
        eskiUrunler.add(silinecekUrun);
        System.out.println(urunIsmi);

        urunIsmi.remove(temp);
        urunIsmi.add(temp,"oyuncak");
        System.out.println(urunIsmi);


        System.out.println(eskiUrunler);

    }
}
