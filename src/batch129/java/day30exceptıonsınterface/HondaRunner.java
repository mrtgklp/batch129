package batch129.java.day30exceptıonsınterface;

public class HondaRunner {
    public static void main(String[] args) {
        Civic myCıvıc = new Civic();
        myCıvıc.cool();
        myCıvıc.run();

        System.out.println(Ac.price);
        System.out.println(Engine.prıce);

        System.out.println(Ac.model);
        System.out.println(Ac.color);

        

        Accord myAccord = new Accord();
        myAccord.cool();
        System.out.println(Security.price);
    }
}
