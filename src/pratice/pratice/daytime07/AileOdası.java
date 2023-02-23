package pratice.pratice.daytime07;

public class AileOdası extends  Otel{
    public static void main(String[] args) {
        AileOdası musteri2 = new AileOdası();
        musteri2.kahvaltı();
        System.out.println("musteri wifi ucreti : " + musteri2.wifi(4) + "$");
    }
    @Override
    public void kahvaltı() {
        System.out.println("Kahvaltı serpme kahvaltı");
    }
}
