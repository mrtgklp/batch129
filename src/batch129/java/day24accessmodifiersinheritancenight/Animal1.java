package batch129.java.day24accessmodifiersinheritancenight;

public class Animal1 {
    /*
        Inheritance'in faydalari;
        1) Code standardında tekrar iyi değildir.
        2) Code değişime açık olmalıdır.Hatayı düzeltmek kolay olmalı.
        3) Gelişime update'e açık olmalıdır
        4) Code atomic yapıda olmalı.
        Note 1:  "parent class"(super class)(ortak ozellikleri icerir)-"child class"(sub class)(Class'a ozel ozellikleri icerir)
        Note 2: Bir parent class'a bağlı child class'ı belirtmek için "extends" keyword kullanırız
        Note 3: public method "child class lar tarafından kullanılabilir".
                "child class lar tarafından kullanılabilir". demek "Inherit edilebilir" demektir
        Note4 : "protected" method lar "inherit" edilebilir.
                cunku "protected " olan method ve variable child tarafından kullanılır.
        Note 5: "default" method lar obje ile aynı package oldugu oldugu surece "Inherit" edilebilir
                Ama default method ile object uretigi class farklı package "Inherit" edilemezler.
        Note 6: "private" method "ınherit" edilemezler.
        Note 7: Java 1 den fazla parentın(Multiple Inheritance parents) onaylamaz
        Note 8: Child__>parent--->grandparent--grand grand parent--- sekşlde ilerleyen Inheritance lara "multi level" denir
        Note 9: Java da object class tum java classlarını ortak parent dir
        Note 10: java da object class haric tüm class ların parent vardır
        Note 11: Javada parentdan Child da olan ilişkilere "has A" Relationship denir
                 Javada Childtan parentda olan ilişkilere "IS A" Relationship denir
        nOTE 12: java da her class sın 1 tane deafualt constructor vardır
                 Bu deafult constructor class içinde görünmez cunku default object class içindedir
                 Bizim class sımız default constructor ihtiyac duydugunda parent olan object class gider ver orada ki constructor kullanırlır

     */
    protected void eat(){
        System.out.println("Animals eat...");
    }
    public void drink(){
        System.out.println("Animals drink...");
    }
}
