package batch129.java.day23datetimestringbuilder;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {
        //Example 1: Time'i formatlayınız
        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);
        //hh==>12 lik saat sistemini kullanır  - HH==>24 saat sistemi kullanır
        //hh kullandıgınızda AM veya Pm demek zorundasınız,bunu demek için "a" yazmanız yeterlidir. Yani "hh:mm a"
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println(dtf.format(myTime));//11-03-35 öö


    }
}
