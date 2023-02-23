package batch129.java.day23datetimestringbuilder;

public class StringBuffer01 {
    /*
        String oluşturmak için String Class,String Builder Class ve StringBuffer Class
        1)String Buffer Javanın String üretmek oluşturdugu ilk Classtır.Java 5 de üretilmiştir
        2)StringBuffer "synchronized"dir,StringBuilder"Synchronized"degildir.
        3)StringBuffer "thread-safe"(multi-thread'e uygun)dir,StringBuilder"thread-safe"degildir.
        4)StringBuffer ve StringBuilder ikisi de mutable dir.

        NOte 1: Imutable String lazım oldugunda String Class kullanırız
        NOte 2:Mutable String Lazım oldugunuda StringBulder veya StringBuffer kullanırız
        Note 3: Stringbufefer multithread ve synchronzation lazım oldugunda tercih edilir
                 Stringbufefer "multithread" ve "synchronzation" gerekmezse tercih edilir

     */
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);

        System.out.println(sbf.capacity());//20
    }
}
