package HashingBasics;
import java.util.*;

class Solution {
    public int mostFrequentElement(int[] nums) {
     int maxfrq=0;
     int maxele =0;

     Map<Integer,Integer> mpp = new HashMap<>();

     for(int i=0;i<nums.length;i++){
        mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
     }

     for(Map.Entry<Integer,Integer> entry: mpp.entrySet()){
        int ele = entry.getKey();
        int freq = entry.getValue();

        if(freq>maxfrq){
            maxfrq = freq;
            maxele = ele;
        }
        else if(maxfrq==freq){
            maxele = Math.min(maxele,ele);
        }
     }
     return maxele;

    }
}

public class HighestOccuring {
    public static void main(String[] args) {
        int[] nums = {4,4,5,5,6};
        Solution sol = new Solution();

        int ans= sol.mostFrequentElement(nums);

        System.out.println(ans);
    }
    
}
