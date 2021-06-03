import java.util.Scanner;

public class Biggest {
    public static void main(String args[]){
        Scanner sh = new Scanner(System.in);
        int[] A = new int[20];
        System.out.println("Enter the number of elements you want: ");
        int n = sh.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            A[i]=sh.nextInt();
        }
        sh.close();
        if(A[(n-1)/2]>A[0]&&A[(n-1)/2]>A[n-1]){
            System.out.println("Largest element between first, last, and middle values: "+A[(n-1)/2]);
        } else if (A[(n-1)/2]<A[0]&&A[0]>A[n-1]) {
            System.out.println("Largest element between first, last, and middle values: "+A[0]);
        } else {
            System.out.println("Largest element between first, last, and middle values: "+A[n-1]);
        }
    }
}
