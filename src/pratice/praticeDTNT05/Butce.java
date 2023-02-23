package pratice.praticeDTNT05;

public class Butce {

        // Tum aile uyelerinin birikiminin bulundugu ortak ihtiyaclar icin
        // kullanildigi bir butce ile kisisel harcamalarin yapildigi
        // harclik'larin oldugu basit bir ev bütçesi kodu yazınız.

    public static int butce;
    public  int harclık;


    public void harclıkAl(int alınanHarclık){
        butce-=alınanHarclık;//Ortak hesaptan harcanıyor
        harclık+=alınanHarclık;
    }
    public void butcedenHarca(int harcanacakPara){
        butce-=harcanacakPara;

    }
    public void harclıkHarca(int harclıkharcaması){
        harclık-=harclıkharcaması;

    }
    public void maasAl(int alınanMaas){
        butce+=alınanMaas;
    }
}
