package student.pratice.pratice01;

public class Q3_TersYarımDiamond {
    // Lutfen loop ile asagidaki sekli cikariniz:


//          1 2 3 4 5 6
//           2 3 4 5 6
//            3 4 5 6
//             4 5 6
//              5 6
//               6
public static void main(String[] args) {
    for (int i = 1; i <=6 ; i++) {
        for (int j = 1; j < i; j++) {
            System.out.print(" ");
        }
        for (int d = i; d <=6 ; d++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
}
