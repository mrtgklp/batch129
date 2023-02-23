package batch129.java.day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        //Example 1: Kullanıcı beraber bir Array oluşturunuz
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç ögrenci ismi gireceksiniz?");
        int numOfElements = input.nextInt();
        System.out.println("Girişi sonlandırmak için Q tuşuna basınız.");

        String stdNames[] = new String[numOfElements];
        for(int i = 1; i <= numOfElements;i++){
            System.out.println("Lütfen " + i + ". ögrencini adını giriniz");

            String stdName = input.next();

            if(stdName.equalsIgnoreCase("Q")){
                break;
            }

            stdNames[i-1] = stdName;
        }
        System.out.println(Arrays.toString(stdNames));
    }
}
