package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorlist {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(23);
        al.add(56);
        al.add(67);


        Iterator<Integer> iterator = al.iterator();
        while(iterator.hasNext()){
            Integer num = iterator.next();
            System.out.println(num);
        }
    }
    
}
