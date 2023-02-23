package mini_projects.restaurantbıllgenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//10:order islemler
 public class OrderService {
    Scanner inp = new Scanner(System.in);
    List<Order> orderList = new ArrayList<>();//1000,Adana*2


    //11:siparis olusturma
    public void createOrder(DishService dishService) {
        int dishCode;
        do {
            System.out.println("Lütfen ürün kodun giriniz: (CIKIS için 0 basınız!!!)");
            dishCode = inp.nextInt();//code ile ürünü bulmamız gerekiyor--->12
            if (dishService.findByOrderByDish(dishCode)!=null){
                Dısh dısh = dishService.findByOrderByDish(dishCode);
                System.out.println("Adet giriniz:");
                int number=inp.nextInt();
                //bu yemek daha önce siparis edilmis mi---->13
                Order order;
                if (findByOrderByDish(dısh)!=null){
                    order = findByOrderByDish(dısh);
                    order.numOfDish+=number;
                    order.setOrderPrice();
                }else {
                    order=new Order(dısh,number);//orderCode:otomatik:1000 adana
                    order.setOrderPrice();
                    this.orderList.add(order);
                }
            }//Siparis olusunca altta siparıs listesini görüntüle--->14
            listOrders();
        } while (dishCode!=0);
    }
    //14: Siparisleri Lİstele
    private void listOrders(){
        this.orderList.forEach(order -> System.out.printf("Siparis kodu:%-5s Lezzet kodu:%-4s Lezzet Adı:%-15s Adet:%-2s\n",
                order.orderCode,order.dısh.getCode(),order.dısh.getName(),order.numOfDish));
    }
    //13: dish bilgisiyle siparis bulma
    private Order findByOrderByDish(Dısh dısh){
        for (Order order:this.orderList
             ) {
            if (order.dısh.equals(dısh)){
                return order;
            }
        }
        return null;
    }
    //15: Siparis iptali
    public  void deleteOrder(){
        System.out.println("İptal etmek istediginiz siparis kodunu giriniz:");
        int code = inp.nextInt();
        boolean isValid = true;
        for (Order order:this.orderList
             ) {
            if (order.orderCode==code){
                System.out.println("İptal etmek istediginiz miktarı giriniz:");// 3 tane urfa
                int num = inp.nextInt();//2
                if (order.numOfDish>num){
                    order.numOfDish-=num;
                    order.setOrderPrice();
                    System.out.println("Siparis iptal edildi: " + order.dısh.getName());
                }else if (order.numOfDish==num){
                    this.orderList.remove(order);
                    System.out.println("Siparis iptal edildi: " + order.dısh.getName());
                }else {
                    System.out.println("Hatalı giris");
                }
                isValid=true;
                break;

            }else {
                isValid=false;
            }
        }
        if (!isValid){
            System.out.println("Siparis Kodu Gecersiz...");
        }
        System.out.println("                    Mevcut Siparisler                   ");
        listOrders();
    }
    //16: Hesap Olusturma
    public void printBıll(){
        double total = 0;
        System.out.println("        Lezzet Fişiniz          ");
        for (Order order:this.orderList){
            System.out.printf("Siparis kodu:%-6s Lezzet Kodu:%-4s Lezzet Adı:%-15s Adet:%-2s Tuta:%-6s Lira\n",
                    order.orderCode,order.dısh.getCode(),order.dısh.getName(),order.numOfDish,order.orderPrice);
            total+=order.orderPrice;
        }
        System.out.println("Toplam Tutar:"+total +" Lira");
        System.out.println("Afiyet olsun...");
        this.orderList.clear();
    }
}
