import java.util.Scanner;

class SumSquare {
    public static void main(String args[]){
        int sum = 0;
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter a number till which you want the sum of squares: ");
        int n = sh.nextInt();
        sh.close();
        for(int i=1;i<=n;i++){
            sum = sum + (i*i);
        }
        System.out.println("The sum is: "+sum);
    }
}
