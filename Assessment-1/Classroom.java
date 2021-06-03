import java.util.Scanner;

class Classroom {
    public static void main(String args[]){
        System.out.println("Enter the class number: ");
        int cno;
        Scanner sh = new Scanner(System.in);
        cno = sh.nextInt();
        sh.close();
        switch(cno){
            case 604: {
                System.out.println("Java Programming");
                break;
            }
            case 605: {
                System.out.println("Python Programming");
                break;
            }
            default: {
                System.out.println("Invalid Input");
            }
        }
    }
}
