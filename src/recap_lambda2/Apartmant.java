package recap_lambda2;

public class Apartmant {

    private String cephe;
    private int katSayı;
    private int kira;

    public Apartmant() {
    }

    public Apartmant(String cephe, int katSayı, int kira) {
        this.cephe = cephe;
        this.katSayı = katSayı;
        this.kira = kira;
    }

    public String getCephe() {
        return cephe;
    }

    public void setCephe(String cephe) {
        this.cephe = cephe;
    }

    public int getKatSayı() {
        return katSayı;
    }

    public void setKatSayı(int katSayı) {
        this.katSayı = katSayı;
    }

    public int getKira() {
        return kira;
    }

    public void setKira(int kira) {
        this.kira = kira;
    }

    @Override
    public String toString() {
        return "Apartmant{" +
                "cephe='" + cephe + '\'' +
                ", katSayı=" + katSayı +
                ", kira=" + kira +
                '}';
    }
}
