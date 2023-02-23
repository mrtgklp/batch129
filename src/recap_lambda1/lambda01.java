package recap_lambda1;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class lambda01 {
    public static void main(String[] args) {
        List<Integer> sayı = new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));
        cıftVepozitifLamExYazdır(sayı);
        System.out.println(" \n *************");
        ciftVePozitifMetRef(sayı);
        System.out.println(" \n *************");
        kareYAzdır(sayı);
        System.out.println(" \n *************");
        kareTekrarsız(sayı);
        System.out.println(" \n *************");
        buyKucSıralama(sayı);
        System.out.println(" \n *************");
        pozıtıfKupBırlerBas5(sayı);
        System.out.println(" \n *************");
        methodRefTopBul(sayı);
        System.out.println(" \n *************");
        toplamLambdaEx(sayı);
        System.out.println(" \n *************");
        System.out.println(pozitifElCarpımLamEx(sayı));
        System.out.println(" \n *************");
        System.out.println(cıftElKareKucBuySırLıstReturn(sayı));
        System.out.println(" \n *************");


    }
    //Soru1 :
    public static void cıftVepozitifLamExYazdır( List<Integer> sayı){
        sayı.stream().filter(t->t%2==0 && t>0).forEach(t-> System.out.print(t + " "));
    }
    //Soru2:
    public static void ciftVePozitifMetRef( List<Integer> sayı){
        sayı.stream().filter(t->t%2==0 && t >0).forEach(Utilies::yazdır);

    }
    //Soru3:
    public static void kareYAzdır( List<Integer> sayı){
        sayı.stream().map(Utilies::kareBul).forEach(Utilies::yazdır);

    }
    //Soru4 : List elemanlarının karelerini tekrarsız yazdırın
    public static void kareTekrarsız(List<Integer> sayı){
        sayı.stream().map(Utilies::kareBul).distinct().forEach(Utilies::yazdır);
    }
    //Soru5: List elemanlarını buyukten kucuge sıralayarak yazdırın
    public static void buyKucSıralama(List<Integer> sayı){
        sayı.stream().sorted(Comparator.reverseOrder()).forEach(Utilies::yazdır);
    }
    //Soru6 : list elemanlarının pozitif olanlarının,kuplerini bulup,birler basamagı 5 olanlarını yazdırınız
    public static void pozıtıfKupBırlerBas5(List<Integer> sayı){
        sayı.stream().filter(t->t>0).map(t->t*t*t).filter(t->t%10==5).//filter(t->t%10==5) birler basamagı 5 olması için ikince kez yazıldı
                forEach(Utilies::yazdır);
    }
    //Soru7: List elemanlarının Method References ile toplamın bulun ve yazdırın
    public static void methodRefTopBul(List<Integer> sayı){
        Optional<Integer> sonuc = sayı.stream().reduce(Integer::sum);//reduce(Integer::sum)==> Toplamlarını alır.
        // reduce() methodu terminal methoddur baska method kullanılmaz.terminal methodlardan sonra foreach gibi methodlar kullanılmaz
        System.out.println(sonuc);
    }
    //Soru8 : List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın
    public static void toplamLambdaEx(List<Integer> sayı){
       int toplam = sayı.stream().reduce(0,(t,u)->t+u);
        System.out.println(toplam);
    }
    //Soru9 : List elemanlarının,carpımını Lambda Expression ile return ederek yazdırın
    public static  int pozitifElCarpımLamEx(List<Integer> sayı){
        int sonuc = sayı.stream().filter(t->t>0).reduce(1,(a,b)->a*b);
        return sonuc;
    }
    //Soru10: Listin cift elemanlarının,karelerini,kucukten buyuge sıralayıp list halinde return ederek yazdırınız.
    public static List<Integer> cıftElKareKucBuySırLıstReturn(List<Integer> sayı){
     List<Integer> sonuc =   sayı.stream().filter(t->t%2==0).map(t->t*t).sorted().collect(Collectors.toList());
    return sonuc;
    }

}
