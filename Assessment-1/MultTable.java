import java.util.Scanner;

class MultTable {
    public static void main(String args[]){
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter a number of which you want table: ");
        int n = sh.nextInt();
        sh.close();
        for(int i=1;i<=10;i++){
            System.out.println(n+"x"+i+" = "+n*i);
        }
    }
}
