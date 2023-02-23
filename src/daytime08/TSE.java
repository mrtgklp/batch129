package daytime08;

public abstract class TSE {
    String malzeme = "Undan yapılır";
    abstract void gramaj500();//Childler buna mutlaka uymak zorunda
    abstract  void hijyenikOlma();

    void odunAtesindePiser(){
        System.out.println("TSE ekmekler odun atesinde piser");
    }
    void fiyat(){
        System.out.println("15 TL");
    }
}
