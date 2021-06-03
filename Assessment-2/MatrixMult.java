import java.util.Scanner;

public class MatrixMult {
    public static void main(String args[]){
        System.out.println("Enter size of matrix: ");
        Scanner sh = new Scanner(System.in);
        int[][] A = new int[10][10];
        int[][] B = new int[10][10];
        int n = sh.nextInt();
        System.out.println("Enter matrix A: ");
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                A[i][j] = sh.nextInt();
            }
        }
        System.out.println("Enter matrix B: ");
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                B[i][j] = sh.nextInt();
            }
        }
        sh.close();
        System.out.println("Multiplication Matrix: ");
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print(String.valueOf(A[i][j]*B[i][j])+' ');
            }
            System.out.print('\n');
        }
    }
}
