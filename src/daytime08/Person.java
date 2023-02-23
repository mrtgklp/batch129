package daytime08;

public abstract class Person {

    long humanPopulation = 8000000000l;

    abstract void learn();
    abstract void eat();
    abstract void drink();

    abstract void think();

    void speak(){
        System.out.println("person speak about everything,because mouth has to be talking");
    }
    void feel(){
        System.out.println("Person feel...");
    }
    void see(){
        System.out.println("Person see ....");
    }
    void job(){
        System.out.println("person a job");
    }

}
