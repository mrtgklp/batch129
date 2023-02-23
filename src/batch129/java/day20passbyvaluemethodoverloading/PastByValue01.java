package batch129.java.day20passbyvaluemethodoverloading;

public class PastByValue01 {
    public static void main(String[] args) {
        /*
        1)Java "pass-By-value" sayesinde variable ların orjinal degerlerini koruma altına alır
         */
        double shirt = 100;

        double studentShirtPrice =  discount("Student",shirt);//90
        double veteranShirtPrice =  discount("veteran",shirt);//80
        double seniorShirtPrice =  discount("senior",shirt);//95
        System.out.println(shirt);//100
        System.out.println(studentShirtPrice);
        System.out.println(veteranShirtPrice);
        System.out.println(seniorShirtPrice);

        shirt =  discount("veteran",shirt);
        System.out.println(shirt);//80

    }

    private static double discount(String state, double price) {
        switch (state){
            case "Student":
                price = price*0.90;
                break;
            case "veteran":
                price = price*0.80;
                break;
            case "senior":
                price = price*0.95;
                break;
            default:
                price = price;

        }
        return price;
    }
}
