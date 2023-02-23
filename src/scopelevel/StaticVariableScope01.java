package scopelevel;

public class StaticVariableScope01 {

   static int x = 15;
    static int y = 17;
    public static void main(String[] args) {
        //System.out.println(x);
        //print();

        //System.out.println(StaticVariableScope01.x);

        StaticVariableScope01 local = new StaticVariableScope01();
        local.print();
        System.out.println(local.x);
        System.out.println(local.y);
    }
    public  void print(){
        System.out.println(x);
    }
}
