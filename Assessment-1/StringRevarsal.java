import java.util.Scanner;

interface Revarsal {
    String revarsal(String a);
}

class StringRevarsal implements Revarsal{
    public String revarsal(String a) {
        byte[] strAsByteArray = a.getBytes();
 
        byte[] result = new byte[strAsByteArray.length];
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        return (new String(result));
    }
    public static void main(String args[]){
        Scanner sh = new Scanner(System.in);
        StringRevarsal obj = new StringRevarsal();
        System.out.println("Enter a string:");
        String o = sh.nextLine();
        o = obj.revarsal(o);
        System.out.println("Reversed string:"+o);
        sh.close();
    }
}