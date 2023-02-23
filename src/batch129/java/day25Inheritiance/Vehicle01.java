package batch129.java.day25Inheritiance;

public class Vehicle01 {
    /*
        1.)Child class tan bir object oluşturdugunuz constructor lar en usteteki
           parents class baslatılarak altta dogru calıstırılır
        2)child class daki constructor dan parent class daki constructor a gidebilmek için "super"() kullanılır
        3) Parent class da birden fazla constructor varsa istenilen constructor , super () ifasdesinin parentezi içine yazılan
            parantezi yardımı ile secilebilir
         4)Aynı class içinde ki constructor secmek için "this()" kullanılır.
            Ayni Class'da birden fazla constructor varsa istenilen constructor, "this()" ifadesinin parentezi icine yazilan
            parametreler yardimi ile secilebilir.
        5)"supe()" ifadesini yazmak istege baglıdır, yazmasanız da java sanki "super()" varmıs gibi davranır
           Ama kodunuzu daha okunur kılmak için yazmanız tavsiye edilir
        6)"super()" ve "this()" ifadeleri constructor içinede her zaman ilk satırda olmalıdır.
        7)Bir constructor içinde "super()" ve "this()" ifadeleri sadece bir kere kullanılır.Bakınız 6 ci kural..
        8) Inheritance ta variable lıları  ve method ları cagrımak için "this veya super " kullanılır
            "this" aynı variable ları içindeki variable lıları  ve method ları cagrımak için kullanılrı
            "super" parent class içindeki variable lıları  ve method ları cagrımak için kullanılrı
        9)Inheritance object kullanarak variable cagrısanız object in Data type temsil eden
        class dan variable i aramaya başlayınız O class da yoksa parent'lara bakınız.
        10)Inheritance object kullanarak method cagrısanız object in constructor ini temsil eden
           class dan method u i aramaya başlayayınız O class da yoksa parent'lara bakınız.

            OOP Principols:
            1)Inheritance+
            2)Polymorphism: Method Overloading + Method Overriding
            3)Encapsulation
            4)Abstraction
     */
    public int price = 12000;
    public void engine(){
        System.out.println("Vehicle engine..");
    }
    public Vehicle01(){

        System.out.println("Vehicle 1");

    }
    public  Vehicle01(int price){
        System.out.println("Vehicle2  " + price);
    }
}
