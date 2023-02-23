package batch129.java.day28exceptions;

public class Exceptions01 {
    /*
      1) Exception demek beklemedik problem demek . Seyhatte benzini bitmesi ,arabanın bozulması
      2)Gercek hayatta karşılaştıgımız beklmedik problemler için cözüm yollarımız vardı Mesela benzin bitince yol yardımı ararınız
        Applicatıonlar da beklemedik problemleri için cozum yolları uretmeliyiz bu isleme "Exceptıon Handing"denir
     3)Exceptıon lar temel olarak ikiye ayrılıyor
        i)Compile Time Exceptıon : Siz code yazarken farkedilir ve yazdıgınız kodun altı kırmızı cızgı ile cizilir.
        ii)Run Time Exceptıon: Siz code yazarken farkedilmez ama code calıstıgınızda consolda hata alırsınız.
     4)Exceptıon dısında eror diye atladıgımız handle edilemeyen problemler vardır.
        Gercek hayyatta soforun olmesı gibi handle edilemeyecek durumlar Error dur
        Applicatıon larda "Memory"nin dolması "Error"dur
        İki tur Memory var.i)Steak Memory dolarsa "StackOverFlow Error" alırsınız.
                            ii)Heap Memory dolarsa"OutOfMemory Error"alırsınız.
     5)Yazdiginiz kod calismadiginda problemi bulmak icin "Log" lara bakariz.
     6) Why we use try-catch instead of useing if-else ?
        if else kullanirsak olusacakbilecek her problemi spesifik olarak if parantezinin içine yazmamız gerekir.
        Bu da ciddi bir matematik bilgisi gerektirir ve yazacagimiz code u cok uzatir.
        Ama try catch'te Java ilgili Exception ile alakali olusabilecek butun problemleri yakalar.

     */
    public static void main(String[] args) {
        int a = 12;
        int b = 3;

        divide(a,b);
        divide2(a,b);
    }
    //Aritmetic execeptıon yazdıgınız code da matematik islem kullanıyorsanız alınabilecek bir exceptıon dır.
    //Nasıl handle edilecegini asagıda yazdık try-catch
    //"Exceotıon Handle" de If else kullanılmaz bakınız 6.Note
    private static void divide2(int a,int b) {
        if (b==0){
            System.out.println("Do not divide by zero");
        }else
            System.out.println(a/b);
    }

    public static void divide(int a, int b){

        try {
            System.out.println("a/b = " + a/b);
            System.out.println("I am here");
        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zero");
        }
        System.out.println("You are here");
    }


}
