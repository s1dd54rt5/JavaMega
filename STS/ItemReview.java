package JavaMega.STS;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class ItemReview implements Serializable{
    int id;
    String description;
    public static void main(String[] args) {
        int n;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of items:");
        String num = s.nextLine();
        n = Integer.parseInt(num);
        ItemReview[]  items = new ItemReview[n];
        for(int i =0;i<n;i++){
            boolean flag = false;
            ItemReview item = new ItemReview();
            item.id = s.nextInt();
            item.description = s.nextLine();
            for(int j=0;j<items.length;j++){
                if(items[j].id == item.id){
                    flag = true;
                    System.out.println("ID Cannot be same!");
                    break;
                }
            }
            if(!flag){
                items[i] = item;
            }
        }
        try {
            FileOutputStream fos = new FileOutputStream("Items.txt");
	    	ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(items);
            System.out.println("Data entered to file!");
            oos.close();
	    	fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
