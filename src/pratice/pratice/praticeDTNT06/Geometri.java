package pratice.pratice.praticeDTNT06;

public abstract class Geometri {

    //Kare prizma,
   // silindir ve koninin hacmini hesaplayan
   // bir kod yazınız.(Inheritance kullanınız)

    public int sayı=10;
    public double hacimHesapla(int a, int b){
        return a*a*b;
    }

    public abstract double hacimHesabla(int r, int h);
}
