import java.util.Scanner;

class Gapful {
    public static void main(String args[]){
        Scanner sh = new Scanner(System.in);
        int n =sh.nextInt();
        int n2 = n;
        int first=0,last=0;
        while (n2>1){
            last = n2%10;
            n2 = n2/100;
            first = n2%10;
        }
        int number = first*10 + last;
        sh.close();
        if(n%number==0){
            System.out.println("Gapful");
        } else {
            System.out.println("Not Gapful");
        }
    }
}
