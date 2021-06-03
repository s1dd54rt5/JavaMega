import java.util.Scanner;

class Armstrong {
    public static void main(String args[]){
        int a,sum=0,temp;
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = sh.nextInt();
        int number = a;
        sh.close();
        while (a >= 1) {
            temp = a%10;
            sum = sum + (temp*temp*temp);
            a = a/10;
        }
        if(number == sum) {
            System.out.println("The number is an Armstrong number");
        } else {
            System.out.println("The number is not an Armstrong number");
        }
    }
}
