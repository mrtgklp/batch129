package batch129.java.day28hatalar;

public class C05_Exceptions {
    //5) AritmeticExceptions

    public static void main(String[] args) {
        //divide(6,2);//3
        //divide(0,2);//0
        divide(6,0);//çalışmaz
        divide1(12,0);//çalışmaz
    }

    public static void divide1(int a, int b) {
        try {//Handıl etmek
            System.out.println(a/b);
            System.out.println("try kısmı calıstı");
        } catch (ArithmeticException yunus) {
            yunus.printStackTrace();
            System.out.println("Bir sayı sıfıra bölunemez " + yunus.getMessage());
            System.err.println("Bölme de hata oluştu");//ser
        }

    }

    ///////////////////////////////////////////////
    private static void divide(int a, int b) {
        if (b == 0){
            System.out.println("Bir sayı sıfır ile  bölünemez");
        }
        else
        System.out.println(a/b);
    }

}
