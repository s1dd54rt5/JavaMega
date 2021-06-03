import java.util.Scanner;

interface Sum {
    default void sum(int n){
        int s = 0;
        for(int i=0;i<=n;i++){
            s = s + i;
        }
        System.out.println("\nThe sum is: "+s);
    }
}

interface Factorial {
    default void factorial(int n){
        int p = 1;
        for(int i=n;i>0;i--){
            p = p * i;
        }
        System.out.println("\nThe factorial is: "+p);
    }
}

public class Numbers implements Sum, Factorial {
    public void sum(int n) {
        Sum.super.sum(n);
    }
    public void factorial(int n){
        Factorial.super.factorial(n);
    }
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sh.nextInt();
        sh.close();
        Numbers num = new Numbers();
        num.sum(n);
        num.factorial(n);
    }
}
