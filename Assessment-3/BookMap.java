import java.util.*;  

class BookMap{
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        map.put("B1", 100);
        map.put("B2", 200);
        map.put("B3", 300);
        map.put("B4", 400);
        map.put("B5", 500);
        System.out.println("Initial Map:"); 
        for(Map.Entry<String,Integer> m : map.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());    
        }
        map.remove("B3");
        System.out.println("Removing B3:"); 
        for(Map.Entry<String,Integer> m : map.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());    
        }
        map.replace("B4", 800);
        System.out.println("Update B4:"); 
        for(Map.Entry<String,Integer> m : map.entrySet()){    
            System.out.println(m.getKey()+" "+m.getValue());    
        }
    }
}