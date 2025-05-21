import java.util.Scanner;

public class BasicShoppingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] item = {"notebook","pen","pencil"};
        double[] price = {10.0,20.0,30.0};
        


        System.out.println("Enter the Item: ");
        String InputItem=scanner.next();
        System.out.println("Enter Quantity: ");
        int Quantity=scanner.nextInt();

        for(int i=0;i<item.length;i++){
            if(item[i].equalsIgnoreCase(InputItem)){
                System.out.println("Item " + InputItem);
                System.out.println("Quantity " + Quantity);
                System.out.println("total price : " + price[i]*Quantity);
            }
        }
        
    }
    
}
