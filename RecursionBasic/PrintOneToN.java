package RecursionBasic;

public class PrintOneToN {

    public void PrintOneToN(int i,int N){
        if(i>N){
            return;
        }
        PrintOneToN(i+1,N);
        System.out.println(i);
        

    }

    public static void main(String[] args) {
        PrintOneToN solution = new PrintOneToN();
        int N = 5; // Example input
        int i=1;
        solution.PrintOneToN(i,N);
    }
}
