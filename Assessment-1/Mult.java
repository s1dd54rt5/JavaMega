import java.util.Scanner;

class Mult {
    public static void main (String args[]){
        int a = 0,b = 0, mul = 0;
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sh.nextInt();
        System.out.println("Enter the second number:");
        b = sh.nextInt();
        for(int i = 0; i < b; i ++){
            mul = mul + a;
        }
        sh.close();
        System.out.println("The multiplication of these numbers: "+mul);
    }
}