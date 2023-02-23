package practice.practice_nighttime.nighttime02;

public class C02_MethodCreation {
    public static void main(String[] args) {
        //protokol tribunu == vip ==static
        //Dikdortgenin alanini hesaplayan kodu yaziniz ve kullaniniz
        System.out.println("Dikdörtgen Alanın = " + dikdörtgenAlanı(5,6));
        System.out.println("Dikdörgenin Cevresi = " + dikdörtgeninCevresi(4,8));
        kareAlanı(20);
    }
     /*
            Access      static    datatype methodismi( parametreler)
            modifier
     */
    public static int dikdörtgenAlanı(int a,int b){
        return a * b;//carpmanin sonucunu kulaniciya verdim
    }//methodBody
        //Dikdortgenin cevresini hesaplayan kodu yaziniz ve kullaniniz

    public static double dikdörtgeninCevresi(double a, double b){
        return (a + b)*2;
    }//methodBody
    //Karenin alanini hesaplata kodu yaziniz
    public static void kareAlanı (int a){
        System.out.println("Karenin Alanı : " + (a * a ));
    }
}
