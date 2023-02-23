package mini_projects.bilet.rezevasyon;

public class Ticket {
    //Mesafe,yolculuk type,fiyat,koltuk no
    public double distance;
    public int typeNo;
    public double price;
    public int seatNo;
    //5-Bileti yazdıralım
    public void printBilet(Bus bus){
        System.out.println("Toplam tutar: " + this.price);
        System.out.println("----Bilet Detayı----");
        System.out.println("Otobus plakası: " +bus.numberPlate);
        System.out.println("Mesafe     : " + this.distance);
        System.out.println("Yolculuk type: " + (this.typeNo==1 ? "Tek yön": "Gidis-Donus"));
        System.out.println("Koltuk no   : " + this.seatNo);
        System.out.println("Keyifli Yolculuklar Dileriz....");


    }
}
