import java.io.*;
import java.util.*;

public class Vaccine implements Serializable{
    String empId, name, age, address, number, blood, allergy, dov;
    public static void main(String[] args) throws Exception {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of faculty:");
        String num = s.nextLine();
        n = Integer.parseInt(num);
        Vaccine[] vaccines = new Vaccine[n];
        try {
            FileOutputStream fos = new FileOutputStream("Vaccine.txt");
	    	ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(int i=0;i<n;i++){
                Vaccine vac = new Vaccine();
                System.out.println("\nEnter the EmpID of Teacher "+(i+1)+":");
                vac.empId = s.nextLine();
                System.out.println("Enter the name of Teacher "+(i+1)+":");
                vac.name = s.nextLine();
                System.out.println("Enter the Addr of Teacher "+(i+1)+":");
                vac.address = s.nextLine();
                System.out.println("Enter the Age of Teacher "+(i+1)+":");
                vac.age = s.nextLine();
                System.out.println("Enter the number of Teacher "+(i+1)+":");
                vac.number = s.nextLine();
                System.out.println("Enter the blood group of Teacher "+(i+1)+":");
                vac.blood = s.nextLine();
                System.out.println("Does the teacher have allergies?(yes/no):");
                vac.allergy = s.nextLine();
                System.out.println("Enter the Date of Vaccination of Teacher "+(i+1)+":");
                vac.dov = s.nextLine();
                vaccines[i]=vac;
            }
            oos.writeObject(vaccines);
            System.out.println("Data entered");
            oos.close();
	    	fos.close();
        } catch (Exception e){
            System.out.println(e);
        }
        s.close();
        try {
            FileInputStream fileIn = new FileInputStream("./Vaccine.txt");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Object obj = objectIn.readObject();
            Vaccine[] vacs = new Vaccine[n];
            vacs = (Vaccine[]) obj;
            for(Vaccine vac : vacs){
                if(vac.allergy.equals("yes")){
                    System.out.println("EMP ID: "+vac.empId);
                    System.out.println("Name: "+vac.name);
                    System.out.println("Age: "+vac.age);
                    System.out.println("Address: "+vac.address);
                    System.out.println("Number: "+vac.number);
                    System.out.println("Blood group: "+vac.blood);
                    System.out.println("Allergy: "+vac.allergy);
                    System.out.println("Date of vaccination: "+vac.dov);
                    System.out.println("\n");
                }
            }
            objectIn.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
