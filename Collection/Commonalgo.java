package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Commonalgo {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(15);
        aList.add(13);
        aList.add(45);
        Collections.sort(aList);
        System.out.println(aList);
        System.out.println(Collections.max(aList));
    
}
}