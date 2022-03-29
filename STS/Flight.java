package JavaMega.STS;
import java.util.Scanner;

public class Flight {
    boolean married;
    int age;
    String gender;
    Flight[] passengers;
    Flight(int n){
        this.passengers = new Flight[n];
    }

    class Input implements Runnable {
        @Override
        public void run() {
            int n;
            System.out.println("Enter number of passangers: ");
            Scanner s = new Scanner(System.in);
            n = s.nextInt();
            Flight f = new Flight(n);
            for(int i =0;i<n;i++){
                f.passengers[i].age = s.nextInt();
                f.passengers[i].gender = s.nextLine();
                f.passengers[i].married = s.nextBoolean();
            }
            s.close();
        }
    }

    class Output implements Runnable {
        @Override
        public void run() {
            for(int i = 0;i<passengers.length;i++){
                if(passengers[i].married==true){
                    if((passengers[i].gender == "male"&&passengers[i].age >60)||(passengers[i].gender == "female"&&passengers[i].age >55)){
                        System.out.println("Passenger "+(i+1)+" gets 15% discount!");
                    } else if ((passengers[i].gender == "male"&&passengers[i].age >55)||(passengers[i].gender == "female"&&passengers[i].age >40)){
                        System.out.println("Passenger "+(i+1)+" gets 10% discount!");
                    }
                } else if (passengers[i].age>60){
                    System.out.println("Passenger "+(i+1)+" gets 5% discount!");
                } else {
                    System.out.println("Passenger "+(i+1)+" gets no discount!");
                }
            }
        }
    }

    void runThreads(){
        Input t = new Input();
        Output m = new Output();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(m);
        t1.start();
        t2.start();
    }
    public static void main(String[] args) {
        Flight f = new Flight(1);
        f.runThreads();
    }
}
