import java.util.Scanner;

public class StudentData {
    String name;
    float CGPA;
    String programme;
    String school;
    String proctName;

    public static void main(String args[]){
        Scanner sh = new Scanner(System.in);
        StudentData[] A = new StudentData[20];
        System.out.println("Enter the number of students you want: ");
        int n = sh.nextInt();
        for(int i=0; i<n;i++) {
           A[i] = new StudentData();
        }
        for(int i=0; i<n;i++) {
            System.out.println("Enter the name of student "+(i+1)+": ");
            sh.nextLine();
            A[i].name = sh.nextLine();
            System.out.println("Enter the CGPA of student "+(i+1)+": ");
            A[i].CGPA = sh.nextFloat();
            System.out.println("Enter the programme of student "+(i+1)+": ");
            A[i].programme = sh.next();
            System.out.println("Enter the school of student "+(i+1)+": ");
            sh.nextLine();
            A[i].school = sh.next();
            System.out.println("Enter the proctor name of student "+(i+1)+": ");
            sh.nextLine();
            A[i].proctName = sh.next();
        }
        sh.close();
        System.out.println("Displaying the Data \n");
        for(int i=0; i<n;i++) {
            System.out.println("Data of Student "+(i+1)+"\n");
            System.out.println("Name: "+A[i].name);
            System.out.println("CGPA: "+A[i].CGPA);
            System.out.println("Programme: "+A[i].programme);
            System.out.println("School: "+A[i].school);
            System.out.println("Proctor: "+A[i].proctName+"\n");
        }
    }
}
