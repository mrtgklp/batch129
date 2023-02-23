package pratice.pratice11.Interface_mass_hesapla;

public class MaasHesapla implements Vergi, MaasArtır {

    @Override
    public double yıllıkEkstra(int calısmaYıl) {
        return calısmaYıl * 100;
    }

    @Override
    public double saatlıkEkstra(int calısmaSaatı) {
        if (calısmaSaatı > 160) {
            return (calısmaSaatı - 160) * 10;

        } else {
            return 0;
        }
    }

    @Override
    public double vergi(int calısmaYıl, double brutMaas) {
        if (calısmaYıl>=10){
           return brutMaas*0.3;
        }else{
            return brutMaas*0.2;
        }

    }
    public double netMaas(double brutmMaas,int calısmaYılı,int calısmaSaati){

        return  brutmMaas+yıllıkEkstra(calısmaYılı)+saatlıkEkstra(calısmaSaati)-vergi(calısmaYılı,brutmMaas);
    }

}
