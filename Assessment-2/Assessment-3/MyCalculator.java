import java.util.Scanner;

class NumberException extends Exception {
    NumberException(String s){
        System.out.println("Exception: "+s);
    }
}

public class MyCalculator {

    public static double calculation(double n,double p) throws NumberException{
        if(n<0.0||p<0.0){
            throw new NumberException("Either number cannot be negative");
        } else if(n==0.0&&p==0.0){
            throw new NumberException("Both number cannot be zero");
        }
        return Math.pow(n, p);
    } 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n = s.nextDouble();
        double p = s.nextDouble();
        s.close();
        try {
            double res = calculation(n, p);
            System.out.println(res);
        } catch (NumberException e) {}
    }
}
