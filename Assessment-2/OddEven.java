import java.util.Scanner;


public class OddEven {
    public static void main(String args[]){
        int odd=0,even=0;
        Scanner sh = new Scanner(System.in);
        int[] A = new int[20];
        System.out.println("Enter the number of elements you want: ");
        int n = sh.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            A[i]=sh.nextInt();
            if(A[i]%2==0){
                even++;
            }
        }
        sh.close();
        odd = n-even;
        int[] Odd = new int[odd];
        int[] Even = new int[even];
        int oddCount=0,evenCount=0;
        for(int i=0;i<n;i++){
            if(A[i]%2==0){
                Even[evenCount]=A[i];
                evenCount++;
            } else {
                Odd[oddCount]=A[i];
                oddCount++;
            }
        }
        for(int i = 0;i<even;i++){
            A[i] = Even[i];
        }
        for(int i = 0;i<odd;i++){
            A[i+even] = Odd[i];
        }
        System.out.println("The elements are: ");
        for(int i=0;i<n;i++){
            System.out.print(String.valueOf(A[i])+' ');
        }
    }
}
