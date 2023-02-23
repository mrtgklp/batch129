package batch129.java.day28exceptions;

public class Exceptıons02 {
    public static void main(String[] args) {
        String s = "1234";
        covertStringToInt(s);
        
        String t = "1a2b";
        System.out.println("t = " + t);
        covertStringToInt(t);
    }
    //İcinde rakamlar dısında character olan bir string i sayıya cevirmek isterseniz java "NumberFormatException" atar
    public static void covertStringToInt(String s){
        int ints = 0;
        try {
            ints = Integer.valueOf(s);
        } catch (NumberFormatException e) {
            System.out.println("Bir String sayıya donusturulebilmesi için rakam dısı character icermemesi gerekir");
            System.out.println(e.getMessage());
        }
        System.out.println( ints + 1);
    }
}
