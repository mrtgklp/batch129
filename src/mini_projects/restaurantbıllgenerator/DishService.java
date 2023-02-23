package mini_projects.restaurantbıllgenerator;

import java.util.ArrayList;
import java.util.List;

//4: dish ile ilgili islemler
public class DishService {
    //5: yıyecekleri listeye ekleme saklama
    private List<Dısh> dishlist = new ArrayList<>();
    public DishService(){
        Dısh dish1= new Dısh(1000,"Adana kebabı",220.00);
        Dısh dish2= new Dısh(1001,"Urfa kebabı",200.00);
        Dısh dish3= new Dısh(1002,"Cökertme kebabı",200.00);
        Dısh dish4= new Dısh(1003,"Baklava",100.00);
        Dısh dish5= new Dısh(1004,"Kunefe",79.00);
        Dısh dish6= new Dısh(1005,"Sutlac",60.00);
        Dısh dish7= new Dısh(1006,"Yayık Ayran",30.00);
        Dısh dish8= new Dısh(1007,"Cay",35.00);
        Dısh dish9= new Dısh(1008,"Cola",15.00);
        Dısh dish10= new Dısh(1009,"Su",7.50);
        this.dishlist.add(dish1);
        this.dishlist.add(dish2);
        this.dishlist.add(dish3);
        this.dishlist.add(dish4);
        this.dishlist.add(dish5);
        this.dishlist.add(dish6);
        this.dishlist.add(dish7);
        this.dishlist.add(dish8);
        this.dishlist.add(dish9);
        this.dishlist.add(dish10);

    }
    //6-yemek menusu goster
    public void showmenu(){
        System.out.println("        *** Lezzetlerimiz ***           ");
        System.out.printf("%-3s    %-20s   %-6s\n","Kod","Yemegin adı","Fiyat");
        System.out.printf("%-3s    %-20s   %-6s\n","---","------- ---","------");
        for (Dısh dish:this.dishlist
             ) {
            System.out.printf("%-3s    %-20s   %-6s lira\n",dish.getCode(),dish.getName(),dish.getPrice());
        }
    }
    //12:code ile dish bulma
    public Dısh findByOrderByDish(int code){
        if (code==0){
            System.out.println("Ana menüye yönlendiriliyorsunuz.");
        }else{
            for (Dısh dısh:this.dishlist){
                if (dısh.getCode()==code){
                    return dısh;
                }
            }
            System.out.println("Ürün bulunamadı");
        }
        return null;
    }
}
