package smallstudy02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lİst01 {
    public static void main(String[] args) {
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(14);
        list2.add(16);
        list2.add(17);
        list2.add(18);

        System.out.println(list2);
        System.out.println(list2.size());//5 eleman var

        for (Integer w:list2
             ) {
            System.out.print(w + " ");
        }
        System.out.println();
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(i + " ");
        }


    }
}
