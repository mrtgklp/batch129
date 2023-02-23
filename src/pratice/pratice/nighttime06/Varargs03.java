package pratice.pratice.nighttime06;

public class Varargs03 {
    public static void main(String[] args) {


        //Kaç tane String verilerse verilsin içlerinden en uzun olan veren kodu yazınız

        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Okan";
        String str4 = "Adnan";
        String str5 = "Sahsanem";

        enUzunİsim(str1,str2,str3,str4,str5);
    }

    public static void enUzunİsim(String... str) {

        String enUzunStr = "";
        for (String w:str
             ) {
            if (w.length()>enUzunStr.length()){
                enUzunStr=w;
            }
        }
        System.out.println("En Uzun İsimi = " + enUzunStr);
    }
}
