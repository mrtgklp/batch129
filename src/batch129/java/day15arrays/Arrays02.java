package batch129.java.day15arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Example 2 : Bir Stringdeki sesli harflerin sayısını bulan kodu yazınız
        //              a-e-i-o-u-A-E-I-O-Ü
        String s = "Java brings you money";

        //1.Yol: Use replaceALL()
        int vowels = s.replaceAll("[^aeıouAEIOU]","").length();
        System.out.println(vowels);

        //2.yol: Array- Loop
        String letters[] = s.split("");
        System.out.println(Arrays.toString(letters));//[J, a, v, a,  , b, r, i, n, g, s,  , y, o, u,  , m, o, n, e, y]

        int counter = 0;

        for(String w : letters){
            switch (w.toLowerCase()){
                case "a":
                case "e":
                case "ı":
                case "o":
                case "u":
                    counter++;
            }
        }
        System.out.println(counter);

    }
}
