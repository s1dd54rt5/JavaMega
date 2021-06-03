import java.util.Scanner;

class Power {
    public static void main(String args[]){
        Scanner sh = new Scanner(System.in);
        int num,exp,p=1;
        System.out.println("Enter the number: ");
        num = sh.nextInt();
        System.out.println("Enter the exponent: ");
        exp = sh.nextInt();
        sh.close();
        for(int i=0;i<exp;i++){
            p = p * num;
        }
        System.out.println("The answer is: "+p);
    }
}
