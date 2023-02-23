package batch129.java.day37lambda;

public class Utilities {
    public static void yazInt(int n){
        System.out.print(n + " ");
    }
    public static void yazString(String s){
        System.out.print(s + " ");
    }
    public static boolean tekMi(int n){
        return n %2!=0;
    }
    public static boolean cıftMI(int n){
        return n%2==0;
    }
    public static boolean pozitifMI(int n){
        return  n >0;
    }
    public static boolean negatıfMI(int n){
        return  n < 0;
    }
    public static int karesi(int n){
        return  n*n;
    }
    public static int kupu(int n){
        return  n *n*n;
    }
    public static int toplam(int a,int b){
        return  a + b;
    }
    public static int carpma(int a,int b){
        return  a * b;
    }
    public static boolean uceBoluneBilme(int n){
        return  n%3==0;
    }
}
