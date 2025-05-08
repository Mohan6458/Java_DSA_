package RecursionBasic;

public class PrintOneToN {

    public void PrintOneToN(int N){
        if(N==0){
            return;
        }
        
        System.out.println(N);
        PrintOneToN(N-1);

    }

    public static void main(String[] args) {
        PrintOneToN solution = new PrintOneToN();
        int N = 10; // Example input
        solution.PrintOneToN(N);
    }
}
