import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String s) {
        super(s);
    }
}


public class CustomException {
    public static int concession(int age, char gender, boolean married) throws InvalidAgeException{
        if(age > 65 && gender == 'M') return 15;
        else if(age > 60 && gender == 'F') return 20;
        else if(married) {
            if(age > 18 && gender == 'F') return 10;
            else if(age > 21 && gender == 'M') return 10;
        } else {
            throw new InvalidAgeException("Does not recieve concession");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        char gender = s.next().charAt(0);
        boolean married = s.nextBoolean();
        int bill = s.nextInt();
        s.close();
        try {
            int discount = CustomException.concession(age, gender, married);
            bill = bill - bill*discount/100;
        } catch (InvalidAgeException e) {
            System.out.println("No discount");
        }
        System.out.println("The bill after discount is " + bill);
    }
}