package mywork01;

public class asd {
    public static void main(String[] args) {

        int[][] x = {{82, 1}, {0, 70, 80}};

        System.out.println(m(x[1]));
    }
    public static int m(int[] m) {

        int result = m[1];

        for (int i = 0; i < m.length;                   i++){

            result += m[i];

        }

        return result;

    }

}
