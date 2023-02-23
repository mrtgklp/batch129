package batch129.java.day28exceptions;

public class Exceptıons04 {
    public static void main(String[] args) {
        String arr[] = {"A", "G", "M", "L"};
        getElementFromArray(arr, 1);
        getElementFromArray(arr, 5);
        System.out.println("Hi!");
    }
 //Arraylerde olmayan index kullanıldıgında ArrayIndexOutOfBoundsException  atar.
    public static void getElementFromArray(String[] s, int idx) {
        String el = null;
        try {
            el = s[idx];
            System.out.println(el);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }

    }
}
