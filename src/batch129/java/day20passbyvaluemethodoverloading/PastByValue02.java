package batch129.java.day20passbyvaluemethodoverloading;

public class PastByValue02 {
        public static void main(String[] args) {
            String name = "Tom Hanks";
            String updatename = updateName(name,"Jr.");
            System.out.println(name);//Tom Hanks
            System.out.println(updatename);//Tom Hanks Jr.

            name = updateName(name,"Jr.");
            System.out.println(name);//Tom Hanks Jr.
        }
        public static String updateName(String name,String add){

            name = name + " " +add;
            return name;
        }
}
