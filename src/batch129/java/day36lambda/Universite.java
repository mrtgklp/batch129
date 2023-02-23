package batch129.java.day36lambda;

public class Universite {
    private String universty;
    private String bolum;
    private int ogrencıSayısı;
    private int notOrtalaması;

    public Universite() {//parametresiz  const
    }

    public Universite(String universty, String bolum, int ogrencıSayısı, int notOrtalaması) {
        this.universty = universty;
        this.bolum = bolum;
        this.ogrencıSayısı = ogrencıSayısı;
        this.notOrtalaması = notOrtalaması;
    }

    public String getUniversty() {
        return universty;
    }

    public void setUniversty(String universty) {
        this.universty = universty;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getOgrencıSayısı() {
        return ogrencıSayısı;
    }

    public void setOgrencıSayısı(int ogrencıSayısı) {
        this.ogrencıSayısı = ogrencıSayısı;
    }

    public int getNotOrtalaması() {
        return notOrtalaması;
    }

    public void setNotOrtalaması(int notOrtalaması) {
        this.notOrtalaması = notOrtalaması;
    }

    @Override
    public String toString() {
        return "Universite{" +
                "universty='" + universty + '\'' +
                ", Bolum='" + bolum + '\'' +
                ", ogrencıSayısı=" + ogrencıSayısı +
                ", notOrtalaması=" + notOrtalaması +
                '}';
    }


}

