import java.util.Scanner;

public class FloatInt {

    static int add(int a,int b){
        return a+b;
    }
    static float add(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        int[][] A = new int[3][3];
        float[][] B = new float[3][3];
        int sum = 0;
        float sum1 = 0;
        System.out.println("Enter 1 for int array or 2 for float: ");
        Scanner sh = new Scanner(System.in);
        int choice = sh.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Enter int array: ");
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        A[i][j] = sh.nextInt();
                    }
                }
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        sum = add(sum,A[i][j]);
                    }
                }
                System.out.println("The sum is: "+sum);
                break;
            }
            case 2: {
                System.out.println("Enter float array: ");
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        B[i][j] = sh.nextFloat();
                    }
                }
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        sum1 = add(sum1,B[i][j]);
                    }
                }
                System.out.println("The sum is: "+sum1);
                break;
            }
            default: {
                System.out.println("Enter valid input.");
            }
            sh.close();
        }
    }
}
