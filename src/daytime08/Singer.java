package daytime08;

public  class Singer extends Person{
    public static void main(String[] args) {
        Singer sing = new Singer();
        System.out.println(sing.humanPopulation);
        sing.job();
        sing.speak();
        sing.feel();
        sing.see();

    }


    @Override
    void learn() {

    }

    @Override
    void eat() {

    }

    @Override
    void drink() {

    }

    @Override
    void think() {

    }
}
