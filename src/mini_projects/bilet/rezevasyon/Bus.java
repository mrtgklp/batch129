package mini_projects.bilet.rezevasyon;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Bus {
    //2-Plaka,koltuk numaraları
    public String numberPlate;
    public List<String> seats=new ArrayList<>();
    //3-otobusu olusturdugumuzda koltuk noları olsun ve plaka set edilsin
    public Bus(String numberPlate){
        this.numberPlate=numberPlate;
        for (int i=1;i<=32;i++){
            this.seats.add(i+"");//String.valueOf()
        }
    }
}
