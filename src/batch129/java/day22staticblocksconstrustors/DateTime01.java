package batch129.java.day22staticblocksconstrustors;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime01 {
    //Date Class
    public static void main(String[] args) {
        Date myDate = new Date();
        System.out.println(myDate);//Sat Jan 07 23:26:40 EET 2023
        System.out.println(myDate.getTime());//1673123311873== 1 Ocak 1970 şu ana kadar ki mili saniye miktarı

        //İçinde bulundugumuz an nasıl alınır?
        System.out.println(LocalDate.now());//2023-01-07
        System.out.println(LocalTime.now());//23:34:35.865831300
        System.out.println(LocalDateTime.now());//2023-01-07T23:35:58.034346900
        //Dünyanın herhangi bir dilimde ki saati nasıl aliriz?
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Paris")));
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Kiev")));


        //İleriki bir tarıhi nasıl gidilir?
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));
        //Geri bir tarıhi nasıl gidilir?
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));

        //İleriki bir zamana nasıl gidilir?
        System.out.println(LocalTime.now().plusHours(3));
        //Geriki bir tarıhi nasıl gidilir?
        System.out.println(LocalTime.now().minusMinutes(45));
        //Zamanda Belli bir bölümü nasıl alırız
        System.out.println(LocalTime.now().getHour() +":"+ LocalTime.now().getMinute());
        //Tarihte Belli bir bölümü nasıl alırız
        System.out.println(LocalDate.now().getMonth() + "/" + LocalDate.now().getDayOfMonth());
        //İki tarih nasıl karşılaştırır
        //02/13/2005-03/01/2007
        boolean result = LocalDate.of(2005,02,13).isBefore(LocalDate.of(2007,03,01));
        System.out.println(result);//true
        boolean result1 = LocalDate.of(2005,02,13).isAfter(LocalDate.of(2007,03,01));
        System.out.println(result1);//false
        //Tarihlarin formatları nasıl degiştirilir
        //Büyük M tek  rakamla ay nosunu yazar MM iki rakamla ay nosunu yazar
        //MMM ==> Ay isminin ilk üç harfini yazar -- MMMM===> Ay İsmini tamamını yazar
        //d==> Tek Rakamla gün nosunu yazar  -- dd ==> iki rakamla gün nosunu yazar
        //yy==> Yılın son rakamını yazar __ yyyy==> Yılın tamamını yazar
        DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dtf.format(LocalDate.now()));
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Paris")));

    }
}
