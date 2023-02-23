package scopelevel;

public class Scope02 {
   static int y= 12;
    public static void main(String[] args) {
        int sayı = 1;
        for (int i = 0; i <=5 ; i++) {
            System.out.print(i + sayı + y + " ");
        }//block
       // System.out.println(i);
        System.out.println(sayı);
        System.out.println();
        System.out.println(y);

    }
}
