package batch129.java.day20passbyvaluemethodoverloading;

/*
        1)Method overloading yaparken method isimi degiştirilmez.
        2/Method overloading yaparken parametreler degiştirilir
            i)parametre değiştirirken parametrelerin data type ları degiştirilebilir
            ii)Parametre degiştiriken parametrelerin data type leri farklı ise yerleri değiştirilir
            iii)Parametre degiştiriken parametrelerin sayısı degiştirilebilir
       3) java için ismi ve parametleri aynı olan method tamamıyla aynıdr.
          Bu yüzden İsim ve Parametre method signature olarak adlandırılır.
       4) Method Overlaoding oluştururken return type degiştirmeni hiç bir etkisi yoktur
           Method Overlaoding oluştururken access modifier i degiştirmenin hiçbir etkisi yoktur
           Method Overlaoding oluştururken method u static veya non-static yapmanı hiçbir etkisi yoktur
           Method Overlaoding oluştururken Method Body degiştirmeni hiçbir etkisi yoktur
       5) private Method lar overlaod edilebilir.private method's can be overload?Çünkü method overloading sadece bir class in içinde olur
         "private" olmak ise baska class lara gidildiginde problem olusturur.
       6)Static Methodlar overload edilebilir.  

 */
public class MethodOverloading01 {
    private static void main(String[] args) {

        add(3,5);
    }
    private static void add(int a,int b){
        System.out.println(a+b);
    }
    private static void add(double a,double b){
        System.out.println(a+b);
    }
    private static void add(double a,int b){
        System.out.println(a+b);
    }
    private static void add(int a,double b){
        System.out.println(a+b);
    }
    private static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
