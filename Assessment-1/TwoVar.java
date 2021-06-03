import java.util.Scanner;

class TwoVar {
    public static void main(String args[]){
        int a = 4, b = 2;
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the first number");
        a = sh.nextInt();
        System.out.println("Enter the second number");
        b = sh.nextInt();
        sh.close();
        a = a + b;
        System.out.println("Addition: "+a);
        a = a - 2*b;
        System.out.println("Subtraction: "+a);
        a = a + b;
        a = a * b;
        System.out.println("Multiplication: "+a);
        a = a / b / b;
        System.out.println("Division: "+a);
    }
}
