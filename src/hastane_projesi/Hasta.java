package hastane_projesi;

public class Hasta {
    private static Hastane hastane1 = new Hastane();
    private String name;
    private String surName;
    private int hastaId;

    public Hasta(String name, String surName, int hastaId) {
        this.name = name;
        this.surName = surName;
        this.hastaId = hastaId;
    }

    public static Hastane getHastane1() {
        return hastane1;
    }

    public static void setHastane1(Hastane hastane1) {
        Hasta.hastane1 = hastane1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getHastaId() {
        return hastaId;
    }

    public void setHastaId(int hastaId) {
        this.hastaId = hastaId;
    }
}
