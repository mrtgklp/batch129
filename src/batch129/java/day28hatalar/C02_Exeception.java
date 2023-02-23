package batch129.java.day28hatalar;

public class C02_Exeception {
    /*
         2)StringOutOfExceptions
     */
    //Bir String in indexdeki datasını bize veren kodu yazın
    public static void main(String[] args) {
        char ch = getCharFromString("Hakan",3);
        System.out.println("ch = " + ch);
    }

    private static char getCharFromString(String str, int i) {
        char c= ' ';
        try {
            c= str.charAt(i);
        }
        catch (Exception e){
            System.out.println("Kendim ekledigim e.getmessega calıstı" +e.getMessage());
        }
        return c;
    }
}
