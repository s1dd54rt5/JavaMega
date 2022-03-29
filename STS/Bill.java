package JavaMega.STS;
import java.util.*;

class Item {
    int price;
}

class Customer {
    String name;
    int quantity;
}

public class Bill {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        Item i = new Item();
        Customer c = new Customer();
        c.name = sh.nextLine();
        i.price = sh.nextInt();
        c.quantity = sh.nextInt();
        sh.close();
        System.out.println("Total Price is : "+i.price*c.quantity);
    }
}
