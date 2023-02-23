package batch129.java.day27encapsulationabstraction;

public class Student {
    private String stdtId = "AC123";//private member denir
    private double gpa = 3.99;
    private boolean poor = true;
    //Encapsulation yapılmış data yı okuyabilir miyiz?
    //get () methodlar(getter) encapsule edilmiş datayı okumamıza yarar
    //get() methodlar her zaman public olur.
    //get method () ların return type variable data type aynı olur
    //get methodların isimleri get + variable name şeklinde olur
    //get meyhodlar parametre kullanmazlar.
    //"is" + variable name şeklinde olur.
    //get method lar (getter) parametre kullanmazlar
    public String getStdtId() {
        return stdtId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isPoor() {
        return poor;
    }
    //Encapsulation yapılan data ların degeri degiştirebilir
    //set methodlar (setter) encapsule edilmiş dataların degerlerini degiştirmemize yarar
    //set methodlar her zaman public olur
    //set methodların return type her zaman void olur
    //set methodları isimler set + variable name şeklinde olur
    //set methodlar variable ile aynı data type inda parametre kullanılar

    //getter ve setter ların ikisine birden Java Beans denir.

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPoor(boolean poor) {
        this.poor = poor;
    }

    public void setStdtId(String stdtId) {
        this.stdtId = stdtId;
    }
}
