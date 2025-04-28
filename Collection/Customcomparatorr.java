package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Customcomparatorr {
    public static void main(String[] args) {
         ArrayList<Integer> aList = new ArrayList<>();
        aList.add(15);
        aList.add(13);
        aList.add(45);

        // i need to sort in decending order so i will use the custom comparator
        Collections.sort(aList,new Comparator<Integer>() {
            @Override
            public int compare(Integer num1,Integer num2){
                if(num1 < num2){
                    return 1;  // here the 1 positive number reverse the number
                }
                else if(num1 > num2){
                    return -1;  // it just keeps the number as it is
                }
                return 0;
            }
        });
        System.out.println(aList);
    }
    
}
