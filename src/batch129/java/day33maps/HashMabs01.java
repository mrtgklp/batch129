package batch129.java.day33maps;

import java.util.*;

public class HashMabs01 {
    /*
     1)Map'lerde "USA" 400.000.000 şeklinde data depolamamız gerektiginde kullanılır.
     2)"USA = 400.000.000" data'sının "USA" kısmı "key" olarak adlandırılır ve "key"ler "ubique"dir
     3)"USA = 400.000.000" data'sının 400.000.000" kısmı value olarak adlandırılır ve value ler tekrarlı olabilir.
     4)Mapler de depolandıgınız herbir data ya "Entry" denir,"Eleman" denmez.
     5) "Entry" ler "unique"dir . cunku "key" kısımmları "unique" oldugundan herbir "Entry" digerlerindenfarklıdır.

     6)"HashMAp cok hızlıdrı. cunku "HashMap" ler sıralama ile ugraşmazlar
     7)"HashMap"lerinde bir tane "key"i "null" yapabilirisiniz.
     8)"HashMap"lerinde birden fazla tane "value" u "null" yapanilirsiniz.
     9)"HashMap"ler "multı thread" için kullanılamaz ve "Synchronization" yoktur.

     */
    public static void main(String[] args) {
            //HashMap nasıl oluşturulur?
        HashMap<String,Integer> hm = new HashMap<>();
        System.out.println(hm);//{}

        //HashMap'leere nasıl entry eklenir?
        hm.put("USA",400000000);
        hm.put("Germany",83000000);
        hm.put("Albania",3000000);
        //Aynı "key" i kullanarak yeni bir "entry" eklerseniz var olan "value" u update etmis olursunuz.
        hm.put("Albania",400000000);
        hm.put(null,400000000);
        hm.put(null,400000000);
        hm.put("Myanmar",null);
        hm.put("Bhutan",null);
        System.out.println(hm);//{null=400000000, Myanmar=null, USA=400000000, Bhutan=null, Germany=83000000, Albania=400000000}

        //HAshMap lerde sadece "key" leri almak istiyorum
        Set<String> hmKeys = hm.keySet();
        System.out.println(hmKeys);//   [null, Myanmar, USA, Bhutan, Germany, Albania]

        //HashMap lerde  sadece "Value" ları olmak istiyorum
        //Example" 1: hm Map'lerdeki ulkelerin toplam nufusunu bulunuz.
        Collection<Integer> hmValues = hm.values();
        int sum = 0;

        for (Integer w:hmValues
             ) {
            if (w!=null) {
                sum = sum + w;
            }
        }
        System.out.println(sum);//1283000000

        //HashMap lerdde belirli bir "key" nın "value" sunu nasıl alabiliriz?
        Integer usaPopulatıon = hm.get("USA");
        System.out.println(usaPopulatıon);//400000000
        //HashMaplerde  replace() methodu varolan bir "key" nın value sunu degiştirmek için kullanılır
        hm.replace("Bhutan",35000000);
        System.out.println(hm);//{null=400000000, Myanmar=null, USA=400000000, Bhutan=35000000, Germany=83000000, Albania=400000000}

        hm.putIfAbsent("USA",700000000);
        System.out.println(hm);//{null=400000000, Myanmar=null, USA=400000000, Bhutan=35000000, Germany=83000000, Albania=400000000}

        hm.putIfAbsent("India",700000000);
        System.out.println(hm);//{null=400000000, Myanmar=null, USA=400000000, Bhutan=35000000, Germany=83000000, Albania=400000000, India=700000000}

        //Example 2: Yeni ögretmenin maas stadart ucreten(10000) 1000 tl fazla eski ogretmeni maası stardart ucretten 2000 tl fazla olur
        HashMap<String,Integer> salaries = new HashMap<>();
        salaries.put("Ali",8000);
        salaries.put("Ayse",5000);
        salaries.put("Veli",9000);
        salaries.put("Tom",9900);
        String teacherName = "Tom";
       if (salaries.keySet().contains(teacherName)) {
           salaries.putIfAbsent(teacherName, 11000);
       }else {
           salaries.put(teacherName, 12000);//{Tom=12000, Veli=9000, Ayse=5000, Ali=8000}
       }
           System.out.println(salaries);//{Tom=9900, Veli=9000, Ayse=5000, Kemal=11000, Ali=8000}
        //hm.replace("USA",400000000,500000000) methodu key USA ve value 400000000 is value u 500000000 yapar;
        hm.replace("USA",400000000,500000000);
        System.out.println(hm);//{null=400000000, Myanmar=null, USA=500000000, Bhutan=35000000, Germany=83000000, Albania=400000000, India=700000000}
        //getOfDefault() olan keylerin degerini verir,olmayan key ler için de sizin ikinci parametre yazdıgınız degeri verir.
        Integer r = hm.getOrDefault("Btuhan",0);
        System.out.println(r);

        //entryset() methodu "map"i "Set"e cevirir.
        //Setleri methodlarını kullanabılmek için entrySet() methodunu kullanarak Map i Set cevirebiliriz
        //Map'i Set'e cevirdigimizde Setin butun ozelliklerini kullanabilirizçMesela loop gibi.
        //Entry(): methodunu kullandıgınızda elde ettiginiz Set'im elemanları "Map.Entry<String,Integer>" seklinde bir Map olur.
        //Bu yuzden elemanlar icin Map method'lari kullanilabilir.
        Set<Map.Entry<String,Integer>> myEntry = hm.entrySet();
        System.out.println(myEntry);//[null=400000000, Myanmar=null, USA=500000000, Bhutan=35000000, Germany=83000000, Albania=400000000, India=700000000]

        //Example 3: Ülke ismindeki character sayısını ulke nufusuna ekleyen ve sonucu console yazdıran kodu yazınız.

       for (Map.Entry<String,Integer> w : myEntry){
            if (w.getValue()!=null &&  w.getKey()!=(null)) {
                int toplam = w.getValue() + w.getKey().length();
                System.out.println(toplam);
            }
            }
    }
}
