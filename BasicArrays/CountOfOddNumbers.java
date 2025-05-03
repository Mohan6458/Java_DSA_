package BasicArrays;

public class CountOfOddNumbers {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=5;
        int sum=0;

        for(int i=0;i<n;i++){
            if(arr[i]%2==1){
                sum=sum+1;
            }
        }
        System.out.println(sum);
    }
}
