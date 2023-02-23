package mini_projects.appointmentApp;

import java.util.Scanner;

/*
Proje: Randevu oluşturma uygulaması geliştiriniz.

       1-Ana menüde kullanıcıya randevu alma veya görüntülemek için iki seçenek sunulur.
       2-Randevu alma/oluşturma
            -Randevu için uygun tarihler gösterilir.
            -Randevu alınmak istenen tarihin seçilmesi istenir.
            -en yakın 7 günlük takvim dolmuşsa daha sonra denenmesi istenir.
            -Geçerli bir tarih seçilmişse randevu oluşturulur ve bu tarih tarihler listesinden silinir.
       3-Randevu görüntüleme:
            -Kullanıcıya randevu no sorulur,
             randevu listesinde girilen no ile eşleşen randevu bilgileri yazdırılır.
       4-Randevu iptal:opsiyonel
            -Kullanıcıya randevu no sorulur,
             randevu listesinde girilen no ile eşleşen randevu listeden silinir.
       5-Randevu:
            -id : otomatik üretilsin
            -isim,randevu tarihi
 */
public class AppointmentApp {
    public static void main(String[] args) {
        start();
    }
    public static void start(){
        //1-menu olustur
        //2-appinment classı olustur
        Scanner inp = new Scanner(System.in);
        AppointmentService service=new AppointmentService();
        int select;
        do {
            System.out.println("Randevu Sistemine Hosgeldiniz.");
            System.out.println("1.Randevu olustur");
            System.out.println("2.Randevu Görüntüle");
            System.out.println("3.Randevu İptali");
            System.out.println("0-Cıkıs");
            System.out.println("Seciminiz: ");
            select=inp.nextInt();
            switch (select){
                case 1:
                    service.getAppointment();
                    break;
                case 2:
                    service.printAppointment();
                    break;
                case 3:
                    service.cancelAppointment();
                    break;
                case 0:
                    System.out.println("İyi günler..");
                    break;
                default:
                    System.out.println("hatalı giris!!!");
                    break;
            }
        }while (select!=0);
    }

}
