import java.util.Scanner;

class AddUntill {
    public static void main(String args[]){
        boolean option = true;
        Scanner sh = new Scanner(System.in);
        int a,b,sum;
        String opt;
        while(option){
            System.out.println("Enter first number: ");
            a = sh.nextInt();
            System.out.println("Enter second number: ");
            b = sh.nextInt();
            sum = a+b;
            System.out.println("The sum is: "+sum);
            System.out.println("Do you wish to continue?(y/n): ");
            opt = sh.next();
            if(opt.equals("n")){
                option = false;
            }
        }
        sh.close();
    }
}