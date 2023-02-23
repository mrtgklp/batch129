package practice.practiceDTNT.practice04;

public class HesapMakinesiVarargs {
    public static void main(String[] args) {
        HesapMakinesi islem = new HesapMakinesi();
        islem.topla(122,3,34,-8);
        islem.cıkar(12,5,17);
        islem.carpma(12,43);
        islem.bölme(12,3);
    }
}
