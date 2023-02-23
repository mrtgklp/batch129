package hastane_projesi;

public class Doktor {
    private String name;
    private String lastName;
    private String unvanı;

    public Doktor(String name, String lastName, String unvanı) {
        this.name = name;
        this.lastName = lastName;
        this.unvanı = unvanı;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUnvanı() {
        return unvanı;
    }

    public void setUnvanı(String unvanı) {
        this.unvanı = unvanı;
    }

    @Override
    public String toString() {
        return "Doktor{" +
                "name='" + name + '\'' +
                ", soyisim='" + lastName + '\'' +
                ", unvanı='" + unvanı + '\'' +
                '}';
    }
}
