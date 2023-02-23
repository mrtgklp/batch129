package practice.practiceDTNT.practice04;

public class HesapMakinesi {
    public void topla(int...a){
        int toplama = 0;
        for (int w:a
             ) {
            toplama+=w;
        }
        System.out.println(toplama);
    }
    public void cıkar(int...a){
        int cıkarma = 0;

        for (int w:a
             ) {
            cıkarma-=w;
        }
        System.out.println(cıkarma);
    }
    public void carpma(int...a){
        int carp = 1;

        for (int w:a
             ) {
            carp*=w;
        }
        System.out.println(carp);
    }
    public  void bölme(int a , int b){
        int bolme = 1;
        bolme = a/b;
        System.out.println(bolme);


        }

}
