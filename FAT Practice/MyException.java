import java.util.Scanner;

class CustomAgeException extends Exception {
    CustomAgeException(String s){
        super(s);
    }
}

public class MyException {

    static void validate(int age) throws CustomAgeException {
        if(age<18){
            throw new CustomAgeException("Underage");
        } else {
            System.out.println("Valid age!");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        s.close();
        try {
            validate(age);
        } catch (CustomAgeException e){
            System.out.println("Exception Occured: "+e);
        }
    }
}
