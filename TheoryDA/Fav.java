package TheoryDA;

import java.util.*; import java.io.*;
class Student3 implements Serializable { String name, id;
Student3(String n, String i) { name = n;
id = i; }
}
public class Fav {
public static void main(String[] args) throws FileNotFoundException, IOException {

Scanner sc = new Scanner(System.in);
String name = sc.nextLine();
String reg = sc.nextLine(), cgpa = sc.nextLine(), ph = sc.nextLine(); Student3 s1 = new Student3(name, reg);
try {
FileWriter fw = new FileWriter("student2.txt");
fw.write("Reg: " + reg + "\nName: " + name + "\nPhone: " + ph + "\nCGPA: " + cgpa + "");
fw.close();
} catch (Exception e) {
    e.printStackTrace();
}
try {
FileReader fw_r = new FileReader("student2.txt");
int i;
while ((i = fw_r.read()) != -1) System.out.print((char) i); fw_r.close();
} catch (Exception e) {
e.printStackTrace();
        }
System.out.println(); try {
FileOutputStream fw1 = new FileOutputStream("student1.txt"); ObjectOutputStream ob = new ObjectOutputStream(fw1); ob.writeObject(s1);
ob.flush();
ob.close();
FileInputStream fw2 = new FileInputStream("student1.txt"); ObjectInputStream ob1 = new ObjectInputStream(fw2); Student3 s2 = (Student3) ob1.readObject(); System.out.println(s2.name + " " + s2.id);
} catch (Exception e) { e.printStackTrace();
} }
}