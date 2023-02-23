package batch129.java.day33maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMaps03 {
    public static void main(String[] args) {
        //Example 1 : Size  verilen bir cumlede kullanılan harflerin gorunum sayısını gosteren kodu yazınız.
        //            "Java is Java" ==>J=2,a=4,v=2,i=1,s=1
        HashMap<String,Integer> lettersMap = new HashMap<>();
        String sentence = "Java is Java";

        sentence.replaceAll("[^a-zA-Z]","");
        System.out.println(sentence);

        String[] letterArray =sentence.split("");
        System.out.println(Arrays.toString(letterArray));

        for (String w: letterArray
             ) {
          Integer numOfOccurrence =  lettersMap.get(w);
          if (numOfOccurrence==null){
              lettersMap.put(w,1);
          }else {
              lettersMap.replace(w,numOfOccurrence+1);
          }
        }
        System.out.println(lettersMap);


    }
}
