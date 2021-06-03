import java.util.*;
import java.io.*;

public class Student implements Serializable{
    String regNo,name,proctorName;
    int cgpa;
    public static void main(String[] args) throws Exception {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        String num = s.nextLine();
        n = Integer.parseInt(num);
        Student[]  students = new Student[n];
        try {
            FileOutputStream fos = new FileOutputStream("Student.txt");
	    	ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(int i=0;i<n;i++){
                Student stu = new Student();
                System.out.println("\nEnter the name of Student "+(i+1)+":");
                stu.name = s.nextLine();
                System.out.println("Enter the RegNo of Student "+(i+1)+":");
                stu.regNo = s.nextLine();
                System.out.println("Enter the Proctor of Student "+(i+1)+":");
                stu.proctorName = s.nextLine();
                System.out.println("Enter the CGPA of Student "+(i+1)+":");
                String cgpaString = s.nextLine();
                stu.cgpa = Integer.parseInt(cgpaString);
                students[i]=stu;
            }
            oos.writeObject(students);
            System.out.println("Data entered");
            oos.close();
	    	fos.close();
        } catch (Exception e){
            System.out.println(e);
        }
        s.close();
        try {
            FileInputStream fileIn = new FileInputStream("./Student.txt");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Object obj = objectIn.readObject();
            Student[] stds = new Student[n];
            stds = (Student[]) obj;
            for(Student student : stds){
                String grade;
                if(student.cgpa>90){
                    grade = "A";
                } else if (student.cgpa>70&&student.cgpa<=90){
                    grade = "B";
                } else if (student.cgpa>50&&student.cgpa<=70){
                    grade = "C";
                } else {
                    grade = "D";
                }
                System.out.println("Student "+student.name+" has achieved "+grade+" grade.");
            }
            System.out.println(stds.length);
            objectIn.close();
        } catch(Exception e){
            throw e;
        }
    }
}