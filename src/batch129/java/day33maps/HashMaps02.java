package batch129.java.day33maps;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class HashMaps02 {
    public static void main(String[] args) {
        //Example 1: Size verilen bir cumledeki herbir kelimenin kacar kerer kullanıldıgını gosteren kodu yaznınız.
        //          "Java is easy.Java is OOP.OOP makes Java easy" ==>java=3,is=2,easy=2,OOP=2,makes=1
        HashMap<String,Integer> wordsMap = new HashMap<>();
        String sentence = "Java is easy.Java is OOP.OOP makes Java easy";
        System.out.println(sentence);//Java is easy.Java is OOP.OOP makes Java easy

        sentence = sentence.replaceAll("\\p{Punct}","");
        System.out.println(sentence);//Java is easyJava is OOPOOP makes Java easy
        String[] wordArray = sentence.split(" ");//bize array veriri
        System.out.println(Arrays.toString(wordArray));//[Java, is, easyJava, is, OOPOOP, makes, Java, easy]

        for (String w:wordArray
             ){
            Integer numOfOccurrence = wordsMap.get(w);
            if(numOfOccurrence==null){
                wordsMap.put(w,1);
            }else {
                wordsMap.replace(w,numOfOccurrence+1);
            }
        }
        System.out.println(wordsMap);//{Java=2, easyJava=1, makes=1, is=2, OOPOOP=1, easy=1}


    }
}
