package pratice.pratice.nighttime06;

public class MethodReturn {
    public static void main(String[] args) {

       //int alan = dikdörtgeninAlanı(5,10) + 5;//55
        System.out.println(dikdörtgeninAlanı(5,10)+9);

    }

    private static int dikdörtgeninAlanı(int a, int b) {
        return a*b;
    }
}
