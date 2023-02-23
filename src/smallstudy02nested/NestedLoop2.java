package smallstudy02nested;

public class NestedLoop2 {
    public static void main(String[] args) {
            /*
        soru 1)  Asagidaki sekil cizen kodu yaziniz
        -1 *line +5
                . . . .1
                . . . 2
                . . 3
                . 4
                5
                */
        for (int i = 1; i <=5 ; i++) {
            System.out.print("." + " ");
            for (int j = 0; j <(-1*i +5) ; j++) {
                System.out.print("." + " ");
            }
            System.out.println(i);
        }
    }
}
