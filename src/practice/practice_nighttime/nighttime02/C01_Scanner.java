package practice.practice_nighttime.nighttime02;

import java.util.Scanner;

public class C01_Scanner {
    /*

    TechProEd spor salonu icin kullanicidan isim; soyisim; yas;
    kilo;boy;salona devam edecegi ay suresi bilgilerini alip aylik 20 $
    olarak toplam ucreti yazdiriniz

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*****TechproEd spor salonuna Hoş Geldiniz****");
        System.out.println("Lütfen üye Tam isminiz giriniz : ");
        String membersFullName = input.nextLine();
        System.out.println("Lütfen yaşınız giriniz : ");
        int age = input.nextInt();
        System.out.println("Lütfen kilonuzu giriniz : ");
        double weight = input.nextDouble();
        System.out.println("Lütfen boyunuz giriniz : ");
        double hight = input.nextDouble();
        System.out.println("Spor salonun aylık üyelik ücreti 20 dollars : ");
        int price = 20;
        System.out.println("Lütfen kaç aylık üyelik almak istiyorsanız belirtiniz:  ");
        int month = input.nextInt();
        int totalPrice = price*month;
        System.out.print("Üyelimiz tam ismi : " + membersFullName + "\nÜyemiz yaşı : " + age
                +"\nÜyemiz Kilosu : " + weight + " \nÜyemizin boyu : " + hight + "\nÜyelik aylık ücreti 20 dolars... " + price
                +"\nKaç aylık üyelik yapıldı :" + month + "\nToplam ödenecek tutar : "+totalPrice+"$");


    }
}
