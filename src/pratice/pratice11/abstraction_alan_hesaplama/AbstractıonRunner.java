package pratice.pratice11.abstraction_alan_hesaplama;

public class AbstractıonRunner {
    //Dikdörtgen ve üçgenin alanlarını hesaplayan bir kod yazınız.(abstraction kullanın)
    public static void main(String[] args) {
        Dikdörtgen dikdörtgen = new Dikdörtgen();
        System.out.println(dikdörtgen.alanhesabla(5, 4));
        System.out.println(dikdörtgen.alanhesabla(7, 4));

        Ucgen ucgen = new Ucgen();
        System.out.println(ucgen.alanhesabla(6, 2));
        System.out.println(ucgen.alanhesabla(10, 5));



    }
}
