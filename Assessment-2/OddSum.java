import java.util.Scanner;

class OddSum {
    public static void main(String args[]){
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sh.nextInt();
        if(checkOddSum(n)){
            System.out.println("Odd Sum");
        } else {
            System.out.println("No odd sum");
        }
        sh.close();
    }

    static boolean checkOddSum(int number) {
        int n = number;
        int r = 0;
        while(n>1){
            r = r*10 + n%10;
            n = n/10;
        }
        if((r+number)%2==0){
            return false;
        } else {
            return true;
        }
    }
}