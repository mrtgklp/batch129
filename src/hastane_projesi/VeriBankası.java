package hastane_projesi;

import java.util.ArrayList;
import java.util.List;

public class VeriBankası extends Hastane{
    List<Doktor> doktorList= new ArrayList<>();
    public void doctorName(){
        Doktor doktor1 = new Doktor("John","levıs","Generally Cerahi");
        Doktor doktor2 = new Doktor("Harry","Petter","Expert Doctor");
        Doktor doktor3 = new Doktor("Grater","Hans","Urolog");
        Doktor doktor4 = new Doktor("Edım","Hank","Norolog");
        Doktor doktor5 = new Doktor("Maria","Elena","Dahiliye");
        this.doktorList.add(doktor1);
        this.doktorList.add(doktor2);
        this.doktorList.add(doktor3);
        this.doktorList.add(doktor4);
        this.doktorList.add(doktor5);

    }
    public void showMenu(){
        System.out.println("====  Doktor Menusu");
        System.out.printf("%-8s  %-8s %-20s\n"," Name ","Lastname","    title   ");
        System.out.printf("%-8s  %-8s %-20s\n","----","---------","--------------");
        for (Doktor doktor: this.doktorList
             ) {
            System.out.println("%-8s  %-8s %-20s" + doktor.getName()+doktor.getLastName()+doktor.getUnvanı());
        }

    }
    public Doktor findByTitle(int title){
        if (title==0){
            System.out.println("Ana menuye yönlendiriyorsunuz");
        }else {
            for (Doktor doktor: this.doktorList){
                if (doktor.getUnvanı().equals(title)){
                    return doktor;
                }
            }
        }
        return new Doktor("","","0");
    }
}
