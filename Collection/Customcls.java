package Collection;

class Data2{
    public int num;
    public String name;

    Data2(int _num,String _name){
        this.name=_name;
        this.num=_num;
    }
}
public class Customcls {
    public static void main(String[] args) {
        Data2 dataObj1= new Data2(6,"mohan");
        Data2 dataObj2= new Data2(7,"krishnan");
        dataObj1.name="mohaaan";
        System.out.println(dataObj2.name);



    }
    
}

/*
 * lass Data{
    private int num;
    private String name;

    Data(int _num,String _name){
        this.name=_name;
        this.num=_num;
    }
    public void setNum(int _num){
        this.num=_num;
    }
    public void setName(String _name){
        this.name=_name;
    }
    public int getNum(){
        return num;
    }
    public String getName(){
        return name;
    }
}
public class Customcls {
    public static void main(String[] args) {
        Data dataObj1= new Data(6,"mohan");
        Data dataObj2= new Data(7,"krishnan");
        dataObj1.setName("mohaaan");
        System.out.println(dataObj2.getName());



    }
    
}

 */