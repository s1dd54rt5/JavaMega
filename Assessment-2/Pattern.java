import java.util.Scanner;

public class Pattern {
    public static void main(String args[]){
        System.out.println("Enter number of lines: ");
        Scanner sh = new Scanner(System.in);
        int n = sh.nextInt();
        if(n%2!=0){
            n++;
        }
        sh.close();
        System.out.println("Pattern: ");
        for(int i = 0;i<n/2;i++){
            for(int j=0;j<=i;j++){
                System.out.print(String.valueOf(j+1));
            }
            System.out.print("\n");
        }
        for(int i = n/2-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print(String.valueOf(j+1));
            }
            System.out.print("\n");
        }
    }
}
