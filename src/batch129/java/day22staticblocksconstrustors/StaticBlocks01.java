package batch129.java.day22staticblocksconstrustors;

public class StaticBlocks01 {
    //Bir variable oluşturdugunuz da deger atamazsanız o variable   "initialize" etmediniz demektir.
    // Static variable lar static blocklar içinde initialize edilirse o class içinde herşer önce
    // hazır hale getirilmiş olur
    // bazen main method çalıştırmadan öne variableların hazır hale getirlmeli
    // bu yüzden static blocklar kullanılır

    //Note: static block lar static variable ları initialize etmek için kullanılırlar
    //Note: static block lar class içinde herşeyden önce çalıştırılırlar
    static double pi;
    static String shape;

    static{// bu aralıga static Block denir
        pi = 3.14;
        System.out.println("Static Block 1");
    }
    static{
        shape = "Cricle";
        System.out.println("Static block 2");
    }
    public static void main(String[] args) {
        System.out.println("main method");
        System.out.println(pi);
    }

}
