package recap_lambda2;

import java.util.stream.IntStream;

public class Lambda_Re02 {
    public static void main(String[] args) {

        System.out.println(birXeKadarToplam(10));
        System.out.println(" \n ***********");
        System.out.println(birXeKadarTekSayıTop(7));
        System.out.println(" \n ***********");
        System.out.println(birSonsuzTekSayTop(3));//1,3,5=9
        System.out.println(" \n ***********");
        System.out.println(ikiSonsuzaKadaeCıftSayı(3));//2,4,6=12
        System.out.println(" \n ***********");
        System.out.println(besSonsuzKadKuvvetXeTop(3));//5,25,125=155
        System.out.println(" \n ***********");
        System.out.println(faktöriyel(5));


    }
    //SORU1: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak), toplamını bulup return ederek yazdırınız.
    public static int birXeKadarToplam(int x){
        int sonuc=IntStream.range(1,x+1).sum();//range() methodu sadece 1 alır x almaz x +1 yaparak x almıs oluruz
        return sonuc;
    }
    //SORU2: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak),
    // tek sayıların, toplamını bulup return ederek yazdırınız. (x dahil olacak)
    public static int birXeKadarTekSayıTop(int x){
        int sonuc1= IntStream.rangeClosed(1,x).filter(t->t%2!=0).sum();
        return sonuc1;//rangeClosed()1 den x kadar olan sayıları alırdahil eder
    }
    //SORU3: 1'den sonsuza kadar giden Tek sayılardan,
    // ilk x tanesini toplayınız sonucu return ederek yazdırınız.
    public static int birSonsuzTekSayTop(int x){
       int sonuc2= IntStream.iterate(1,t->t+2).limit(x).sum();
       return sonuc2;
    }
    //SORU4: 2'den sonsuza kadar giden Çift sayılardan,
    // ilk x tanesini toplayınız sonucu return ederek yazdırınız
    public static int ikiSonsuzaKadaeCıftSayı(int x){
        int sonuc3 = IntStream.iterate(2,t->t+2).limit(x).sum();
        return sonuc3;
    }
    //SORU5: 5'den sonsuza kadar giden kuvvetlerinden
    // ilk x kuvvetinin toplamını return ederek yazdırınız
    public static int besSonsuzKadKuvvetXeTop(int x){
        int sonuc4 = IntStream.iterate(5,t->t*5).limit(x).sum();
        return sonuc4;
    }
    //Soru6: x sayısının faktoriyelini bulunuz.
    public static int faktöriyel(int x){
        int sonuc5= IntStream.rangeClosed(1,x).reduce(1,(a,b)->a*b);
        return sonuc5;
    }

}
