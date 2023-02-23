package batch129.java.day27encapsulationabstraction;

public abstract class Courses {
    /*
        1) Bazen method body sini yazmak gerekmez,bu durumlarda body siz nethod oluşturmak gerekir.
            Body si olmayan method lara abstract methodlar denir.
        2) "Absatract" method lar child class lar tarafından override edilmek zorundadılar
        bu yüzden eger bir fonksiyonun child class lar tarafından kullanımasını mecbur kılmak isterseniz
        o method abstract yapmak gerekir
        3) Bir methodun body sini o method un abstract olması için yeterli degildir
           access modifier ile return type arasına abstract keyword koymak gerekir
       4)"abstract method" lar siradan class'larin(concrete) icine yazilamazlar, "abstract method" larin icine yazildiklari class'lar da
          abstract olmak zorundadirlar.
       5) Abstract class larda hem abstract methodlar hem de concrete methodlar kullanılabilir.
       6) Concrete class lar abstract class ların child ı olabilirler
       7)abstract methodların override edilme zorunlugugu concrete class lar  içindir

     */
    public abstract void math();

    public void art(){//concrete method
        System.out.println("Painting");
    }
    //Final method lar override edilemezler,halbuki method lar override edilmek için oluşturular
    //Bu çelişkidir bu yuzden java abstract method ların final olmasına musade etmez.

    //public final abstract void science();

    //Concrete class lar final oldugundan child class sa sahip olamazlar
    // Ama "Abstract Class" lar icin Child Class olmalidir,cunku Child Class'lar abstract parent classs'daki abstract method'lari kullanirlar.
    // Bu yuzden Java "Abstract Class"larin "final " olmasina musaade etmez.
    //Abstract method lar private olamazlar cunku child class abstract method ları kullanılır
    // private yapınca kullanıma kapalı olur bu çelişkidir bu yuzde java abstract method ların
    // private olmasına musade etmez
    //Abstract methodlar "static"olamaz lar cunku static method everride edilmez
    // halbuki abstract method override edilmek için oluşturmuştur.


}
