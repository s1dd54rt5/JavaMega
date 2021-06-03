import java.util.Arrays;
import java.util.Scanner;
 
public class MaxMin{

    static int[] rearrange(int[] new_arra, int n){
        int temp[] = new int[n];
        int small_num = 0, large_num = n-1;
        boolean flag = true;
        for (int i=0; i < n; i++){
            if (flag)
                temp[i] = new_arra[large_num--];
            else
                temp[i] = new_arra[small_num++];
            flag = !flag;
        }
        return temp;
    }
 
    public static void main(String[] args) {
        int A[] = new int[6];
        int result[];
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the number of elements you want: ");
        int n = sh.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            A[i]=sh.nextInt();
        }
        sh.close();
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(A));
        result = rearrange(A,A.length);
        System.out.println("New Array: ");
        System.out.println(Arrays.toString(result));
    }
}