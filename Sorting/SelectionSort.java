package Sorting;

public class SelectionSort {
    public int[] selectionSort(int[] nums) {
        // Loop through unsorted part of the array (0 to n-2)
        for (int i = 0; i < nums.length - 1; i++) {
          /*Assume current element 
          is the minimum*/
          int minIndex = i;
    
          // Find actual minimum in unsorted part (i+1 to n-1)
          for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] < nums[minIndex]) {
              minIndex = j;
            }
          }
    
          // Swap only if minIndex changed
          if (minIndex != i) {
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
          }
        }
    
        return nums;
      }
    }
    class Main {
        public static void main(String[] args) {
            int[] nums = {7, 5, 9, 2, 8};
    
            System.out.print("Original array: ");
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
    
            // Create an instance of SelectionSort class
            SelectionSort solution = new SelectionSort();
    
            // Sort the array
            int[] sortedArr = solution.selectionSort(nums);
    
            System.out.print("Sorted array: ");
            for (int num : sortedArr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    