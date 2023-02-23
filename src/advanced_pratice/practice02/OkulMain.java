package advanced_pratice.practice02;

import java.util.Scanner;

public class OkulMain {
      /*
    1- Değişkenleri ad, soyad, yaş olan bir Ogrenci pojo class'ı oluşturunuz.

     2- Değişkenleri okulAd, maxOgrenciSayisi, ArrayList cinsinden Öğrencileri olan bir Okul pojo class oluşturunuz

     3- Main metodunun olduğu OkulMain isimli bir class oluşturunuz.

     4- Bir okul objesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar öğrenci ekleyiniz.
        Fakat oluşturacağınız öğrencilerin yaşı 15'i geçmemeli, 8'den küçük olmamalı.
        Bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Okul okul = new Okul();
        System.out.println("Okul adını giriniz");
        okul.setOkulAdi(scanner.nextLine());
        System.out.println("Maksimum öğreci sayısını giriniz");
        okul.setMaxOgrenciSayisi(scanner.nextInt());

        for (int i = 1; i <= okul.getMaxOgrenciSayisi(); i++) {
                Ogrenci ogrenci = new Ogrenci();
            System.out.println(i + ". ögrenci ad: ");
            ogrenci.setAd(scanner.nextLine());

            System.out.println(i + ". ogrenci soyAd: ");
            ogrenci.setSoyAd(scanner.nextLine());

            System.out.println(i + ". ogrenci yaş: ");

            try {
                ogrenci.setYas(scanner.nextInt());
                if (ogrenci.getYas()<8 || ogrenci.getYas()>15){
                    throw new ArithmeticException();
                }

            } catch (ArithmeticException e) {
                System.out.println("Ögrenci Yası 8 ile 15 aralıgında olmalıdır");
                 i--;
                continue;
            }catch (Exception e){
                System.out.println("Gecerli bir 'SAYI' giriniz..");
                i--;
                continue;
            }

            okul.addOgrenciToList(ogrenci);



            System.out.println(okul.getOgrenciListesi());
        }
        System.out.println(okul);
    }


    }
