package batch129.java.day29exceptıonsnıght;

public class Exceptıons02 {
    /*
        throw ile throws keyword leri arsında ki fark:
        1)throw method body si içerisnde throws ise method parantezinden hemen sonra kullanılır
        2)throw method body si içerisnde istenilen yerde istenildigi kadar kullanılır
           throws ise method parantezininden hemen sonra sadece bir kere kullanılabilir.
        3)"throw" dan sonra "new" keyword ve constructor kullanilarak object olusturulur.
           "throws" dan sonra sadece "Exception Class" ismi yazilir.
         4)"throw" belli sartlar icin Exception atmada kullanilir, "throws" ise application'i Exception attiktan sonra
           durdurur.
     */
    public static void main(String[] args) throws IllegalArgumentException{
        try {
            printAge(-18);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        try {
            getMark(900);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
    public static void printAge(int age){
    //Throw keyword bir method body sin içinde istedigimiz kadar istedigimiz yerde istedigimiz koşular için exceptıons atmamızı saglar
    //throw keyword yazıldıktan sonra bir Exceptıon Class object i oluşturulur
    //Exceptıons Class constructor parantez içerisine istediginiz Exceptıons mesajını yazabilirsiniz.

        if(age<0){
            throw  new  IllegalArgumentException("Age cannot be negatıve");
        }
         else System.out.println(age);
    }
    //Ogrenci notları girişi yapan ve notu consola yazdıran bir method oluşturun
    public static void getMark(double d){
        if (d<0){
            throw new IllegalArgumentException("Mark cannot be less than zero");
        } else if (d>100) {
            throw new IllegalArgumentException("Mark cannot be greater than hundred");
        }else
        System.out.println(d);
    }
}
