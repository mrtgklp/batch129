package batch129.java.day19listvarargs;

public class Varargs01 {

      /*
         Varargs'lar method olustururken "parametre" sayisinda bize esneklik saglar
         Method'un parantezleri icine yazilanlara "parametre" denir
         Method'u cagirirken kullanilan sayilara da "argument" denir.
         Note : Bir method da 1 den fazla Varargs Parametre kullanılamaz cunku ikincisi "unreachable code"olur
         Note: Varargs varargs dısındaki parametrelerle kullanabilir ama Varargs her zaman son parametre olmalıdır
       */
    public static void main(String[] args) {
        addTwoNumbers(3,5);
        addTreeNumbers(4,7,3);
        add(3,5,6,8,9,12,12);

    }
    //iki sayı toplayan method() oluştutrunuz

    public static void addTwoNumbers(int a,int b){
        System.out.println(a+b);
    }
    //Üc sayı toplayan method oluşturum
    public static  void addTreeNumbers (int a,int b,int c){
        System.out.println(a+b+c);
    }
    // istediginiz sayıda sayı toplamak için bir method oluşturunuz
    public  static void add(int...a){
        int sum = 0;
        for (int w: a){
            sum = sum + w;
        }
        System.out.println(sum);
    }

}
