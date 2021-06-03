import java.util.Scanner;

public class Contains {
    public static void main(String args[]){
        boolean contains = false;
        Scanner sh = new Scanner(System.in);
        int[] A = new int[2];
        System.out.println("Enter the elements: ");
        for(int i=0;i<2;i++){
            A[i]=sh.nextInt();
        }
        sh.close();
        for(int i=0;i<2;i++){
            if(A[i]==4){
                contains = true;
                break;
            } else if (A[i]==7){
                contains = true;
                break;
            }
        }
        if(contains){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
