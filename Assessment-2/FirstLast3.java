import java.util.Scanner;

public class FirstLast3 {
    public static void main(String args[]){
        Scanner sh = new Scanner(System.in);
        int[] A = new int[3];
        System.out.println("Enter the elements of first array: ");
        for(int i=0;i<3;i++){
            A[i]=sh.nextInt();
        }
        int[] B = new int[3];
        System.out.println("Enter the elements of second array: ");
        for(int i=0;i<3;i++){
            B[i]=sh.nextInt();
        }
        sh.close();
        int[] C = new int[2];
        C[0] = A[0];
        C[1] = B[2];
        System.out.println("The final array: ");
        for(int i=0;i<2;i++){
            System.out.print(String.valueOf(C[i])+' ');
        }
    }
}
