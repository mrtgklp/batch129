package batch129.java.day28hatalar;

public class C06_Exceptions {
    //6)
    public static void main(String[] args) {
        //Verilen bir string Integer a ceviriniz Integer i karakter sayısına bolunuz
        //double d = divideString("123k");
        double d1 = divideString("123*");
        //System.out.println(d);
        System.out.println(d1);

    }//main
    /*
    private static double divideString(String str) {
        int length = str.length();//NullPointerEXception
        int length1 = str.length();//NumberFormatException
        int length2 = str.length();//AritmeticException
        int i = 0;
        double sonuc = 0;
        try {
            length=str.length();
            i=Integer.valueOf(str);
            sonuc = i/length;
        } catch (NullPointerException e) {
            System.out.println("Nullpointer Exception verdi" +e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormat Exception verdi" +e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception verdi" +e.getMessage());
        }


        return sonuc;


    }*/
    public static double divideString(String str) {

        int length = 0;//AritmeticException
        int i = 0;
        double sonuc = 0;
        try {
            length=str.length();
            i=Integer.valueOf(str);
            sonuc = i/length;
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormat Exception verdi" +e.getMessage());
        }
        catch (Exception e) {
            System.out.println(" 911 Exception verdi " + e.getMessage());
        }


        return sonuc;


    }
}//class
