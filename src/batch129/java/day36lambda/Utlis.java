package batch129.java.day36lambda;

public class Utlis {
    public static int getLegenthSquare(String s){
        return s.length()*s.length();
        //Lambda expression'dan kurtulmanin bir yolu da kendi methodumuzu Util class'dan cagirarak kullanmaktir
    }
    public  static  boolean isLengthEven(String s){
        return s.length()%2==0;
    }
    public static String getLastChar(String s){
      return   s.substring(s.length()-1);
    }
    public static void printInTheSameLineWithSpace(Object obj){
        System.out.print(obj + " ");
    }
    public static boolean isNumberEven(int x){
        return x%2==0;
    }
    public static int getSumOfDigits(int x){
        int sum = 0;
        while (x!=0){
            sum = sum + x%10;
            x = x/10;
        }
        return sum;
    }

}
