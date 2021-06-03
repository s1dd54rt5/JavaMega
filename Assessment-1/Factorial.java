import java.util.Scanner;

class Factorial {
    public static void main(String args[]){
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sh.nextInt();
        sh.close();
        int prod = 1;
        while(num>0){
            prod = prod * num;
            num--;
        }
        System.out.println("The factorial of the number is: "+prod);
    }
}
