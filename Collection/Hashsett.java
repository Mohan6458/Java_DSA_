package Collection;

import java.util.HashMap;
import java.util.HashSet;

public class Hashsett {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(1);  // here the duplicate value will not be shown while printing
        hs.add(2);
        hs.add(0);
        System.out.println(hs);
        for(Integer num:hs){    // this for loop is used to iterate in each of the hs values one by one 
            System.out.println(num);
        }
    }
    
}
 