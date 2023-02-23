package pratice.praticeDTNT07;

import static pratice.praticeDTNT07.MyExceptıon.str;

public class RunnerExceptıons {
    public static void main(String[] args) {
        MyExceptıon my = new MyExceptıon(str);


        try {
            int x = 100 , y = 5;
            float ortalama;
            ortalama = (float) x/(float)y;
            if (ortalama<50){
                throw new IllegalArgumentException("Ortalama cok dusuk");

            }

        }catch (Exception e){
            System.out.println("Sorunun kaynagı ne ==> " + e.getMessage());
        }
        finally {
            System.out.println(str);
        }



    }
}
