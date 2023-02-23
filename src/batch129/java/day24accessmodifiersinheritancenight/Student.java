package batch129.java.day24accessmodifiersinheritancenight;

public class Student {
    public String name = "Tom Hanks";//name herkes tarafından bilinebilir o yuzden public yaptık
    String stdID = "TH2023HU12001";//default//student ID okul yönetimdeki insanlar tarafından bilinebilir o yuzden "default" yaptım
    protected int accountNO = 7651234;//account NO ben esim ve cocuklarım tarafındna bilinebilir o yuzden "protected" yaptım
    private int balance = 123000;//Hesabımdan ki para miktarı yalnızca benim taraafından bilinmelidir bu yuzden"private" yaptım

    /*
    1)Access modifier'lar genis'den dara; public > protected > default > private
    2)Class'lar protected ve private olamazlar, sadece public ve default olabilirler
    3)Access Modifier'lar ne ise yarar?
        Variablelara methodlara classlara ulasmayi duzenler.
    4)Kac tane access modifier var ?
        public > protected > default > private
        i) "public"ler icin hicbir sinirlama yoktur projenin her yerinden ulasilabilir
        ii) "protected" ayni package'in icinden ya da farkli packagelarda o packagedeki cocuklar ulasabilir.
        iii) "default" sadece ayni packageden ulasilabilir. Bu yuzden "default"larin diger adi "package private"dir
        iv) "private"  sadece class icinden ulasilabilir, class disina cikildiginda ulasilamaz
        v) "protected" ile "default"un farki nedir ?
           Package disina ciktigimizda childlardan "protected"lara ulasabiliriz. "default"lara ulasamayiz.
     */

}
