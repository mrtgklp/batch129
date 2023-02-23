package pratice.pratice.nighttime06;

public class WhileLooopDoLoop {
    public static void main(String[] args) {
        //Ne zaman while loop ne zaman do while loop
        //0'dan başlayım 3 kadar 1'er 1'er artan kodu yazın
        int i = 0;
        while (i<3){
            System.out.println(i+" ");
            i++;
        }

        do {
            System.out.println(i + " ");
            i++;
        }while (i<3);
    }
}
