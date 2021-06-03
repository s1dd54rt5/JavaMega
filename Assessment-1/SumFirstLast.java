import java.util.Scanner;

class SumFirstLast {
    public static void main(String args[]){
        String a;
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = sh.nextLine();
        sh.close();
        System.out.println(); 
        System.out.println("The sum of the digits is: "+
        (Integer.parseInt(String.valueOf(a.charAt(0)))+
        Integer.parseInt(String.valueOf(a.charAt(a.length()-1))))); 
    }
}
