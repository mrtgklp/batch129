package scopelevel;

public class LocalVaribalseScope01 {
    public static void main(String[] args) {
        LocalVaribalseScope01 local = new LocalVaribalseScope01();
        local.show();
       // System.out.println(x);
    }
    void show(){
        int x = 12;//Local variable
        System.out.println("X degeri " + x);

        int z;
        //System.out.println(z);
        {//block level
             z = 15;
            System.out.println(x);
        }
        {//blok level
            System.out.println(x);
        }
    }
}
