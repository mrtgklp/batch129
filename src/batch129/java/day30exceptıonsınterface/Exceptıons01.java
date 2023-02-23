package batch129.java.day30exceptıonsınterface;

public class Exceptıons01 {
    /*
      1)Exceptıon olsada olmasada calıstırmamız gereken kodları fınally block içine yazarız.
      2)Data base baglantıyı kesmek işini yapan kodlar kodalar herhalukada calıstırmalıdır .
        Bu tarz kodları fınally block içine koyarız.
      3)try block yalnız kullanılamaz.
        try block  + 1 catch block mumkundur
        try block + 1 catch block + 1 fınally mumkundur
        try block + coklu catch block mumkundur
        try block + coklu catch block + 1 fınally mumkundur
        try block + 1 fınally mumkundur
      4)coklu fınally block kullanılamaz

       */
    public static void main(String[] args) {
        int a = 12;
        int b = 3;
        int c[] = {3,6,9,12};

        m(c,a,b);
    }
    public static void m(int[] c,int a,int b){

        try {
            int idx = 0;
            idx = a/b;
            int element= c[idx];
            System.out.println(element);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("cut the connectıon with the Database ");
        }


    }
}
