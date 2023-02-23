package mini_projects.login;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserServices {
    List<String> userNameList = new ArrayList<>();
    List<String> emailList = new ArrayList<>();
    List<String> passwordList = new ArrayList<>();
    public void showMenu(){
        System.out.println("====TechProEducatıon====");
        System.out.println("1.Üye ol");
        System.out.println("2.Giriş yap");
        System.out.println("3.Çıkış yap");
        System.out.println("Seçiminiz: ");

    }
    public void register(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ad-soyad: ");
        String name = scanner.nextLine();

        String userName;
        boolean existUsername;
        do {
            System.out.println("Kullanıcı adını gırınız:");
            userName =scanner.nextLine();
            existUsername =userNameList.contains(userName);
            if (existUsername){
                System.out.println("Bu username daha once kullanılmıstır.Yeni bir username deneyiniz.");
            }
        }while (existUsername);
        String email;
        boolean isValid;
        boolean existEmail;

        do {
            System.out.println("Email giriniz");
            email =scanner.nextLine().trim();
            isValid =
            existEmail = emailList.contains(email);
            if (existEmail){
                isValid = false;
                System.out.println("Bu email daha önce kullanılmıstır.Yeni bir email deneyiniz.");
            }
        }while (!isValid);


    }
    public static boolean validateEmail(String email){
        boolean isValid;

       boolean space =  email.contains(" ");
       boolean isContainAt =  email.contains("@");

       if (space){
           System.out.println("Email bosluk iceremez");
           isValid = false;
       }else if(!isContainAt){
           System.out.println("Email '@' icermelidir");
           isValid = false;
       }else{
           String firstPart = email.split("@")[0];
           String secondPart = email.split("@")[1];

          boolean checkStart = firstPart.replaceAll("[a-zA-Z0-9_.-]","").length()==0;
          boolean checkEnd = secondPart.equals("gmail.com")||
                             secondPart.equals("yahoo.com")||
                             secondPart.equals("hotmail.com");
          if (!checkStart){
              System.out.println("Email kucuk harf,buyuk harf rakam ve _.- dısında karakter iceremeze.");
          }else if (!checkEnd){
              System.out.println("Email gmail.com,hotmail.com veya yahoo.com ile bitmeli");
          }
          isValid = checkEnd&&checkStart;
       }
        return isValid;
    }

}
