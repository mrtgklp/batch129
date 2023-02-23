package batch129.java.day24accessmodifiersinheritiance;

public class Fish {
    public int gram = 10;
    public String color ="Gri";

    public void eat(){
        System.out.println("Balıklar yosun yer");

    }

    public Fish(int gram) {
        this.gram = gram;
    }

    public Fish() {
        System.out.println("Balıklar yuzer");
    }

    public Fish(int gram, String color) {
        this.gram = gram;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gram=" + gram +
                ", color='" + color + '\'' +
                '}';
    }
}
