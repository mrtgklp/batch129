package batch129.java.day28hatalar;

public class C04_Exceptions {
    //4) NullPointerExceptions

    //Bit string de bulunan karakter sayısı veren kodu yazınız.
    public static void main(String[] args) {
        String str = "Fatma";
        getNumOfChars(str);//5
        String str1 = "";
        getNumOfChars(str1);//0
        String str2 = null;
        getNumOfChars(str2);//
    }

    private static void getNumOfChars(String str2) {
        //System.out.println(str.length());//5
        //System.out.println(st.length());//5
        //System.out.println(str2.length());
        try {
            System.out.println(str2.length());
        }
        catch (NullPointerException e){
            System.err.println("Legenth() hata olustu");
            e.printStackTrace();
        }
    }
}
