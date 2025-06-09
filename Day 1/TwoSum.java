Given an array arr[] of positive integers and another integer target. Determine if there exist two distinct indices such that the sum of their elements is equal to the target.

Examples:

Input: arr[] = [1, 4, 45, 6, 10, 8], target = 16
Output: true
Explanation: arr[3] + arr[4] = 6 + 10 = 16.
Input: arr[] = [1, 2, 4, 3, 6], target = 11
Output: false
Explanation: None of the pair makes a sum of 11.
Input: arr[] = [11], target = 11
Output: false
Explanation: No pair is possible as only one element is present in arr[].


  // Code
  class Solution {
    boolean twoSum(int arr[], int target) {
      int left = 0, right = arr.length-1, sum = 0;
      Arrays.sort(arr);
      while(left < right){
        sum = arr[left] + arr[right];
        if(sum == target) 
            return true;
        if(sum < target)
          left++;
        else right --;
      }

      }
}
