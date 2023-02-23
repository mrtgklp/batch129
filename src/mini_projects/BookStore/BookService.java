package mini_projects.BookStore;

import pratice.pratice.praticeDTNT06.B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2-a: bookla ilgili işlemler
public class BookService implements ProductService {
    Scanner inp = new Scanner(System.in);
    //3-bookları saklamak için list olustur
    List<Book> books = new ArrayList<>();

    //4: baslangıc sistemde mevcut kitaplar olsun:test etmek için
    public BookService() {
        Book book1 = new Book("Fareler ve insanlar", "120 lira", 15, "J.Steinbeck", "Penguin", "A111");
        Book book2 = new Book("Sefiller", "150 lira", 5, "V.Hugo", "Penguin", "A222");
        Book book3 = new Book("Suc ve ceza", "120 lira", 15, "Dostoyevski", "Dream", "A333");
        this.books.add(book1);
        this.books.add(book2);
        this.books.add(book3);
    }

    //5:işlem menusu
    @Override
    public void processMenu() {
        int choice;
        do {
            System.out.println("---------------------------");
            System.out.println("1-Kitapları listele");
            System.out.println("2-Kitap ekle");
            System.out.println("3-Kitap sil");
            System.out.println("4-Yayınevine göre filtrele");
            System.out.println("0-Geri Dön");
            System.out.println("Seciminiz: ");
            choice = inp.nextInt();
            inp.nextLine();
            switch (choice) {
                case 1:
                    listProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    System.out.println("Yayınevi :");
                    String publisher = inp.nextLine();
                    filterProducts(publisher);
                    break;
                case 0:
                    System.out.println("Ana menuye yölendiriyorsunuz...");
                    break;
                default:
                    System.out.println("Hatalı giriş!!");
                    break;
            }
        } while (choice != 0);

    }
    //6: kitapları formatlar yazdıralım

    @Override
    public void listProduct() {
        System.out.println("-----------------------------------------");
        System.out.printf("%-2s | %-20s | %-15s | %-10s | %-4s | %-10s | %-4s\n",
                "ID", "Kitap Adı", "Yazar Adı", "Yayınevi", "ISBN", "Birim Fiyat", "Stok");
        System.out.println("-----------------------------------------");
        this.books.forEach(book -> System.out.printf("%-2s | %-20s | %-15s | %-10s | %-4s | %-10s | %-4s\n",
                book.getId(), book.getName(), book.getAuthorName(), book.getPublisher(), book.getIsbn(), book.getPrice(), book.getStok()));
        System.out.println("-----------------------------------------");
        System.out.println();
    }

    //7: yeni kitap ekle
    @Override
    public void addProduct() {
        System.out.println("ISBN: ");
        String isbn = inp.nextLine();
        boolean isExists = false;
        for (Book book : this.books
        ) {
            if (book.getIsbn().equals(isbn)) {
                System.out.println("Bu kitap sistemde zaten kayıtlı,lütfen ürün güncelleme yağınız.");
                isExists = true;
                break;
            }
        }
        if (!isExists) {
            System.out.println("Kitap adı: ");
            String name = inp.nextLine();
            System.out.println("Yazar adı:");
            String author = inp.nextLine();
            System.out.println("Yayınevi: ");
            String publisher = inp.nextLine();
            System.out.println("Birim Fiyat: ");
            String price = inp.nextLine();
            System.out.println("Stok: ");
            int stock = inp.nextInt();
            inp.nextLine();
            Book newBook = new Book(name, price, stock, author, publisher, isbn);
            this.books.add(newBook);
        }
        listProduct();

    }
//updateProduct:Stok artma/azaltma,birim fiyat:Ödev

    //8:Kullanıcıdan alınan id ile ürünü bulalım ve listeden silelim
    @Override
    public void deleteProduct() {
        boolean isExists = true;
        System.out.println("Kitap id: ");
        int id = inp.nextInt();
        for (Book book : this.books) {
            if (book.getId() == id) {
                isExists = true;
                this.books.remove(book);
                System.out.println("Ürün silindi.");
                break;
            } else {
                isExists = false;
            }
        }
        if (!isExists) {
            System.out.println("Ürün bulunamadı.");
        }

    }

    //9:kitapları yayınevine göre filtrele
    @Override
    public void filterProducts(String filter) {
        /*this.books.stream().filter(book -> book.getPublisher().equalsIgnoreCase(filter)).forEach(book -> System.out.printf("%-2s | %-20s | %-20 | %-10 | %-4 | %-10 | %-4\n",
                book.getId(), book.getName(), book.getAuthorName(), book.getPublisher(), book.getIsbn(), book.getPrice(), book.getStok()));
        */
        int counter = 0;
        for (Book book : this.books
        ) {
            if (book.getPublisher().equalsIgnoreCase(filter)) {
                System.out.printf("%-2s | %-20s | %-15s | %-10s | %-4s | %-10s | %-4s\n",
                        book.getId(), book.getName(), book.getAuthorName(), book.getPublisher(), book.getIsbn(), book.getPrice(), book.getStok());
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Ürün bulunamadı");
        }
    }
}
