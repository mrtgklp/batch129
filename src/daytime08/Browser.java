package daytime08;

public class Browser {
    public static void main(String[] args) {
        String adresCubugu = "Her browser adress cubugu vardır";
        Edge edge = new Edge(adresCubugu);
        edge.search();
        edge.sıfreKaydetme();
        edge.get();

        Edge edge1 = new Edge(adresCubugu);
        System.out.println(edge1.adresCubugu);
    }
    public void get(){
        System.out.println("Browserlar web sayfasına gider");
    }
    public void search(){
        System.out.println("Browserlar arama yapar");
    }
    public void sıfreKaydetme(){
        System.out.println("Browserlar istenildiginde sifre kayededer");
    }

}
