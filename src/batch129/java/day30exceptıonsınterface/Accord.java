package batch129.java.day30exceptıonsınterface;

public class Accord implements Ac,Engine,Security{
    @Override
    public void cool() {
        System.out.println("cıvıc cools perfectly");
    }

    @Override
    public void run() {
        System.out.println("Engıner run super");
    }
}
