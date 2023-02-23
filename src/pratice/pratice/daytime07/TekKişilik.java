package pratice.pratice.daytime07;

public class TekKişilik extends Otel{
    public static void main(String[] args) {
        TekKişilik musteri1 = new TekKişilik();
        System.out.println("musteri Tv ıucreti : "+ musteri1.tv(5));
    }//main

    @Override
    public void kahvaltı() {
        System.out.println("Sadece sadwich");
    }

    public  int tv(int saat){
        return saat*2;//saati 2 dolar

    }


}
