package JavaMega.STS;
import java.util.*; 

public class SortHashMapByKeys {  
public static void main(String args[]){  
    HashMap<Integer, String> hm=new HashMap<Integer, String>();  
    Scanner sh = new Scanner(System.in);
    int n = sh.nextInt();
    for(int i=0;i<n;i++){
        int key = sh.nextInt();
        String val = sh.next();
        hm.put(key, val);
    }
    sh.close();
    System.out.println("After Sorting:");  
    TreeMap<Integer,String> tm=new  TreeMap<Integer,String> (hm);  
    Iterator itr=tm.keySet().iterator();               
    while(itr.hasNext()) {    
        int key=(int)itr.next();  
        System.out.println(key+": "+hm.get(key));  
    }    
}  
}  