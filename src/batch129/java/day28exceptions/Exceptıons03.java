package batch129.java.day28exceptions;



public class Exceptıons03 {
    public static void main(String[] args) {
        String s = "Java";

        getCharFromString(s,2);
        getCharFromString(s,4);
    }
    //Stringlerde var olmayan index ler kullanıldıgında java StringIndexOutOfBoundsException atar.

    public static void getCharFromString(String s,int idx) {
        char ch = 0;
        try {
            ch = s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Olmayan İndex kullanma hatası yaptınız...\n" + e.getMessage());
            System.out.println(e.getCause());//null
            e.printStackTrace();
        }


    }

}
