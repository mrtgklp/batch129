package batch129.java.day24accessmodifiersinheritiance;

public class Honda extends Car{

    public String Color;
    public Honda(){
        super("white",50000);
    }
    public Honda(String color){
        this.color=color;

    }
}
