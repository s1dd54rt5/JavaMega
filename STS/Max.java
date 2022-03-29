package JavaMega.STS;
import java.util.*;

public class Max {
    static int countDistinct(int arr[], int n){
        int res = 1;
 
        for (int i = 1; i < n; i++){
            int j = 0;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;
            if (i == j)
                res++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        int m,n,k,max=0;
        n = sh.nextInt();
        m = sh.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = sh.nextInt();
        }
        k = n-m;
        sh.close();
        for(int i=0;i<k;i++){
            int[] subarray = new int[m];
            for(int j=i;j<i+m;j++){
                subarray[j-i] = array[j];
            }
            if(max<countDistinct(subarray, m)){
                max = countDistinct(subarray, m);
            }
        }
        System.out.println(max);
    }
}
