package TheoryDA;
import java.util.*;

public class ArrayQuestion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[]{4,6,2,3,8};
        int n = 5;
        Arrays.sort(arr);
        System.out.println("The sorted array is: ");
        for(int i = 0; i < n; i++) { 
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int res[] = new int[n];
        int j = 1;
        res[0] = arr[0];
        for(int i = 1; i < n; i++) { 
            if(res[j-1] != arr[i]) {
                res[j] = arr[i];
                j++; }
        }
        System.out.println("The final array is: "); 
        for(int i = 0; i < j; i++) {
        System.out.print(res[i] + " "); }
        System.out.println();
        for(int i = 0; i < n/2; i++) { int temp = arr[i];
            arr[i] = arr[n-i-1]; arr[n-i-1] = temp;
            }
            System.out.println("The reversed array is: ");
            for(int i = 0; i < n; i++) { System.out.print(arr[i] + " ");
            } System.out.println();
            System.out.println("Enter the number to be searched: ");
            int x = s.nextInt();
            boolean found = false; for(int i = 0; i < n; i++) {
            if(arr[i] == x) { found = true;
            break; }
            }
            if(found) {
            System.out.println("Element found!");
            } else {
            System.out.println("Element not found");
            }
        s.close();
    }
}
