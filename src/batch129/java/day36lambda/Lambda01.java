package batch129.java.day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    // 1)
    public static void main(String[] args) {

        List<Double> myList = new ArrayList<>();
        myList.add(12.0);
        myList.add(4.0);
        myList.add(7.0);
        myList.add(3.6);
        myList.add(26.8);
        myList.add(38.4);
        myList.add(26.8);

        System.out.println("myList = " + myList);
        List<Double> half = getHalfELementsGreaterThanFiveDistinctReversed(myList);
        System.out.println("half = " + half);

        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("John");
        list.add("Ajda");
        list.add("Angelina");
        list.add("Tom");
        list.add("Brad");
        list.add("Cuneyt");
        System.out.println("list = " + list);
        printAllAlphabeticallyUpperDistinct(list);
        System.out.println();
        printAllALphabeticallyLowerDistinct(list);
        System.out.println();
        printAllSortWithLengthUpperDistinct(list);
        System.out.println();
        printAllSortWithLastCharUpperDistinct1(list);
        System.out.println();
        printAllSortWithLastCharUpperDistinct2(list);
        System.out.println();
        printAllSortWithLengthUpperDistinctSameLengthsInAlphabeticalOrder(list);
        System.out.println();
        //System.out.println(removeElemenIfTheLegenthGreaterThanFive(list));
        //System.out.println(removeElementIfStartsWithAorEndWithd(list));
        System.out.println(printLegenthSquare(list));
        System.out.println();
        System.out.println(printElemensLengthEven(list));
    }
    // 1)Create a method to fşnd the half of the elements greater than 5 ,distinct,in reverse order in a list
        public static List<Double> getHalfELementsGreaterThanFiveDistinctReversed(List<Double> myList){
                return myList.stream().distinct().filter(t->t>5).map(t->t/2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
                
        }
        //2) Tum list elemanlarını buyuk harfle alfabetik sırada tekrarsız olarak yazdırınız
        public  static void printAllAlphabeticallyUpperDistinct( List<String> list){
             list.stream().distinct().map(t->t.toUpperCase()).sorted().forEach(t-> System.out.print( t + " "));
        }
    //3) Tum list elemanlarını kucuk harfle alfabetik sıranın tersinde  tekrarsız olarak yazdırınız
    public  static void printAllALphabeticallyLowerDistinct(List<String> list){
        list.stream().distinct().map(t->t.toLowerCase()).sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t + " "));
    }
    //4) Tum list elemanlarını buyuk harfle uzunluklarına göre artan sırada, tekrarsız olarak yazdırınız

    public  static  void printAllSortWithLengthUpperDistinct(List<String> list){
        list.stream().distinct().map(t->t.toUpperCase()).sorted(Comparator.comparing(t->t.length())).forEach(t-> System.out.print(t + " "));
    }
    //5) Tum list elemanlarını buyuk harfle,son harflerine gore artan sırada, tekrarsız olarak yazdırınız
    public static void printAllSortWithLastCharUpperDistinct1(List<String> list){
        list.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).//t->t.charAt(t.length()-1==> bu ifade lambda expression olarak adlandırılır.
                forEach(t-> System.out.print(t + " "));
    }
    //2.YOl
    public static void printAllSortWithLastCharUpperDistinct2(List<String> list){
        list.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(Utlis::getLastChar).reversed()).//t->t.charAt(t.length()-1==> bu ifade lambda expression olarak adlandırılır.
                forEach(Utlis::printInTheSameLineWithSpace);
    }
    //6) Tum list elemanlarını buyuk harfle uzunluklarına göre artan sırada, tekrarsız olarak yazdırınız
    //  uzunlukları aynı olan elemanlar alfabetik sırada olsunlar
    public static void printAllSortWithLengthUpperDistinctSameLengthsInAlphabeticalOrder(List<String> list){
        list.stream().distinct().
                map(String ::toUpperCase).//String ::toUpperCase yapısına "method reference" denir
                sorted(Comparator.comparing(String :: length).thenComparing(Comparator.naturalOrder())).
                forEach( System.out::println);
    }
    //7)Character sayısı 5 den fazla olan elemanları siliniz.
    public  static List<String> removeElemenIfTheLegenthGreaterThanFive(List<String> list){
        list.removeIf(t->t.length()>5);
        return list;
    }
    //8)"A" ile baslayan veya "d" ile biten elemanları siliniz ve sonucu list olarak yazınız.
    public static List<String> removeElementIfStartsWithAorEndWithd(List<String> list){
        list.removeIf(t->t.startsWith("A")|| t.endsWith("d"));
        //Bazen "stream()"method u bize lazım olan methodlara ulaşmamıza engel olur bu yuzden
        //stream() methodunu kullanmayız."removeIf()" methodunda oldugu gibi.

        //Fakat stream()methodunu daha sonradan kullanmamız gerekebilir.Bu durumda stream() methodunu
        //kullanarak istedigimiz method'lara ulasırız ,distinct(9 method'una ulastıgımız gibi.

        //sonuc bıze list olarak lazım ise "collect(Collectors.toList()) ile sonucu list'e ceviririz.

        return list.stream().distinct().collect(Collectors.toList());
    }
    //9) List elemanlarını character sayılarının karelerini alınız ve bir list olarak ekrana yazdırınız
    public  static List<Integer> printLegenthSquare(List<String> list){
      return   list.stream().map(Utlis::getLegenthSquare).collect(Collectors.toList());
    }
    //10)List elemanlarından character sayısı cift sayı olanları bir list içinde ekrana yazdırınız.
    public static List<String> printElemensLengthEven(List<String> list){
     return     list.stream().filter(Utlis::isLengthEven).collect(Collectors.toList());
    }

}
