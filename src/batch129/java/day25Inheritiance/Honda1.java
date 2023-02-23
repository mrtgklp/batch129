package batch129.java.day25Inheritiance;


public class Honda1 extends Car1 {
    public int price = 10000;
    public void engine(){

        System.out.println("Honda engine..");
    }
    public Honda1(){
       // this("R8",2023);
        System.out.println("Honda 1");


    }
    public Honda1(String model,int year){
       //super("Audi");

        //super();//super() yazmasanız da aynı isi görür.parametre yazarsak super() yazmalıyız
        System.out.println("Audi 2 = " + model +"-" + year);

    }
}
