package mywork01;

public class MultiDimensionalArrays {
    //INTERWIEW SORUSU
    // Aşağıdaki multidimensional array'lerin iç array'lerinde
    // aynı indexe sahip elamanların toplamını yazdıran bir program yazın.
    // int arr1[][] = {{1, 2}, { 3, 4, 5},{6}};
    // int arr2[][] = {{7, 8,9}, {12}};
    public static void main(String[] args) {

        int sınır = 0;
        int toplam = 0;

        int arr1[][] = {{1, 2}, { 3, 4, 5},{6}};
        int arr2[][] = {{7, 8,9}, {12},{23},{15}};


        if (arr1.length<=arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                sınır = arr1[i].length;
                if (arr1[i].length > arr2[i].length) {
                    sınır = arr2[i].length;
                }
                for (int j = 0; j < sınır; j++) {
                    toplam = arr1[i][j] + arr2[i][j];
                    System.out.println("[" + i + "," + j + "]" + " Endekslerin Toplamları = " + toplam);
                }
            }
        }
        else {
            for (int i = 0; i < arr2.length; i++) {
                sınır = arr1[i].length;
                if (arr1[i].length<arr2.length){
                    sınır = arr2[i].length;
                }
                for (int j = 0; j < sınır; j++) {
                    toplam = arr1[i][j] + arr2[i][j];
                    System.out.println("[" + i + "," + j + "]" + " İndekslerin toplamları : " + toplam);
                }
            }
        }
    }
}
