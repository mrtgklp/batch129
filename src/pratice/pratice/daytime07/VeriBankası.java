package pratice.pratice.daytime07;

public class VeriBankası {
    public static void main(String[] args) {
        String[] doctorIsimleri = {"Ebubekir", "Tarik", "Sibel ", "Yunis"};
        String[] doctorSoyIsimleri = {"Can ", "Ermis", "Bilen ", "Yildirim"};
        String[] unvanlar = {"Allerjist ", "Norolog ", "Genel Cerrah ", "Kalp Doktoru "};
        String[] hastaIsimleri = {"Seda ", "Beyza ", "Gonul ", "Tom "};
        String[] hastaSoyIsimleri = {"Celikors ", "Gulumser ", "Gulum ", "Cruse "};
        String[] durumlar = {"Alarji", "Bas agrisi ", "Diabet ", "Kalp Spazmi "};
        int[] hastaIDleri = {111, 222, 333, 444};
    }


    private Doktor doktor;
    private Hasta hasta;

    public Doktor getDoktor() {
        return doktor;
    }

    public void setDoktor(Doktor doktor) {
        this.doktor = doktor;
    }

    public Hasta getHasta() {
        return hasta;
    }

    public void setHasta(Hasta hasta) {
        this.hasta = hasta;
    }
}


