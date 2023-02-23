package mini_projects.appointmentApp;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//3-randevu islemleri
public class AppointmentService {
    Scanner inp = new Scanner(System.in);
    //4-Randevu listesi
    List<Appointment> appointment=new ArrayList<>();
    //5-tarih listesi
    List<LocalDate> dates= new ArrayList<>();

    //6-uygulama basladıgında ertesi günden itibaren 7 gunluk takvim olsun
    public AppointmentService(){
        LocalDate day=LocalDate.now();//bugun:17.02
        for (int i=0;i<7;i++){
            day=day.plusDays(1);//18.02
            dates.add(day);
        }
    }
    //7-randevu olusturma
    public void getAppointment(){
        //8-randevu takvimi dolumu
        if (this.dates.isEmpty()){
            System.out.println("Bu hafta tüm randevular dolmustur,Daha sonra tekrar deneyiniz!");
        }else {
            System.out.println("Lütfen isiminizi giriniz: ");
            String name=inp.nextLine();
            System.out.println("Sayın " + name+",randevu alabileceginiz tarihler: ");
            for (int i = 0;i<this.dates.size();i++){
                System.out.println((i+1)+" - "+this.dates.get(i));
            }
            System.out.println("Randevu almak istediginiz tarihin numarasını giriniz: ");
            int numberOfDate=inp.nextInt();
            inp.nextLine();
            //9-Secilen tarih no gecerli
            if (numberOfDate>0 && numberOfDate<=this.dates.size()){
                Appointment appointment1= new Appointment(name,this.dates.get(numberOfDate-1));
                this.appointment.add(appointment1);
                System.out.println("--------------------------------------------------------------");
                System.out.println("Sayın " + name+", Randevu tarihiniz: "+appointment1.getDate());
                System.out.println("Randevu no: "+appointment1.getId()+" ile randevunuzu görüntüleyebilirsiniz.");
                System.out.println("--------------------------------------------------------------");
                this.dates.remove(numberOfDate-1);
            }else {
                System.out.println("Hatalı giris!!!");
            }
        }
    }
    //10-randevu görüntüleme
    public void printAppointment(){
        System.out.println("Randevu no giriniz: ");
       boolean isExists=true;
        int appNo=inp.nextInt();
        for (Appointment app: this.appointment){
            if (app.getId()==appNo){
                System.out.println("------------------------------------");
                System.out.println(appNo+" nolu randevu bilgileri");
                System.out.println("isim  :"+app.getName());
                System.out.println("Randevu tarihi: " +app.getDate());
                System.out.println("------------------------------------");
                isExists=true;
                break;
            }else{
                isExists=false;
            }
        }
        if (!isExists){
            System.out.println("Randevu bulunamadı.");
        }
    }
    //11-randevuyu iptal etme
    public void cancelAppointment(){
        boolean isExists=true;
        System.out.println("Randevu no giriniz:");
        int appNo=inp.nextInt();
        inp.nextLine();
        for (Appointment app:this.appointment){
            if (app.getId()==appNo){
                this.dates.add(app.getDate());
                this.appointment.remove(app);
                System.out.println(app.getDate()+" tarihli randevunuz iptal edildi.");
                break;
            }else {
                isExists=false;
            }
        }
        if (!isExists){
            System.out.println("Randevu bulunamadı.");
        }
    }
}
