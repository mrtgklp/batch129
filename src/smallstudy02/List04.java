package smallstudy02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List04 {
    public static void main(String[] args) {
        // verilen bir array'i listeye cevirin

        String arr[]={"A" , "B" , "C"};

        List<String> arraydenList= Arrays.asList(arr);
        System.out.println(arraydenList);

    }
}
