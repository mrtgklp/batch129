package daytime08;

public class Edge extends Browser{
    String adresCubugu ;
    public  Edge(String adresCubugu){
        this.adresCubugu = adresCubugu;
    }

    @Override
    public void search(){
        System.out.println("Edge arama yapar");
    }
    @Override
    public void sıfreKaydetme(){
        System.out.println("Edge istenildiginde sifre kayededer");
    }
}
