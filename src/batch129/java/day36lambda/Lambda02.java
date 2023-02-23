package batch129.java.day36lambda;


import java.util.*;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) {
        Universite u1 = new Universite("hacettepe","fizik",1200,88);
        Universite u2 = new Universite("bogazici","qa",400,90);
        Universite u3 = new Universite("odtu","dev",900,95);
        Universite u4 = new Universite("marmara","matematik",3000,82);
        Universite u5 = new Universite("ege","elektrıkelektronik",2000,83);
        Universite u6 = new Universite("balıkesir","matematik",250,78);
        Universite u7 = new Universite("istanbul","matematik ogretmenligi",7000,89);
        Universite u8 = new Universite("karaelmas","matematik",1800,80);


        List<Universite> unv = new ArrayList<>(Arrays.asList(u1,u2,u3,u4,u5,u6,u7,u8));
        System.out.println(notOrt75enByk(unv));
        System.out.println();
        System.out.println(mtkVrmYkm(unv));
        System.out.println();
        System.out.print("ogrcSylBykKc");
        System.out.println(ogrncSylrsBykKck(unv));
        System.out.print("Matematik bolum sayısı : ");
        System.out.println(mtmtkBlmSys(unv));
        System.out.println();
        System.out.print("Ogrenci sayısı 550 az olan universiteler : ");
        System.out.println(ogrcSylr550EnBykNotOrt(unv));
        System.out.print("Ogrenci sayısı 1050 den az universitelerin not ort: ");
        System.out.println(ogrcSys1050AzEnKckNotOrt(unv));


    }//Main
    //Task 01 :  Butun universitelerin not ortalamasının 75'ten buyuk oldugunu
    //          gosteren bir program olusturunuz.
    public static  boolean notOrt75enByk(List<Universite> unv){
        return unv.stream().
                allMatch(t->t.getNotOrtalaması()>75);
    }
    //Task 02 :  universitelerden herhangi birinde matematik bolumu olup olmadıgını kontrol eden
    //          gosteren bir program olusturunuz.

   public static boolean mtkVrmYkm(List<Universite>unv){
    return  unv.
            stream().
            anyMatch(t->t.getBolum().equalsIgnoreCase("matematik"));
    }


        // Task 03 : Universiteleri ogrenci sayilarina gore buyukten kucuge siralayan
       //    bir program olusturunuz.
    public static List<Universite> ogrncSylrsBykKck(List<Universite>unv){
        return
        unv.
                stream().
                sorted(Comparator.comparing(Universite::getOgrencıSayısı).reversed()).
                collect(Collectors.toList());//Stream yapısındaki datalar list haline getirildi.

    }


      //Task 04-->"matematik" bolumlerinin sayisini  print ediniz.
    public static int mtmtkBlmSys(List<Universite>unv){
      return (int) unv.
                   stream().
                   filter(t->t.getBolum().equals("matematik")).//equals esitlemede kullanılır
                   count();//count() sayma islemi yapar
    }


       //Task 05-->Ogrenci sayilari 550'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz.
        public static OptionalInt ogrcSylr550EnBykNotOrt(List<Universite>unv){
            return unv.
                    stream().
                    filter(t->t.getOgrencıSayısı()>550)
                    .mapToInt(t->t.getNotOrtalaması()).//mapToInt ile degeri guncelledik,
                    // max() methodundan null gelme ihtimali wrapper classlarda var.OptionalInt return etmeni ister.
                    max();
        }


      //Task 06-->Ogrenci sayilari 1050'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.
    public static OptionalInt ogrcSys1050AzEnKckNotOrt(List<Universite>unv){
        return unv.
                stream().
                filter(t->t.getOgrencıSayısı()<1050).
                mapToInt(t->t.getNotOrtalaması()).
                min();

    }

}
