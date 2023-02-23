package pratice.pratice_nighttime.nighttime05;

import java.util.Arrays;
import java.util.Scanner;

public class C01 {
    /*INTERWIEW QUESTIONS
    Kullanicidan bir String aliniz.
    String'de var olan her character'in sayisini ekrana yazdiriniz.
    Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
    abaa   ==> a=3  b=1
            */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir String giriniz: ");
        String str = input.nextLine();

        String arr[] = str.split("");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        int counter = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1].equals(arr[i])){
                counter++;//aynı olanlar için 1 artır
            }else{
                System.out.println(arr[i-1] + " karakterin sayısı " + (counter +1)+ " kez tekrarlanmıştır");
                counter = 0;//baska harfe gectigi için sıfıranmalı
            }
            if(i== args.length-1) {//defalarca kodu yazdırmaması için sona gelindiginde yazdırması için if loop kullandır
                System.out.println(arr[i] + " karakterinin sayısı " + (counter + 1) + " kez tekrarlanmıştır");
            }
        }


    }
}
