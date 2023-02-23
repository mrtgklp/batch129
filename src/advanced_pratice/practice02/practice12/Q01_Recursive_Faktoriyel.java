package advanced_pratice.practice02.practice12;

import java.util.ArrayList;
import java.util.List;

public class Q01_Recursive_Faktoriyel {
    //Faktoriyel hesaplayan bir method yazınız.(Loop kullanmayınız.)
    public static void main(String[] args) {
        System.out.println(faktoriyel(5));
    }
    public  static int faktoriyel(int sayı) {

        if (sayı >= 0) {
            if (sayı == 0 || sayı == 1) {
                return 1;
            } else {
                return sayı * faktoriyel(sayı - 1);//recursive
            }

        }else {
            throw new ArithmeticException("Sayı sıfırdan kucuk olamaz");
        }
    }
}
