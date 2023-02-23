package studylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03_arraylist {
    //alfabeti sıralama
    public static void main(String[] args) {
        List<String> mylist = new ArrayList<>();
        mylist.add("mehmet ali");
        mylist.add("ömer faruk");
        mylist.add("hakan efe");
        mylist.add("ahmet faruk");

        Collections.sort(mylist);

        System.out.println(mylist);

    }
}
