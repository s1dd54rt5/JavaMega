import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ReverseArray {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();

        list.add("one");
        list.add(2);
        list.add(3.1415);

        Iterator<Object> iterator = list.iterator();
        
        while(iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println(element.toString());
        }

        List<Object> reverseList = reverseArray(list);

        Iterator<Object> reverseIterator = reverseList.iterator();
        
        while(reverseIterator.hasNext()) {
            Object element = reverseIterator.next();
            System.out.println(element.toString());
        }
        
        
    }
    static List<Object> reverseArray(List<Object> list){
        List<Object> rev = new ArrayList<Object>();
        for (int i = list.size() - 1; i >= 0; i--) {
            rev.add(list.get(i));
        }
        return rev;
    }
}