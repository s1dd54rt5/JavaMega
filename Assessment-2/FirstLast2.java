import java.util.Scanner;

public class FirstLast2 {
    public static void main(String args[]){
        Scanner sh = new Scanner(System.in);
        int[] A = new int[20];
        System.out.println("Enter the number of elements you want in first array: ");
        int n = sh.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            A[i]=sh.nextInt();
        }
        int[] B = new int[20];
        System.out.println("Enter the number of elements you want in second array: ");
        int n2 = sh.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<n2;i++){
            B[i]=sh.nextInt();
        }
        sh.close();
        if(A[0]==B[0]&&B[n2-1]==A[n-1]){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
