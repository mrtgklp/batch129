package studylist;

import java.util.ArrayList;
import java.util.List;

public class Lİst01 {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList<>();
        mylist.add("Mehmet ali");
        mylist.add("Ahmet ali");
        mylist.add(" ali yılmaz");
        mylist.add("Zeynep ali");

        List<String> kontrol = new ArrayList<>();
        kontrol.add("Mehmet ali");
        System.out.println(kontrol);


        for (int i = 0; i < mylist.size(); i++) {
            for (int j = 0; j < kontrol.size(); j++) {

            }
        }
    }

}
