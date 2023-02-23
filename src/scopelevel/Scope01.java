package scopelevel;

public class Scope01 {
    int x = 12;//Class memember//instance variable
    public static void main(String[] args) {
        int y = 15;//Local variable

            System.out.println(y);
            printx();

    }//main
    public static  void printx(){
        int z = 10;
        System.out.println(z);
    }
}//class
