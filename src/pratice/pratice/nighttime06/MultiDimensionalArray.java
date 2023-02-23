package pratice.pratice.nighttime06;

public class MultiDimensionalArray {
    //INTERWIEW SORUSU
    // Aşağıdaki multidimensional array'lerin iç array'lerinde
    // aynı indexe sahip elamanların toplamını yazdıran bir program yazın.
    // int arr1[][] = {{1, 2}, { 3, 4, 5},{6}};
    // int arr2[][] = {{7, 8,9}, {12}};

    public static void main(String[] args) {

        int sinir = 0;
        int toplam = 0;

        int arr1[][] = {{1, 2, 25}, {3, 4, 5},{6},{4},{12},{12}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12},{65}};

        if (arr1.length <= arr2.length) {

            for (int i = 0; i < arr1.length; i++) {//Kısa olan kat alındı
                sinir = arr1[i].length;

                if (arr1[i].length > arr2[i].length) {
                    sinir = arr2[i].length;
                }//Buraya kadar sınırları buldum
                for (int j = 0; j < sinir; j++) {
                    toplam = arr1[i][j] + arr2[i][j];
                    System.out.println("[" + i + "," + j + "]" + " indexindeki elemanların toplami = " + toplam);

                }
            }
        } else {
            for (int i = 0; i < arr2.length; i++) {//Kısa olan kat alındı
                sinir = arr1[i].length;

                if (arr1[i].length > arr2[i].length) {
                    sinir = arr2[i].length;
                }//Buraya kadar sınırları buldum
                for (int j = 0; j < sinir; j++) {
                    toplam = arr1[i][j] + arr2[i][j];
                    System.out.println("[" + i + "," + j + "]" + " indexindeki elemanların toplami " + toplam);

                }
            }
        }


    }
}
