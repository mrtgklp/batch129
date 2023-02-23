package batch129.java.day28exceptions;

public class Exceptıons06 {
    public static void main(String[] args) {
        String s = "Java";
        getNumberOfChar(s);

        String t = "";
        getNumberOfChar(t);

        String u = null;
        getNumberOfChar(u);//NullPointerException
    }
    //String in degeri "null" oldugunda String Class daki bazı methodları kullanamayız.Kullanırsanız java "NullPointerException" atar
    public static void getNumberOfChar(String s){
        int numChar = 0;
        try {
            numChar = s.length();
        } catch (NullPointerException e) {
            System.out.println("Null degeri için bazı methodlar kullanılamaz");
        }
        System.out.println(numChar);
    }
}
