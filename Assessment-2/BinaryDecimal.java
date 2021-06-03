import java.util.Scanner;

public class BinaryDecimal {
    public static void main(String args[]){
        long bin;
        System.out.println("Enter a binary number: ");
        Scanner sh = new Scanner(System.in);
        bin = sh.nextLong();
        int decimal = convertBinaryToDecimal(bin);
        System.out.println("Binary to Decimal\n");
        System.out.println(bin+ " = " + decimal+"\n");
        int dec;
        System.out.println("Enter a decimal number: ");
        dec = sh.nextInt();
        sh.close();
        System.out.println("Decimal to Binary");
        long binary = convertDecimalToBinary(dec);
        System.out.println("\n" + dec + " = " + binary);
    }

    public static int convertBinaryToDecimal(long num) {
        int decimalNumber = 0, i = 0;
        long remainder;
        
        while (num != 0) {
          remainder = num % 10;
          num /= 10;
          decimalNumber += remainder * Math.pow(2, i);
          ++i;
        }
        
        return decimalNumber;
    }

    public static long convertDecimalToBinary(int n) {
        long binaryNumber = 0;
        int remainder, i = 1;
    
        while (n!=0) {
          remainder = n % 2;
            n /= 2;
            binaryNumber += remainder * i;
            i *= 10;
        }
        
        return binaryNumber;
    }
}
