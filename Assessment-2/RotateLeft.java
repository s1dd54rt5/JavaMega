import java.util.Scanner;

public class RotateLeft {
    public static void main(String args[]){
        Scanner sh = new Scanner(System.in);
        int[] A = new int[3];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<3;i++){
            A[i]=sh.nextInt();
        }
        sh.close();
        int t = A[0];
        for(int i=0;i<2;i++){
            A[i] = A[i+1];
        }
        A[2] = t;
        System.out.println("The final array: ");
        for(int i=0;i<3;i++){
            System.out.print(String.valueOf(A[i])+' ');
        }
    }
}
