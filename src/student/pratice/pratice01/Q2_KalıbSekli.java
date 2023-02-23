package student.pratice.pratice01;

public class Q2_KalıbSekli {
    /*
     ***    ***                3.4.5 || 10.11.12
     *    * *    *                2.7 || 9.14
     *      *      *               1 || 8 ||15
     *           *                 2 ||14
     *       *                    4||12
     *   *                       6 ||10
     *                              8

     */

    public static void main(String[] args) {
        for (int i = 1; i <=7 ; i++) {
            for (int s = 1; s <=15 ; s++) {
                if (i==3 || s==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
