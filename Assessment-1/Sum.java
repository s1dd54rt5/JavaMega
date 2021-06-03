import java.util.Scanner;

class Sum {
    public static void main(String args[]){
        int sum = 0;
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter a number till which you want the sum: ");
        int n = sh.nextInt();
        sh.close();
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println("The sum is: "+sum);
    }
}
