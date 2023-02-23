package mini_projects.Loginpageapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//5-User object ile ilgili islemler
public class UserServc {
    //6-kullanıcı bilgilerini tutmak için list olusturalım.
    List<Userr> userListe = new ArrayList<>();
    //tüm metodlarda kullanıcıdan bilgi almak için Scanner objesi olustur
    Scanner inp = new Scanner(System.in);

    //7-userName veya emial kayıtlı useri getirme
    private Userr getUserr(String userNameorEmaile) {
        for (Userr userr : userListe
        ) {
            if (userr.getUsername().equals(userNameorEmaile)) {
                return userr;
            } else if (userr.getEmail().equals(userNameorEmaile)) {
                return userr;
            }
        }
        return null;
    }

    //8-email validation
    private static boolean validateEmail(String email) {
        boolean isvalid;
        boolean isExistSpace = email.contains(" ");
        boolean isContainsAt = email.contains("@");
        if (isExistSpace) {
            System.out.println("Email bosluk iceremez..");
            isvalid = false;
        } else if (!isContainsAt) {
            System.out.println("Email @ sembolünü içermelidir");
            isvalid = false;
        } else {//asd@gmail.com ->[asd,@gmail.com]
            String firstPart = email.split("@")[0];//asd
            String secondPart = email.split("@")[1];//gmail.com

            boolean valide = firstPart.replaceAll("[a-zA-Z0-9_.-]", "").isEmpty();//As-2*->*
            boolean checkstart = valide && firstPart.length() > 0;

            boolean checkEnd = secondPart.equals("gmail.com") || secondPart.equals("hotmail.com") || secondPart.equals("yahoo.com");
            if (!checkstart) {
                System.out.println("Mailin kullanıcı adı bölümü en az bir karakter içermelidir ve sadece kucuk-buyuk-harf-rakam veya _.- icerebilir");
            }
            if (!checkEnd) {
                System.out.println("gmail.com,hotmail.com veya yahoo.com ile bitmelidir!");
            }
            isvalid = checkstart && checkEnd;
        }
        if (!isvalid) {
            System.out.println("Tekrar Deneyiniz.");
        }
        return isvalid;
    }

    //9-password validatıon
    private static boolean validatePassword(String password) {//ASdf12*-
        boolean isvalid;
        boolean isExitsSpace = password.contains(" ");
        boolean isLegenthGthan6 = password.length() >= 6;
        boolean isExistupperletter = password.replaceAll("[^A-Z]", "").length() > 0;//AS
        boolean isExistlowerletter = password.replaceAll("[^a-z]", "").length() > 0;//df
        boolean isExistDigit = password.replaceAll("[\\D]", "").length() > 0;//12
        boolean isExistSymbol = password.replaceAll("[\\P{Punct}]", "").length() > 0;//*-
        if (isExitsSpace) {
            System.out.println("Sıfre bosluk iceremez.");
        } else if (!isLegenthGthan6) {
            System.out.println("Sıfre en az 6 karakter içermelidir.");
        } else if (!isExistupperletter) {
            System.out.println("Sıfre en az 1 tane Buyuk harf içermelidir");
        } else if (!isExistlowerletter) {
            System.out.println("Sıfre en az 1 tane kucuk harf icermelidir");
        } else if (!isExistDigit) {
            System.out.println("Sıfre en az 1 tane rakam icermelidir");
        } else if (!isExistSymbol) {
            System.out.println("Sıfre en az 1 sembol icermelidir");
        }
        isvalid = !isExitsSpace && isLegenthGthan6 && isExistupperletter && isExistlowerletter && isExistDigit && isExistSymbol;
        if (!isvalid) {
            System.out.println("Gecersiz sifre, tekrar deneyiniz");
        }
        return isvalid;
    }
    public void register(){
        System.out.println("Ad-soyad: ");
        String name= inp.nextLine();
        //10-username unique/Eşsiz olmalı
        String username =getUserName();
        //11-email unique,gecerli olmalı
        String email = getEmail();
        //12-password : gecerli olmalı
        String password= getpassword();
        //13-user object olusturulım
        Userr userr= new Userr(name,username,email,password);
        //14-userı listeye kaydedelim
        this.userListe.add(userr);
        System.out.println("Tebrikler isleminiz basrıyla gerceklestirildi.");
        System.out.println("Kullanıcı adı(veya email) ve sifrenizle sisteme giris yapabilirisniz..");

    }
    //10-a-kullanıcıdan username alma
    private String getUserName(){
        String username;
        boolean existusername;
        do {
            System.out.println("Kullanıcı adı giriniz:");
            username = inp.nextLine();//bu username daha önce kullanılmıs mı?
            existusername=getUserr(username)!=null;
            if (existusername){
                System.out.println("Bu userName kullanılmıs farklı bir username deneyiniz.");
            }
        }while (existusername);
        return username;
    }
    //11-a-kullanıcıdan email.alma

    private String getEmail(){
        String email;
        boolean isvalid;
        boolean existsEmail;
        do {
            System.out.println("Lütfen email giriniz: ");
            email=inp.nextLine();//email gecerli mi: validation
            isvalid = validateEmail(email);//gecerli ise unique mi
            existsEmail= getUserr(email)!=null;
            if (existsEmail){
                System.out.println("Bu email zaten kayıtlı farklı email deneyiniz.");
                isvalid=false;
            }



        }while (!isvalid);

        return email;
    }
    //12-a-password olusturma
    private String getpassword(){
        String passw;
        boolean isvalidpsw;
        do {
            System.out.println("sifrenizi giriniz:");
            passw=inp.next();//gecerli mi
            isvalidpsw = validatePassword(passw);


        }while (!isvalidpsw);
        return passw;
    }
    //15-email veya username ile giris yapma
    public void  logine(){
        System.out.println("kullanıcı adı veya email giriniz: ");
        String usernameoremail= inp.nextLine();
        //16-girilen deger ile user ı bulma
        if (getUserr(usernameoremail)!=null){
            Userr userr = getUserr(usernameoremail);
            //17-user bulunduysa sifre kontrolu
            boolean isWrong=true;
            while (isWrong){
                System.out.println("Sıfrenızı giriniz:");
                String passwrd = inp.nextLine();
                //Girilen sıfre buldugumuz userın sıfresiyle aynı mı
                if (userr.getPassword().equals(passwrd)){
                    System.out.println("Sisteme giris yaptınız..");
                    isWrong=false;
                }else {
                    System.out.println("Sıfrenız yanlıs,Tekrar deneyınız.");
                }
            }
        }else {
            System.out.println("Sistemde kayıtlı kullanıcı adı veya email bulunamadı.");
            System.out.println("Uyeseniz bilgileriniz kontrol ederek tekrar deneyiniz,Uye degilseniz Lutfen Uye olunuz");

        }
    }
}
