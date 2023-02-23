package pratice.praticeDTNT07;

public class C01_Exceptıons {
    public static void main(String[] args) {
        //Verilen iki string in uzunluk acısından birbirinin kac katı oldugunu veren  kodu yazınız


       double result = karakterSayısınıKarsılastır("Tester","Developer");
        System.out.println("sonuc1 = " + result);

       double result1 = karakterSayısınıKarsılastır("Tester","");
       System.out.println("sonuc2 = " + result1);
        double result2 = karakterSayısınıKarsılastır(null,"MehmetG");
        System.out.println(result2);
    }//main

    private static double karakterSayısınıKarsılastır(String str1, String str2) {
        float result = 0;
        try {
            result = str1.length()/str2.length();
            System.out.println("result = " + result);
        } catch (ArithmeticException e) {
            System.err.print("Payda sıfır olamaz ==> " + e.getMessage());
           //e.printStackTrace();
        }catch (NullPointerException e) {
                System.err.print("Legent method null ile hata verir ==> " + e.getMessage());
                //e.printStackTrace();
        }
        finally {//Her şekilde calışır
            System.out.println("Database ile baglantı kesilsin...");
        }
        return result;
    }
}
