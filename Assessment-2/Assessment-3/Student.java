import java.util.Scanner;

abstract class StudentDetails {
    String name;
    String status;
    String telephone;
    public abstract void showDetails();
}

class FullTimeStudent extends StudentDetails {
    public void showDetails(){
        System.out.println("Name: "+super.name+"\n");
        System.out.println("Telephone: "+super.telephone+"\n");
        System.out.println("Status: "+super.status+"\n");
        System.out.println("Fees: 2000");
    }
}

class HalfTimeStudent extends StudentDetails {
    public void showDetails(){
        System.out.println("Name: "+super.name+"\n");
        System.out.println("Telephone: "+super.telephone+"\n");
        System.out.println("Status: "+super.status+"\n");
        System.out.println("Fees: 200/hour");
    }
}

class Student {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sh.nextLine();
        System.out.println("Enter telephone: ");
        String telephone = sh.nextLine();
        System.out.println("Enter status: ");
        String status = sh.nextLine();
        sh.close();
        if(status.equals("half")){
            HalfTimeStudent h = new HalfTimeStudent();
            h.name = name;
            h.telephone = telephone;
            h.status = status;
            h.showDetails();
        } else {
            FullTimeStudent f = new FullTimeStudent();
            f.name = name;
            f.telephone = telephone;
            f.status = status;
            f.showDetails();
        }
    }
}

