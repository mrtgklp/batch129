package batch129.java.day21statickeyword;

import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {
        // student name static oldugudan  ona ulaşmak için object oluşturmadım
        //Sadece class ismini kullanmak yeterli
        System.out.println(Student.studentName);

        /*
            age non static oldugundan ona ulaşmak için object oluşturmak zorundadır
         */
        Student yas = new Student();
        System.out.println(yas.age);

        String initials = Student.getInitials("Tom Crulse");
        System.out.println(initials);

        int vowels = yas.countVawels("Murat gokalp");
        System.out.println(vowels);
        //static olanları object ile cagırmak tavsiye edilmez.
        String s = Student.getInitials("Ali Can");
        System.out.println(s);
        //List oluşturmadan yeni bir Işıltı
        List<String> names = List.of("ali","ahmet","bilal","keziban");
        System.out.println(names);


    }
}
