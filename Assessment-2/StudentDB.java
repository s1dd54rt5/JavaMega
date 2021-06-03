import java.util.Scanner;

class Student {
    String regNo;
    String name;
}

class Exam extends Student {
    int sub1,sub2,sub3,sub4,sub5,sub6;
}

class Result extends Exam {
    int total_marks;
    void add(int sub1,int sub2,int sub3,int sub4,int sub5,int sub6){
        this.total_marks = sub1+sub2+sub3+sub4+sub5+sub6;
    }
}

class StudentDB {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        Result r = new Result();
        System.out.println("Enter student details: ");
        System.out.print("Name: ");
        r.name = sh.next();
        System.out.print("\n");
        System.out.print("Reg No: ");
        r.regNo = sh.next();
        System.out.print("\n");
        System.out.print("Sub1 : ");
        r.sub1 = sh.nextInt();
        System.out.print("\n");
        System.out.print("Sub2 : ");
        r.sub2 = sh.nextInt();
        System.out.print("\n");
        System.out.print("Sub3 : ");
        r.sub3 = sh.nextInt();
        System.out.print("\n");
        System.out.print("Sub4 : ");
        r.sub4 = sh.nextInt();
        System.out.print("\n");
        System.out.print("Sub5 : ");
        r.sub5 = sh.nextInt();
        System.out.print("\n");
        System.out.print("Sub6 : ");
        r.sub6 = sh.nextInt();
        System.out.print("\n");
        sh.close();
        System.out.print("Total Marks : ");
        r.add(r.sub1, r.sub2, r.sub3, r.sub4, r.sub5, r.sub6);
        System.out.print(r.total_marks);
    }
}