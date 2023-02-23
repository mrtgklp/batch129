package mini_projects.restaurantbıllgenerator;

public class Order {
    public static  int count=999;
    public int orderCode;
    public int numOfDish;
    public double orderPrice;
    public Dısh dısh;
    //8-: yemek ve adet parametreleriyle obje olusturalım
    public  Order(Dısh dısh,int numOfDish){
        count++;
        this.orderCode=count;
        this.dısh=dısh;
        this.numOfDish=numOfDish;
    }
    //9:siparis fiyatını hesapla
    public void setOrderPrice(){
        this.orderPrice=this.dısh.getPrice()*this.numOfDish;
    }
}
