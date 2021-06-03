package TheoryDA;
import java.io.*; import java.util.*;
class Student1 implements Serializable { String Name;
String RegNo; Float CGPA;
int PrefRoom; int Allocateroom; Student1() {
}
Student1(String RegNo, String Name, float CGPA, int PrefRoom) {
this.RegNo = RegNo; this.Name = Name; this.CGPA = CGPA; this.PrefRoom = PrefRoom;
} }
class room implements Serializable { int roomno;
int size;
int allotedno; room() {
size = 2; }
room(int roomno, int size) { this.roomno = roomno; this.size = size; this.allotedno = 0;
} }
class hostel implements Serializable { String BlockName;
room r[] = new room[2];
static int booking;
 hostel(String blockName, int n) { this.BlockName = BlockName; for (int i = 0; i < n; i++) {
r[i] = new room(); }
r[0] = new room(101, 2);
r[1] = new room(102, 2); }
synchronized int book(Student1[] sortedcgpa) throws InterruptedException { for (Student1 sortedcgpa1 : sortedcgpa) {
if (sortedcgpa1.Allocateroom == 0) { for (room r1 : r) {
if ((sortedcgpa1.PrefRoom == r1.roomno) && (r1.allotedno < r1.size)) { sortedcgpa1.Allocateroom = sortedcgpa1.PrefRoom;
r1.allotedno = r1.allotedno + 1;
booking = booking + 1;
if (booking == 1) { wait();
}
if (booking > 1 && booking < sortedcgpa.length - 2) {
                            notifyAll();
wait(); }
System.out.println(" ");
for (Student1 o1 : sortedcgpa) {
System.out.println(o1.RegNo + " " + o1.Name + " " + o1.CGPA + "\n Allocated Room: " + o1.Allocateroom );
} }
}
if (booking == sortedcgpa.length - 1) {
return 1; }
return 0; }
}
return 0; }
}

 class Warden extends Thread { hostel b1;
Student1[] sortedcgpa = new Student1[5]; Warden(hostel b1, Student1[] sortedcgpa) {
this.b1 = b1;
this.sortedcgpa = sortedcgpa; }
public void run() { int b = 0;
try {
b = b1.book(sortedcgpa); if (b == 1) {
                interrupt();
            }
} catch (Exception ex) { System.out.println("Intterupted" + ex);
} }
}
public class HostelQuestion {
public static void main(String[] args) throws FileNotFoundException, IOException,
            ClassNotFoundException
{
List<Student1> sList = new ArrayList<Student1>(); Scanner sc=new Scanner(System.in);
int n=2;
for(int i=0;i<n;i++)
{
System.out.println("For Student "+(i+1)+":");
sList.add(new Student1(sc.next(),sc.next(),sc.nextFloat(),sc.nextInt())); }
FileOutputStream Fout = new FileOutputStream("file1.txt"); ObjectOutputStream out = new ObjectOutputStream(Fout); out.writeObject(sList);
out.close();
FileInputStream fin = new FileInputStream("file1.txt");

ObjectInputStream in = new ObjectInputStream(fin); ArrayList<Student1> nList = new ArrayList<Student1>(); while (fin.available() != 0)
{
            nList = (ArrayList<Student1>) in.readObject();
        }
        nList.sort((o1, o2) ->
        {
return (int) (o1.CGPA - o2.CGPA); });
Collections.reverse(nList);
nList.forEach(o -> System.out.println(o.RegNo + " " + o.Name + " " + o.CGPA + " " + "" +
o.Allocateroom + " " + o.PrefRoom)); in.close();
Student1[] sortedcgpa = nList.toArray(new Student1[nList.size()]); hostel b1 = new hostel("Block1", 2);
Warden w1 = new Warden(b1, sortedcgpa);
Warden w2 = new Warden(b1, sortedcgpa);
w1.start();
        w2.start();
    }
}