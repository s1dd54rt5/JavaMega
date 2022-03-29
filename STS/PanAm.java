package JavaMega.STS;
import java.util.*;

public class PanAm {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        int n = sh.nextInt();
        int[][] peopleAge = new int[n][n];
        for(int i = 0;i<n;i++){
            for (int j =0;j<n;j++){
                peopleAge[i][j] = sh.nextInt();
            }
        }
        sh.close();
        int countSenior = 0, middleAge = 0;
        for(int i = 0;i<n;i++){
            for (int j =0;j<n;j++){
                if(i==0||i==n-1||j==0||j==n-1||i==j||i+j==7){
                    if(checkMiddleAge(peopleAge[i][j])){
                        middleAge++;
                    }
                } 
                if(!checkMiddleAge(peopleAge[i][j])){
                    countSenior++;
                }
            }
        }
        
        System.out.println(countSenior);
        System.out.println(middleAge);
    }

    static boolean checkMiddleAge(int age){
        if(age>18&&age<=60){
            return true;
        } else {
            return false;
        }
    }
}
