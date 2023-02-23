package mini_projects.restaurantbıllgenerator;

import java.util.Scanner;

/*
Proje: Restaurant Fiş Üretme Uygulaması(BillGenerator)
       1-Bir restaurantın online sipariş sisteminde hesabı
       yazdıran uygulama tasarlayınız.

       2-Restauranttaki yiyecekler bir listte tutulsun.
         Yiyeceklerin kodu, ismi ve ücreti olsun.

       3-Yiyecek menüsü, sipariş oluşturma/iptal ve hesap
         oluşturma için seçim menüsü gösterilsin.

       4-Yiyecek menü:Listedeki yiyecekler menü şeklinde listelensin
         Sipariş girme:Yiyeceğin kodu ve istenilen adet girilerek sipariş oluşturulsun
                       Her sipariş için kod üretilsin(başlangıç 1000 artarak devam eder)
                       Her bir yiyecek siparişi için tutar hesaplansın

         Sipariş iptal:Sipariş kodu girilerek sipariş silinsin
         Hesap oluşturma: Tutarları ile birlikte tüm siparişleri ve
                          toplam tutarı gösteren bir hesap fişi yazdırılsın.
*/
public class RestaurantBıllGenerator {
    public static void main(String[] args) {
        getSelectıonMenu();

    }
    //1-islem secimi için menu gosterelim
    public static void getSelectıonMenu(){
        Scanner inp = new Scanner(System.in);
        DishService dıshServıce= new DishService();//10-listede 10 tane dish var
        OrderService orderService1 = new OrderService();
       //2-menu tekrar tekrar gosterilsin
        //3-yıyecekler için class olusturalım
        //7-siparıs icin calss olusturalım
        int select=-1;
        while (select!=0){
            System.out.println("---------------------------------");
            System.out.println("*****Lezzet Restaurant Sıparıs Uygulaması*****");
            System.out.println("1-menu");
            System.out.println("2.Sıparıs gir");
            System.out.println("3.Siparıs iptal et");
            System.out.println("4-Hesap olustur");
            System.out.println("0-Cıkıs");
            System.out.println("Seciminiz:");
            select=inp.nextInt();
            System.out.println("---------------------------------");

            switch (select){
                case 1:
                    //menu goster
                    dıshServıce.showmenu();
                    break;
                case 2:
                    //siparıs olustur
                    orderService1.createOrder(dıshServıce);
                    break;
                case 3:
                    //siparıs iptal
                    orderService1.deleteOrder();
                    break;
                case 4:
                    //hesap
                    orderService1.printBıll();
                    break;
                case 0:
                    System.out.println("iyi gunler");
                    break;
                default:
                    System.out.println("Hatalı Giris");
            }
        }
    }
}
