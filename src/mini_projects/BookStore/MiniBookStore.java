package mini_projects.BookStore;
/*
Proje: Mini Book Store
       Online bir kitap market için ürün yönetim uygulaması yapınız.
       Kitap markette kitap ve defter satışı olacak, ancak ileride yeni ürün çeşidi eklenebilir olmalı.

       Kitap özellikleri: id, isim, birim fiyat, stok, yazar adı, yayınevi,isbn no
       Defter özellikleri: id, isim, birim fiyat, stok, marka, yaprak sayısı,ürün kodu

       Kullanıcı ilgili kategorideki ürünleri listeleyebilmeli
       Kullanıcı kategoriye göre ürün ekleyebilmeli,ürün mevcutsa uyarı verilmeli
       Kullanıcı ürünleri benzersiz numaralarına göre silebilmeli.
       Kullanıcı ürünleri marka(defter) veya yayınevine(kitap)  göre filtreleyip listeleyebilmeli.

        NotebookService:ÖDEV
        UpdateProduct:opsiyonel kısmı
*/


import java.util.Scanner;

public class MiniBookStore {
    public static void main(String[] args) {
        enter();
    }
    //1-product,book,noterbook class
    public static void enter() {
        Scanner inp = new Scanner(System.in);
        System.out.println("---------------- Mini Book Store--------");
        int select;
        do {

            System.out.println("Ürün yönetim paneli");
            System.out.println("1.Kitaplar");
            System.out.println("2.Defterler");
            System.out.println("0-Cıkıs");
            System.out.println("Seciminiz");
            select=inp.nextInt();
            inp.nextLine();
            ProductService service;
            //BookService bookService=new BookService();
            //NoteBookService noteBookService=new NoteBookService();
            switch (select){
                case 1:
                    service=new BookService();
                    service.processMenu();
                    //bookService.processMenu();
                    break;
                case 2:
                    service=new NoteBookService();
                    service.processMenu();
                    //noteBookService.processMenu();
                    break;
                case 0:
                    System.out.println("İyi günler!!!");
                    break;
                default:
                    System.out.println("Hatalı giris");
                    break;
            }


        }while (select!=0);
    }
}

