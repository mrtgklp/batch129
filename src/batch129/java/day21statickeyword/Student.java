package batch129.java.day21statickeyword;

public class Student {
    /*
        1) Static variable veya static method'lar(class member) tüm objeler için ortak elamandır
        2) Static class member üzerinde yapılan tüm degişlikler tüm objeleri etkiler
        3) Static class member'lar Class'a , non-static member lar objelere monte edilir
           Mesale bir class tan 100 tane object oluştugumuzda non-static olanlar 100 kere oluşturulur
           ama static olan object sayıdan bagımsız olarak bir kere oluşturulur
        4) Static class memberlara ulaşmak için object oluşturmaya gerek duyulmaz.
           non static class member ulaşmak için object oluşturmak şartır
        5) Static variabelerin diger adı class variable dir
           non-static Variable ların diger adı "Instance variable" veya "Object Variable"dir

     */
     public static String studentName = "Tom Hanks";
     public int age = 13;

     //Ogrenci ismini ilk harfini veren methodu oluşturunuz.
     public  static String getInitials(String name){

         String first = name.substring(0,1);
         String second = name.split(" ")[1].substring(0,1);
         return  first + second;
     }
     //Ögrenci isminde ki sesli harfleri(a,e,ı,o,i,ö)sayan bir method oluşturunuz.
    public int countVawels(String name){
         int counter = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch  = name.toLowerCase().charAt(i);
            switch (ch){
                case 'a':
                case 'e':
                case 'ı':
                case 'o':
                case 'u':
                    counter++;
                    break;
            }
        }
        return counter;
    }


}
