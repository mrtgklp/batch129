package mini_projects.BookStore;
//1-a:tüm ürünlerin ortak öz ve methodları
public class Product {
    private static int count=0;
    private int id;
    private String name;
    private String price;
    private int stok;

    public Product( String name, String price, int stok) {
        count++;
        this.id = count;
        this.name = name;
        this.price = price;
        this.stok = stok;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }


}
