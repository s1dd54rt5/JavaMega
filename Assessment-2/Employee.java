import java.util.Scanner;

public class Employee {
    String empName;
    int empId;
    int salary;
    String date;
    public static void main(String args[]){
        Scanner sh = new Scanner(System.in);
        Employee[] A = new Employee[20];
        System.out.println("Enter the number of employees you want: ");
        int n = sh.nextInt();
        for(int i=0; i<n;i++) {
           A[i] = new Employee();
        }
        for(int i=0; i<n;i++) {
            System.out.println("Enter the name of Employee "+(i+1)+": ");
            sh.nextLine();
            A[i].empName = sh.next();
            System.out.println("Enter the ID of Employee "+(i+1)+": ");
            A[i].empId= sh.nextInt();
            System.out.println("Enter the salary of Employee "+(i+1)+": ");
            A[i].salary = sh.nextInt();
            System.out.println("Enter the date of joining of Employee "+(i+1)+": ");
            sh.nextLine();
            A[i].date = sh.next();
        }
        sh.close();
        System.out.println("Displaying the Data \n");
        for(int i=0; i<n;i++) {
            for(int j=0;j<i;j++) {
                Employee t = new Employee();
                if(A[i].salary<A[j].salary) {
                    t = A[i];
                    A[i] = A[j];
                    A[j] = t;
                }
            }
        }
        for(int i=0; i<n;i++) {
            if(A[i].salary<100000) {
                System.out.print("Emp Name: ");
                System.out.print(A[i].empName+'\n');
                System.out.print("Emp ID: ");
                System.out.print(A[i].empId+'\n');
                System.out.print("\nEmp Salary: ");
                System.out.print(A[i].salary+'\n');
                System.out.print("\nEmp Date of joining: ");
                System.out.print(A[i].date+'\n');
                System.out.print("\n");
            }
        }
    }
}
