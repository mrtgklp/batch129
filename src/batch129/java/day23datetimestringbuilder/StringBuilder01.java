package batch129.java.day23datetimestringbuilder;

import java.util.Arrays;

public class StringBuilder01 {
    /*
            Java'da String class kullanrak veya String Builder class kullanarakta oluşturabilir
            "String Class" Kullanarak ürettiginiz String'ler "ımmutable"(Degiştirilemez) dir.
            "StringBuilder Class" Kullanarak ürettiginiz String'ler "mutable"(Degiştirilebilir) dir.

     */
    public static void main(String[] args) {
        //Immutable
        String s = "Java";
        String t = s + "!";
        String w = t + "?";
        //String'i degiştirdekten sonra aynı String assing ederseniz ,Java yine yeni bir konteryner oluşturur
        //degişmis degeri bu yeni container'in içine koyar ve eski container gösteren oku yeni container'a yönlendirir.
        //Dolayısıyla eski container adressiz kalır,ve "Garbage Collector" adresiz olan container ları siler.
        String a = "Money";
        a = a + "More";

        //Mutable
        //1.Yol:StringBuilder Kullanarak String üretmenin birinci yolu:
        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1);//Python

        sb1.append("!").append("?").append("&").append(".");
        System.out.println(sb1);//Python!?&.

        //2.Yol: StringBuilder kullanarak String üretmek
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length());//0
        //StringBuildr Kullandıgınızda başlangıç kapasitesi 16 dir.
        //Kapasite aşıldıgında varolan kapasite kadar ve iki falzası kadar varolan kapasiteye ekleme yapılır
        // 16==> 16*2+2      -    34 ==> 34*2+2
        System.out.println(sb2.capacity());//16

        sb2.append("java");
        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//16

        sb2.append("xxxxxxxxxxxxxxxxx");
        System.out.println(sb2.length());//21
        System.out.println(sb2.capacity());//34 = 16 * 2 +2

        sb2.append("yyyyyyyyyyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());//45
        System.out.println(sb2.capacity());//70 ==> 34*2+2

        //StringBuilder kullanarak String uretmenin 3. yolu
        StringBuilder sb3 = new StringBuilder(2);

        sb3.append("Flo");
        System.out.println(sb3.length());//3
        System.out.println(sb3.capacity());//6  ==> 2*2+2

        sb3.insert(2, "XXXXXX");
        System.out.println(sb3.length());//9
        System.out.println(sb3);//FlXXXXXXo
        //toString() method'u StringBuilderi String'e cevirir.
        //String Class ta var olan ama StringBUilder Class ta var olmayan split() method gibi
        //Method'lara ihtiyac duydugumuzda toString() Method'unu kullanrak String Class gecer ve method'ları kullanırız.
        sb3.toString().split("l");
        //String i tekrar StringBuilder'a cevirebilirsiniz.
        StringBuilder sb4 = new StringBuilder(sb3);
        //reverse() method'u String'leri terse cevirir
        sb3.reverse();
        System.out.println(sb3);//oXXXXXXlF
        //deleteCharAt() :nindex 1 deki character siler
        sb3.deleteCharAt(1);
        System.out.println(sb3);//oXXXXXlF
        // sb3.delete(1,6): index 1 deki character'den index 5(6 dahil olmadıgı için 5 yazıldı) deki
        // character'e kadar tum characterleri siler.
        sb3.delete(1, 6);
        System.out.println(sb3);//olF

        StringBuilder sb5 = new StringBuilder("Kava");
        StringBuilder sb6 = new StringBuilder("Java");
        //compareTo():method u sb5 ile sb6 yi alphabetic sıralama olarak karşılaştırır
        //sb5 alphabetic siralamada önce ise sonuc negative olur, sonra ise sonuc positive olur.
        System.out.println(sb5.compareTo(sb6));//32
        //setCharAt(2, 'm'); index 2 deki character'i 'm' ye cevirir
        sb6.setCharAt(2, 'm');
        System.out.println(sb6);//Jama
        //replace()method
        sb6.replace(1, 3, "xyz");
        System.out.println(sb6);//Jxyza
        //StringBuilder class ta kullanmamıza izin verilen subString() methodu gibi bazı string class methodları vardır
        //bu method ları StringBuilder ustunde kullanınca  StringBuilder in orijinal degeri degişmez
        String sb7 = sb6.substring(1, 3);//Orijinal degeri degiştiremezler
        System.out.println(sb7);//Jxyza
        System.out.println(sb6);//Jxyza


    }
}
