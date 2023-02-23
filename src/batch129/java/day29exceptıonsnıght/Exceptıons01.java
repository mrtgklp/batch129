package batch129.java.day29exceptıonsnıght;

public class Exceptıons01 {
    public static void main(String[] args) {
        Object obj = 70;
        String str = "";
        try {
            //Birbirine donusturulemeyecek data type donusturmekte ısrar ederseniz  ClassCastException atar
            str = (String) obj;
            System.out.println(str);

        } catch (ClassCastException e) {
            System.out.println("Her data type i her data type ine cevilmez");
        }
    }
}
