package mini_projects.restaurantbıllgenerator;
//3
public class Dısh {
 //yiyeceklerin fieldlarına okunabilsin ancak degistirilemesin
 private int code;
 private String name;
 private double price;
 //yıyecekler olusturulurken ozellıkler set edilsin


    public Dısh(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    //dish object lerini yazdırmak için
    @Override
    public String toString() {
        return "Dısh{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
