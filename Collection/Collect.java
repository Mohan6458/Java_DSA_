package Collection;

import java.util.*;

class Data1{
    public int num;
    public String name;

    Data1(int _num,String _name){
        this.name=_name;
        this.num=_num;
    }
}

public class Collect {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(15);
        aList.add(13);
        aList.add(45);
        System.out.println(aList);
        System.out.println(aList.get(2));
    
    }

}
