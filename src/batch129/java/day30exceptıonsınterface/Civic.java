package batch129.java.day30exceptıonsınterface;
/*
1)Bir ınterface si bir class parent ti yapmak için ımplement keyword kullanırız.
2)Java parentlar class oldugunda multıple parent a musade etmez
Ama bazen multıple parent a ıhtıyac duyarız.Bu ıhtıyacı gidermek java Interface ısımlı
Yeni bir yapı oluşturdu Bu yapı sayesınde bır class ıcın coklu ınterface parent olusturabiliriz.
3)Coklu ınterface parent ların içine aynı isimli methodlar koyabilir.
    Mesela Ac nın Engıne ın ve securıty nın her birini iclerine run() method koymak gibi.
    Child clas herhangi birini ovrride ettıgınde hepsını override etmis gibi olur sonrada
    body yı chıld class tan yazarak uygulamasını yapmıs olur.
 */
public class Civic implements Ac,Engine,Security{
    @Override
    public void cool() {
        System.out.println("Accor cools super");
    }

    @Override
    public void run() {
        System.out.println("Cıvıc runs perfect");
    }
}
