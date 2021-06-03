import java.util.Scanner;

public class Larger {
    public static void main(String args[]){
        Scanner sh = new Scanner(System.in);
        int[] A = new int[3];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<3;i++){
            A[i]=sh.nextInt();
        }
        sh.close();
        if(A[0]>A[2]){
            System.out.println("Larger value between first and last element: "+String.valueOf(A[0]));
        } else {
            System.out.println("Larger value between first and last element: "+String.valueOf(A[2]));
        }
    }
}
