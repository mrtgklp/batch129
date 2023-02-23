package pratice.praticeDTNT07;

public class C02_Exceptıons {
    public static void main(String[] args) {
              /*
                 rastgeleSayi isminde bir method oluşturunuz.
                 Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
                 Bu iki random sayının toplamını yazdırın.
                 Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
                 ("Sayı 12'den küçük ise hata verir") yazdırın.
             */
        rastgeleSayı();
        System.out.println("Durmak Yok Haram yemeye deme");
    }

    private static void rastgeleSayı() {
        int sayı1 = (int)(Math.random()*10);
        int sayı2 = (int)(Math.random()*10);
        System.out.println("sayı1 ==>" + sayı1 + "/ sayı2==>" + sayı2);

        int toplam;
        try {
            toplam = sayı1 + sayı2;
            System.out.println("Toplam ==>" + toplam);
            if (toplam<12){
                try {
                    throw  new IllegalArgumentException("sayı 12 den kucuk olamlı");
                } catch (Exception e) {
                    System.out.println("Toplam 12 den buyuk olsun " + e.getMessage());
                }
            }
        } finally {
            System.out.println(" Data base ile baglantı kesildi");
        }



    }//method
}
