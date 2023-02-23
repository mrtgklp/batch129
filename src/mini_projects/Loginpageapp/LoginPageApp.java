package mini_projects.Loginpageapp;

import java.util.Scanner;

/*

Project: Bir siteye üye olma ve giriş yapma sayfası tasarlayınız.

         menü: kullanıcıya işlem seçimi için menü gösterilir.

         üye olma(register): kullanıcıdan ad-soyad, kullanıcı adı, email ve şifre bilgileri alınız.
                             kullanıcı adı, email ve şifre birer listede tutulur.
                             aynı kullanıcı adı veya email kabul edilmez.

         giriş(login): kullanıcı adı/email ve şifre girilir.
                       kullanıcı adı veya email bulunamazsa kayıtlı değil, üye olun uyarısı verilir.
                       kullanıcı adı/email ile aynı indekste kayıtlı şifre doğrulanırsa siteye giriş yapılır.

         email validation: boşluk içermemeli
                         : @ içermeli
                         : gmail.com,hotmail.com veya yahoo.com ile bitmeli.
                         : mailin kullanıcı adı kısmında(@ den önce) sadece büyük-küçük harf,rakam yada -._ sembolleri olabilir.

         password validation: boşluk içermemeli
                            : en az 6 karakter olmalı
                            : en az bir tane küçük harf içermeli
                            : en az bir tane büyük harf içermeli
                            : en az bir tane rakam içermeli
                            : en az bir tane sembol içermeli
 */
public class LoginPageApp {
    public static void main(String[] args) {
        start();
    }
    public static void start(){
        Scanner inp = new Scanner(System.in);
        UserServc serv= new UserServc();
        //1.Kullanıcıya işlem menüsü gösterelim.
        int sele;
        do {
            System.out.println("===TECHPROEDUCATION===");
            System.out.println("1.üye ol");
            System.out.println("2.Giris yap");
            System.out.println("0-Cıkıs");
            sele=inp.nextInt();
            switch (sele){
                case 1:
                    //register
                    serv.register();
                    System.out.println(serv.userListe);
                    break;
                case 2:
                    //login
                    serv.logine();
                    break;
                case 0:
                    System.out.println("İyi Günler Dileriz...");
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız,tekrar deneyiniz");
                    break;
            }
        }while (sele!=0);
        //2-tüm userleri ortak özellikleri olacak,user classı olusturalım
    }
}
