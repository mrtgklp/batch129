package batch129.java.day30exceptıonsınterface;

public class InvalidStudentGradeExceptıons extends Exception{
    /*
    1)Kendi application'iniza ozel kurallar olusturmak icin kendi "Exception Class" larinizi olusturabilirsiniz.
    2)Olusturdugunuz "Exceptıons Class" lar i)Compile time Exceptıons  ii) Run time Exceptıons olabilir
    3)Compile time exceptıons  olusturmak için classınızın parenti exceptıons class olabilir.
    4)Run time exceptıons olusturmak için classınızın parenti Run timeExceptıons class olmalıdır
    5)Kendi olusturdugumuz Exception Class'lara "Custom Exception Class" denir.
     */
    public InvalidStudentGradeExceptıons(String message){
        super(message);
    }//constructor
}
