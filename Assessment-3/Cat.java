import java.util.Scanner;

class InvalidMarksException extends Exception{  
    InvalidMarksException(String s){  
     super(s);  
    }  
   }  

public class Cat {
    static void validateCAT(int marks)throws InvalidMarksException{  
        if(marks>100||marks<0)  
            throw new InvalidMarksException("Invalid CAT Marks");  
    }  
    static void validateQuiz(int marks)throws InvalidMarksException{  
        if(marks>10||marks<0)  
            throw new InvalidMarksException("Invalid Quiz Marks");  
    } 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter CAT marks:");
        int cat = s.nextInt();
        try {
            validateCAT(cat);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Enter Quiz marks:");
        int quiz = s.nextInt();
        try {
            validateQuiz(quiz);
        } catch (Exception e) {
            System.out.println(e);
        }
        s.close();
    }
}
