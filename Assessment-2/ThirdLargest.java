import java.util.Scanner;

public class ThirdLargest {
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
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(A[i]>A[j]) {
                    int t = A[j];
                    A[j] = A[i];
                    A[i] = t;
                }
            }
        }
        System.out.println("The third largest element is: "+A[2]);
    }
}