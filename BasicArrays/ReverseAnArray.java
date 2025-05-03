package BasicArrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=5;
        int[] ans= new int[n];

        for(int i=n-1;i>=0;i++){
            ans[n-1-i] = arr[i];
        }
        for(int i=0;i<n-1;i++){
            arr[i]=ans[i];
        }
        System.out.println(arr);
    }
    
}
