package batch129.java.day37lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    //Method Referance ile
    public static void main(String[] args) {


    List<Integer> list = new ArrayList<>();
    list.add(12);
    list.add(9);
    list.add(13);
    list.add(4);
    list.add(6);
    list.add(2);
    list.add(4);
    list.add(12);
    list.add(15);

    tumCıftSayıElemanlarınKupleri(list);
        System.out.println();
        tumElemanTop(list);
        tumTkElemanCarp(list);





}//main

//Tum cift sayi olan elemanlarin kuplerini ekrana yazdiriniz
public static void tumCıftSayıElemanlarınKupleri(List<Integer> list){
     list.stream().filter(Utilities::cıftMI).map(Utilities::kupu).forEach(Utilities::yazInt);
}
//list'deki tum elemanlarin toplamini ekrana yazdiriniz

    public static void tumElemanTop(List<Integer> list){

        System.out.println(list.stream().reduce(Utilities::toplam));
    }





//list'deki tum tek sayi olan elemanlarin carpimini ekrana yazdiriniz

    public static void tumTkElemanCarp(List<Integer> list){
        System.out.println(list.stream().filter(Utilities::tekMi).reduce(Utilities::carpma));

    }

//list'deki 3 ile bolunebilen elemanlarin 2 fazlalarinin toplamini ekrana yazdiriniz
public static  void ucIlebln2Fazlası(List<Integer> list){
        System.out.println(list.stream().filter(Utilities::uceBoluneBilme).reduce(Utilities::toplam));
    }

//list'deki elemanlari ekrana yazdiriniz ama tekrarli olanlari 1 kere yazdiriniz
}
