import java.util.Scanner;

class Emp {
    int Emp_no;
    String Emp_name;
    double salary;
    double dearness;
    double rent;
    double gross;

    double getDearness(double salary) {
        this.dearness = (3/10)*salary;
        return dearness;
    }

    double getHouseRent(double salary) {
        double rent;
        if(salary>400){
            rent = (35/100)*salary;
        } else {
            rent = (35/100)*salary;
        }
        return rent;
    }

    double getGross(double salary, double dearness, double rent) {
        return salary+dearness+rent;
    }

    Emp(int Emp_no,String Emp_name,double salary){
        this.Emp_name = Emp_name;
        this.Emp_no = Emp_no;
        this.salary = salary;
    }
}

class CatEmp {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter employee details: ");
        System.out.println("Enter name: ");
        String name = sh.nextLine();
        System.out.println("Enter Emp no: ");
        int num = sh.nextInt();
        System.out.println("Enter salary: ");
        double salary = sh.nextFloat();
        sh.close();
        Emp e = new Emp(num, name, salary);
        System.out.println("Emp Name: "+name);
        System.out.println("Emp Num: "+num);
        System.out.println("Salary: "+salary);
        System.out.println("Dearness: "+e.dearness);
        System.out.println("Rent: "+e.rent);
        System.out.println("Gross: "+e.gross);
    }
}
