package pratice.pratice.daytime07;

public class KralDairesi extends Otel{
    public static void main(String[] args) {
        KralDairesi musteri3 = new KralDairesi();
        musteri3.kahvaltı();
        System.out.println("musteri 3 tv ucreti : " + musteri3.tv("international", 7) + "$");
        System.out.println("musteri 3 wifi ucreti : " + musteri3.wifi(8) + "$");


    }

    @Override
    public void kahvaltı() {
        System.out.println("Kahvaltı yataga gelir...");
    }
    public int tv(String international,int saat){
        if (international.equals("international")){
            return saat*100;
        }else {
            return 0;
        }
    }
}
