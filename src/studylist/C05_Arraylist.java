package studylist;

import java.util.ArrayList;
import java.util.List;

public class C05_Arraylist {

    public static void main(String[] args) {
        List<Integer> dogalSayılar = new ArrayList<>();
        dogalSayılar.add(77);
        dogalSayılar.add(66);
        dogalSayılar.add(44);
        dogalSayılar.add(33);

        int sum = 0;
        for (Integer w :dogalSayılar
             ) {
            sum+=w;
        }
        System.out.println("sum = " + sum);
    }    
}
