package batch129.java.day28hatalar;

public class C03_Execeptions {
    /*
      3) ArrayIndexOutOfBoundExeptin
     */
    // Bir Strin Arraydan verilan index daki datayı donduren bir method olusturun
    public static void main(String[] args) {
        String arr[] = {"Ali","Can","Elif"};

        getElementFromArray(arr,2);//positiveScenario
        getElementFromArray(arr,0);//Ali
        getElementFromArray(arr,4);//
    }

    private static void getElementFromArray(String[] arr, int i) {
        try {
            System.out.println("arr = " + arr[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array ındexsinde olmayan data istendi==>" + e.getMessage());
            e.printStackTrace();
            System.err.println("burasi renkli Acıklama");
        }
    }
}
