import java.util.Scanner;

interface Number {
    public static int reverse(int number){
        int r = 0;
        while(number>0){
            r = r*10 + number%10;
            number = number/10;
        }
        return r;
    }
    public static boolean isPalindrome(int number){
        int revNum = 0;
        revNum = reverse(number);
        if(revNum==number){
            return true;
        } else {
            return false;
        }
    }
}

public class Num implements Number {
    public static void main(String args[]){
        System.out.println("Enter a number: ");
        Scanner sh = new Scanner(System.in);
        int num = sh.nextInt();
        sh.close();
        System.out.println(Number.reverse(num));
        System.out.println(Number.isPalindrome(num));
    }
}

