package recap_lambda2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda_Re01 {
    public static void main(String[] args) {
        Apartmant da01 = new Apartmant("Dogu", 1, 7000);
        Apartmant da02 = new Apartmant("Batı", 2, 10000);
        Apartmant da03 = new Apartmant("Güney", 3, 12000);
        Apartmant da04 = new Apartmant("Kuzey", 4, 15000);

        List<Apartmant> daireler = new ArrayList<>(Arrays.asList(da01, da02, da03, da04));
        System.out.println(tumDairKi5000BuyukTrue(daireler));//true
        System.out.println(" \n *******");
        System.out.println(enAzKatSayı(daireler));//true
        System.out.println(" \n *******");
        System.out.println(cepheDoguMı(daireler));
        System.out.println(" \n *******");
        System.out.println(katSayBuyKucSıra(daireler));
        System.out.println(" \n *******");
        System.out.println(enBuyKucKıraKatSay(daireler));//15000
        System.out.println(" \n *******");
        enBuyKucKıraKatSay2(daireler);//15000
        System.out.println(" \n *******");
        System.out.println(katSay3AzKiraKucBuySıra(daireler));//7000
        System.out.println(" \n *******");


    }

    //Soru1: Tüm dairlerin kira'ların 5000'den buyuk ise return ederek True yazdırın
    public static boolean tumDairKi5000BuyukTrue(List<Apartmant> dair) {
        Boolean sonuc = dair.stream().allMatch(t -> t.getKira() > 5000);
        return sonuc;
    }

    //Soru2:Dairlerden en az birinin kat sayısı 2 ise return ederek True yazdırın
    public static boolean enAzKatSayı(List<Apartmant> daire) {
        Boolean sonuc1 = daire.stream().anyMatch(t -> t.getKatSayı() == 1);
        return sonuc1;
    }

    //Soru3: Dairlerden cephesi 'dogu' olanların,sayısını return ederek yazdırın.
    public static long cepheDoguMı(List<Apartmant> daire) {
        long sonuc2 = daire.
                stream().
                filter(t -> t.getCephe().contains("Dogu")).
                count();
        return sonuc2;
    }

    //Soru4:Dairleri,katSayısına göre buyukten kucuge sıralayınız
    // list halinde return ederek yazdırın.
    public static List<Apartmant> katSayBuyKucSıra(List<Apartmant> daire) {
        List<Apartmant> sonuc3 = daire.
                stream().
                sorted(Comparator.comparing(Apartmant::getKatSayı).reversed()).
                collect(Collectors.toList());
        return sonuc3;
    }

    //SORU5: katSayisi 2'den fazla olan daireleri, kiraya gore buyukten kucuge sıralayınız
    // en buyuk kira'sını list halinde return ederek yazdırınız.
    public static List<Integer> enBuyKucKıraKatSay(List<Apartmant> daire) {
        List<Integer> sonuc4 = daire.
                stream().
                filter(t->t.getKatSayı()>2).
                sorted(Comparator.comparing(Apartmant::getKira).reversed()).
                limit(1).
                map(t->t.getKira()).limit(1).
                collect(Collectors.toList());
        return sonuc4;
    }
    //2.Yol
    //SORU5: katSayisi 2'den fazla olan daireleri, kiraya gore buyukten kucuge sıralayınız
    // en buyuk kira'sını list halinde return ederek yazdırınız.
    public static void enBuyKucKıraKatSay2(List<Apartmant> daire) {
        Stream<Integer> sonuc5 = daire.
                stream().
                filter(t->t.getKatSayı()>2).
                sorted(Comparator.comparing(Apartmant::getKira).reversed()).
                limit(1).
                map(t->t.getKira());
        System.out.println(Arrays.asList(sonuc5.toArray()));
    }
    //SORU6: katSayisi 3'den az olan daireleri, kiraya gore kucukten buyuge sıralayınız
    // en kucuk kira'sini list halinde return ederek yazdırınız.
    public static List<Integer> katSay3AzKiraKucBuySıra(List<Apartmant> daire){
        List<Integer> sonuc6= daire.stream().
                filter(t->t.getKatSayı()<3).
                sorted(Comparator.comparing(Apartmant::getKatSayı)).
                limit(1).
                map(t->t.getKira()).
                collect(Collectors.toList());
        return sonuc6;
    }


}
