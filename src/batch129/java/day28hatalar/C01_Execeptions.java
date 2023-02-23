package batch129.java.day28hatalar;

public class C01_Execeptions {
    public static void main(String[] args) {
        //Compile time error == Kodların yazım asamasında olusan hatalardı. CTE
        //Run time error = Kodları calıstırdıktan sonra olusan hata tipi RTE

        /*
        1) NUmber format exeception
         */
        //Bir String alıp ınt a ceviren kodu yazınız

        String str = "123";//HappyScenario positive Scenario
        
        convertStringToInteger(str);//String ınteger a cevir method
        int result = convertStringToInteger(str);//Stringi integer e cevirir
        System.out.println("result +5 = " + (result +5));//1281235

        String st = "123a";//Nagative Scenario
        int result2 = convertStringToInteger(st);
        System.out.println("result2 + 10 = " + (result2 + 10));

    }

    private static int convertStringToInteger(String str) {
        int i = 0;
        //Ctrl + alt + t


        try {
            i = Integer.valueOf(str);
            System.out.println("Burası try bolumu = " + i);
        } catch (NumberFormatException e) {
            System.out.println("Rakam olmayan karakter iceren String ler Integer cevirlemez");
        }
        return i;
    }
}
