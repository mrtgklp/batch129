package batch129.java.day27encapsulationabstraction;

public class StudentRunner {
    public static void main(String[] args) {
        Student myStd = new Student();//Object
       String stdId = myStd.getStdtId();
       // System.out.println("stdId = " + stdId);//stdId = AC123
        //Student 1
        System.out.println(myStd.getStdtId());
        System.out.println(myStd.getGpa());
        System.out.println(myStd.isPoor());
        //Student 2
        myStd.setStdtId("TH123");
        myStd.setGpa(4.0);
        myStd.setPoor(false);
       // System.out.println(myStd.getGpa());//4.0
        
        //Student yourStd = new Student();
        //System.out.println("yourStd.getGpa() = " + yourStd.getGpa());//3.99
    }
}
