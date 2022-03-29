package JavaMega.STS;
import java.util.Scanner;

class PerfectSquare{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean flag = false;
        int n = s.nextInt();
        int squares[] = new int[n];
        s.close();
        for(int i=1;i<=n;i++){
            squares[i-1] = i*i;
        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<squares.length;j++){
                if(squares[j]==n*i){
                    flag = true;
                    break;
                }
            }
            if(flag){
                System.out.println("The value of m is: "+i);
                break;
            }
        }
    }
}