package mini_projects.repeat.aracsigortauygulaması;

import java.util.Scanner;

public class Arac {
    //type,prim
    public String type;//Field/feature/özellik
    public int prim;

    public void countPrime(int term) {
        switch (this.type) {
            case "otomobil":
                this.prim = term == 1 ? 2000 : 2500;
                break;
            case "kamyon":
                this.prim = term == 1 ? 3000 : 3500;
                break;
            case "motorsiklet":
                this.prim = term == 1 ? 1500 : 1750;
                break;
            case "otobus":
               countPrime(term);
                break;
            default:
                System.out.println("Hatalı giris!!!");
                this.prim = 0;
                break;
        }

    }

    private void countPrimBus(int term) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Otobus type giriniz: ");
        System.out.println("1.18 - 30 koltuk ");
        System.out.println("1. 30 koltuk veya ustu ");

        int busType = inp.nextInt();
        switch (busType) {
            case 1:
                this.prim = term == 1 ? 4000 : 4500;
                break;
            case 2:
                this.prim = term == 1 ? 5000 : 5500;
                break;
            default:
                System.out.println("Hatalı giris!!!");
                break;
        }

    }


}
