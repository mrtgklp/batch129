package batch129.java.day28exceptions;

public class Exceptıons05 {
    public static void main(String[] args) {
        int a = 16;
        int b = 2;
        String s = "My Java";
        getCharFromString(s,a,b);

    }
    //Try kısmında birden fazla exceptıon olusturma ihtimal varsa coklu catch kullanabilirsiniz
    //Coklu catch kullandıgınızda exceptıon class arasında parent child ilişkisi yoksa catchleri sırası önemli degildir
    //Ama code da ki sıralamaya uymak tavsiye edilir
    //Coklu catch kullandıgınızda  Exceptıon Class lar arasında "parent" child" ilişkisi varsa catch lerin sırası
    //onemlidir chıld olan class ustte olmalıdır.

    //Exceptıon Class'lar arasında "parent-child" ilişkisi varsa, ya chıld class'ı uste yazarak chıld ve parent class'lar
    //icin ozellestirilmis code'lar yazarsiniz.(Hirsiz icin 155, hasta icin 112 gibi)
    //Veya child'i hic kullanmaz sadece parent ile exception'lari handle etmeye calisirsiniz.(Hirsiz icin 911, hasta icin 911 gibi)
    public static  void getCharFromString(String s, int a, int b){

        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zero");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan ındex kullandınız.");
        }



    }
}
