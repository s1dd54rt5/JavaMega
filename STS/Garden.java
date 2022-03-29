package JavaMega.STS;
import java.util.Scanner;

class Garden {
    public static void main(String[] args) {
        int rowSize,columnSize,i,j,counter = 0;
        Scanner sh = new Scanner(System.in);
        rowSize = sh.nextInt();
        columnSize = sh.nextInt();
        int length = rowSize*columnSize;
        Boolean []hasMango = new Boolean[length];
        for(j=0;j<columnSize;j++){
            for(i=0;i<rowSize;i++){
                counter++;
                if(i==0||j==0||j==columnSize-1){
                    hasMango[counter-1] = true;
                } else {
                    hasMango[counter-1] = false;
                }
            }
        }
        int searchNumber;
        searchNumber = sh.nextInt();
        if(hasMango[searchNumber-1]){
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
        sh.close();
    }
}