package pratice.praticeDTNT05;

public class HacimRunner {
    //Küp, kare prizma ve dikdörtgen prizmanın
    // hacmini hesaplayan bir method oluşturunuz.(Method overloading kullanınız

    public static void main(String[] args) {
        OverLoadingHacim hacim = new OverLoadingHacim();//Burada obje olusturduk
        int karePrizma =hacim.hacimHesapla(5,6);
        int dikdörtgenPrizma =hacim.hacimHesapla(5,6, 7);
        int küp =hacim.hacimHesapla(5);
        System.out.println("KarePrizme : " + karePrizma);
        System.out.println("DikdörtgenPrizma : " + karePrizma);
        System.out.println("Karekök : " + karePrizma);
    }
}
