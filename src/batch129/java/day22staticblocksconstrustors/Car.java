package batch129.java.day22staticblocksconstrustors;
/*
   Constructor nedir?
   Class tan object üretmemize yarayan code block laridır.

   Class oluşturdugumuzda java bize otomatik olarak bir constructor verir.
   Ama bu constructor göz ile görülmez gözle görülmeyen otomatik olarak java tarafında verilen
   bu constructor lara default constructor denir.

   default constructor lar "Car(){}"şeklinde olur
    Siz kendi constructor oluşturdugunuzda java default constructor siler

   Bir classda farklı parametreler kullanrak  istediginiz kadar constructor kullanabilirsiniz

   Farklı constructor'lar sayesinde bir class tan farklı farklı object oluşturabiliriz

   Interview sorusu: Method ile constructor fark varmıdır varsa nedir?
   Cevap: Method ile constructor farklı yapıladır
   1.Methodlarda return type vardır ama constructorlarda return type yoktur
   2.Methodların ismi yaptıkları işe developer tarafından belirlenir constructor ların isim ise
    her zaman class ismi ile aynı olmalıdır.


 */
public class Car {

    String make = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;

   public Car(String make,String model,int year,boolean hybrid){
        this.make=make;
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;
    }
   public Car(String make,String model){
        this.make=make;
        this.model=model;
        if (year==2023){
            this.year=0;
        }
        if (hybrid==true){
            this.hybrid=false;
        }
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {//CarrRunner ekranda görmemiz için toString yapmalıyız
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
