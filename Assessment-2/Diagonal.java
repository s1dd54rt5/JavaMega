import java.util.Scanner;

public class Diagonal {
    public static void main(String args[]){
        System.out.println("Enter size of matrix: ");
        Scanner sh = new Scanner(System.in);
        int[][] A = new int[10][10];
        int sum = 0;
        int n = sh.nextInt();
        System.out.println("Enter matrix A: ");
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                A[i][j] = sh.nextInt();
            }
        }
        sh.close();
        System.out.println("Sum of Diagonal elements of Matrix: ");
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i==j){
                    sum = sum + A[i][i];
                }
            }
        }
        System.out.println(sum);
    }
}
