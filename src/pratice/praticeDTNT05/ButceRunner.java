package pratice.praticeDTNT05;

public class ButceRunner {
    public static void main(String[] args) {
        Butce baba = new Butce();
        System.out.println("Maas oncesi butce " + Butce.butce);
        baba.maasAl(3000);
        System.out.println("Maas oncesi butce " + Butce.butce);
        baba.harclıkAl(100);
        baba.harclıkHarca(20);
        baba.butcedenHarca(500);
        System.out.println(baba.harclık);
        System.out.println(Butce.butce);


        Butce anne = new Butce();
        anne.maasAl(5000);
        anne.harclıkAl(500);
        anne.harclıkHarca(450);
        System.out.println(Butce.butce);
        System.out.println(anne.harclık);

        Butce cocuk = new Butce();
        cocuk.harclıkAl(50);
        cocuk.harclıkHarca(45);
        System.out.println(cocuk.harclık);
        System.out.println(Butce.butce);
    }
}
