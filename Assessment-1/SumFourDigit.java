import java.util.Scanner;

class SumFourDigit{
    public static void main(String args[]){
        int a,sum=0;
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter a 4 digit number: ");
        a = sh.nextInt();
        sh.close();
        while (a >= 1) {
            sum = sum + a%10;
            a = a/10;
        }
        System.out.println("The sum of the digits is: "+sum);
    }
}