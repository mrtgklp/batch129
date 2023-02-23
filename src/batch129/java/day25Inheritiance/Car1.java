package batch129.java.day25Inheritiance;


public class Car1 extends Vehicle01 {
    public int price = 11000;
    public void engine(){
        System.out.println("Car engine..");
    }
    public Car1(){
        super(3000);
        System.out.println("Car 1..");
    }
    public Car1(String make){
        this();
        System.out.println("Car 2: " + make);
    }
}
