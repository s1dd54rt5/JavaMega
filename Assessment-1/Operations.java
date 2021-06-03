import java.util.Scanner;

class Operations {
    public static void main(String args[]){
        System.out.println("Java Calculator\n\nChoose an option:");
        System.out.println("Addition - a");
        System.out.println("Subtraction - s");
        System.out.println("Multiplication - m");
        System.out.println("Division - d");
        Scanner sh = new Scanner(System.in);
        String opt = sh.nextLine();
        System.out.println("Enter first number");
        float a = sh.nextFloat();
        System.out.println("Enter second number");
        float b = sh.nextFloat();
        sh.close();
        switch (opt) {
            case "a": {
                System.out.println("Answer: "+(a+b));
                break;
            }
            case "s": {
                System.out.println("Answer: "+(a-b));
                break;
            }
            case "m": {
                System.out.println("Answer: "+(a*b));
                break;
            }
            case "d": {
                System.out.println("Answer: "+(a/b));
                break;
            }
            default: {
                System.out.println("Please choose a valid option");
            }
        }
    }
}
