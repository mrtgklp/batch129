package smallstudy02;

import java.util.ArrayList;
import java.util.List;

public class List03 {
    // bir listede ortalamanin ustunde olan element sayisini bulunuz
    public static void main(String[] args) {
        // bir listede ortalamanin ustunde olan element sayisini bulunuz

        List<Double> sayilar = new ArrayList<>();
        sayilar.add(1.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(6.0);
        sayilar.add(1.0);
        sayilar.add(7.0);

        double ortalama = 0;
        double toplam = 0;

        for (Double w : sayilar){
            toplam +=w;

        }
        ortalama = toplam/sayilar.size();
        System.out.println(ortalama);
        List<Double> ortamainÜstündekiSayılar = new ArrayList<>();

        for (int i = 0; i <sayilar.size() ; i++) {
            if (sayilar.get(i)>ortalama){
                ortamainÜstündekiSayılar.add(sayilar.get(i));
        }

    }
        System.out.println(ortamainÜstündekiSayılar);
    }
}
