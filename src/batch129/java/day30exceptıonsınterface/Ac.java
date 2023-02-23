package batch129.java.day30exceptıonsınterface;

public interface Ac {
       //İnterface'lerin icine "concrete" method konulamaz, cunku "concrete method"larda
      // body vardir ve body o method'un isi nasil yapacagini belirtir. İsin nasil yapilacagi bircok detay icerir
     //Ve bu Child class'larda kafa karsiklina sebeb olur . Halbuki sadece yapilmasi gereken isi soyleyip nasil
     //yapilacagini child'e birakip child class'in kafa karisikligini engellemis olursunuz
    //Interfacelerdeki tum methodlar otomatik olarak public tir,abstractır, statıc degildir.
    // İnterfaceler conceret method içeremezler dolasıyla ınterfacein içindeki hiç bir sey istege baglı degildir
    //hersey Chıld class lar için mecburidir:Bu yuzden ınterfacelere "to do lıst" de denir.
    //Interfacelerdeki variabler otomatik olarak public dir. static dir ,finally dır
    void  cool();

    void run();

    public static final int price = 2000;
    String model ="Citring";
    String color = "Red";



}
