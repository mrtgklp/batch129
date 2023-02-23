package batch129.java.day26overriding;

public class Cat extends  Mammal{
    public void meow(){
        System.out.println("Cats meow...");
    }

    @Override//Override Annatation'ı: Override kurallarını java tarafından kontrol edilmesini saglar.
     public void eat() {//Child taki override edilmiş eat() meyhod override () method denir.
        System.out.println("Cat eat...");
    }

    @Override
    public void drink() {
        System.out.println("Cat drink..");
    }

    @Override
    public Cat create() {
        return  new Cat();
    }

    @Override
    public int toplama(int a, int b) {
        return a + b;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b;
    }
}
