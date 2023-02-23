package batch129.java.day30exceptıonsınterface;

public class CastomExceptıons01 {
    public static void main(String[] args) {
        getStudentGrade(98);
        getTheNumberStudent(-87);
    }
    public static void getStudentGrade(int grade){
        if (grade<0 || grade>100){
            try {
                throw new InvalidStudentGradeExceptıons("Student Grades can not be less zero or greater than 100");
            } catch (InvalidStudentGradeExceptıons e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }else
            System.out.println(grade);
    }
    public static void getTheNumberStudent(int numOfStudent) {
        if (numOfStudent < 0) {
            try {
                throw new InvalidNumberExceptıons("Invalid number cannot be negatıve");
            } catch (InvalidNumberExceptıons e) {
                System.err.println(e.getMessage());
            }

        } else {
            System.out.println(numOfStudent);

        }
    }
}
