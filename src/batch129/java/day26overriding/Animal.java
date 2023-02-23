package batch129.java.day26overriding;
/*
        1) parent taki clas daki method u child class içinde özelleştirerek kullanmaya "Overriding yapmak denir
       2)Overriding 'de method'un parantezine, method'un ismine dokunulmaz, method'un body'si degistirilir.
       3)Override ==> Override annotation :Override kurallarinin Java tarafindan kontrol edilmesini saglar.
        4)Overriding 'de parent Class'daki method'a "Overrede  Method", child class'daki method'a ise "Overriding Method" denir.
        5)Private methodlar override edilemezler
        6)Child classtaki overide edilmiş method override method'un
        accsess modifier parents class daki edilmiş overriden method un access modifierindan dar olamaz

        Note: Overidden Method==>procted ise Overriding Method aynısı olabilir bir de geniş olabilir procteced + public
                Overidden Method==>default ise Overriding Method ==> default  + proctected + public
                Overidden Method==>private ise Overriding Method ==>Overridin olmaz ki access modifier olsun(Bkz.5 kural)
        7)Child classta override edilen methodun return type methodun return ettigi
            data type nin aynısı veya o data type parent olarak secilebilir
       8) Method dun return type "primitive" ise overriding yaparken return type degiştiremez
       cunku return type ya aynı olur veya parenttan secilir
       ama "primitivler" arasından parent chikd ilişkisi olmadıgından parent tan secmek mevzu bahis olamaz o zaman
       tek secenek aynısı olnalı
       9)Method'dun return type "Wrapper class" ise overriding yaparken return type degiştiremez
       cunku return type ya aynı olur veya parenttan secilir
       ama "Wrapper Class" arasından parent child ilişkisi olmadıgından parent tan secmek mevzu bahis olamaz o zaman
       tek secenek aynısı olnalı
       10)Method return type i void ise Overriding yaparken return type degiştirilemez.
       11)Final methodlar ve static methodlar override edilemezler
       12) Overrride yapabilmek için Inhertece şartır Baska bir ifadeler parent child ilişkisi şarttır.
       13)Final kelimesini "Class"larda kullanabilirsiniz.
                       ->class final ise;
                       i)o class'ın child'ı olamaz
        14) "final" method'lar ve "static" method'lar "override"  edilemezler.
        15)"Override" yapabilmek icin "Inheritance" sarttir. Baska bir ifadeyle; Parent-Child iliskisi sarttir.
        16) Method Overloading "Compile Time Polymorphism" dir, Method Overriding "Run Time Polymorphism" dir.
        17) Method Overloading "static Polymorphism" dir, Method Overriding "dynamic Polymorphism" dir.
 */
public class Animal {// Parent'daki override edilmis eat() method'una "Overridden Method" denir
    public void eat(){//Parent teki override edilmiş eat() method overriden() method denir.
        System.out.println("Animal eat..");
    }
    public void drink(){//Overriden
        System.out.println("Animal drink..");
    }
    public Animal create(){
        return new Animal();
    }
    public int toplama(int a,int b){
        return a+b;
    }
    public Integer multiply(int a,int b){
        return a*b;
    }
}
