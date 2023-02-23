package mywork01;


import java.util.Arrays;

public class ornek {
    //Kaç tane String verilerse verilsin içlerinden en uzun olan veren kodu yazınız

    public static void main(String[] args) {
        int arr[][] = {{9, 14, 1}, {16, -22, 3}};
        System.out.println(m(arr));

        String str1 = "Ali";
        String str2 = "Abdullah";
        String str3 = "Hüseyin";
        String str4 = "isak";
        String str5 = "Hasan";
        String str6 = "Muhammed";

        enUzumİsim(str1,str2,str3,str4,str5,str6);
        // verilen sayılardan ilk haric tum sayıları toplayım  ilk sayı ile carpan bir method oluşturunuz

        int a = 12;
        int b = 5;
        int c = 14;
        int d = 17;
        int e = 9;
        int f = 12;

        total(a,b,c,d,e,f);
        //Varargsları kullanarak verilen string'leri birleştiren code yazınız
        String mrt = "Adıyamda";
        String mrt1 = "Nemrut";
        String mrt2 = "Dagı";
        String mrt3 = "Başka";
        String mrt4 = "Bir";
        String mrt5 = "Güzel";

        birleştirme(mrt,mrt1,mrt2,mrt3,mrt4,mrt5);

    }//main

    private static void birleştirme(String...mrt) {
        String cumle1 = "";
        for (String w:mrt
             ) {
            cumle1 += w + " ";
        }
        System.out.println(cumle1);
    }

    private static void total(int carpanDeger,int...a) {
        int sonuç = 0;
        for (int w:a
             ) {
            sonuç = sonuç + w;
        }
        System.out.println("Total : " + sonuç);
        int total = carpanDeger * sonuç;
        System.out.println("Carpımları = " +total);
    }

    private static void enUzumİsim(String... str) {
        String sum = "";
        for (String w: str
             ) {
            if (w.length()>=sum.length()){
                sum = w;
            }
        }
        System.out.println(sum);
    }

    public static int m(int[][] m) {
        int result = 3;
        for (int i = 1; i < m.length; i++) {

            for (int k = 0; k < m[i].length; k++) {

                result += m[i][k];
            }
        }
        return result;
    }

}

