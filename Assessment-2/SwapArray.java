import java.util.Scanner;

public class SwapArray {
    public static void main(String args[]){
        Scanner sh = new Scanner(System.in);
        int[] A = new int[20];
        int[] B = new int[20];
        System.out.println("Enter the number of elements you want: ");
        int n = sh.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            A[i]=sh.nextInt();
        }
        sh.close();
        for(int i=0;i<n;i++){
            B[i]=A[i];
        }
        int t = B[0];
        B[0] = B[n-1];
        B[n-1] = t;
        for(int i=0;i<n;i++){
            System.out.print(String.valueOf(B[i])+' ');
        }
    }
}
