package smallstudy02nested;

public class NestedLoops01 {
    public static void main(String[] args) {
        //aşagıdaki şekli nestedsiz looğ ile yazdıran bir program yazınız
        /*
                * * * * *
                * * * * *
                * * * * *
                * * * * *
                * * * * *
         */
        for (int i = 1; i <=5 ; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        for (int i = 1; i <=5 ; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        for (int i = 1; i <=5 ; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        for (int i = 1; i <=5 ; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        for (int i = 1; i <=5 ; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        System.out.println("===============");


        for (int i = 1; i <=5 ; i++) {//auter == dıs
            System.out.print("*" + " ");
            for (int j = 1; j <=4 ; j++) {// inner loop === ic loop
                System.out.print("*"+ " ");
            }
            System.out.println();
        }

    }
}
