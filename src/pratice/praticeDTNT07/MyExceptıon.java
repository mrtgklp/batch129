package pratice.praticeDTNT07;

public class MyExceptıon extends Exceptıons{
    static  final String str = " Sen Degerlisin";
    public MyExceptıon(String str){
        super(str);
        System.out.println("Oyun oynandı ");
    }

    public MyExceptıon() {
        super(str);
    }
}
