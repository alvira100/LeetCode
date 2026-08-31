class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int idx = n - 1;
        int[] result = new int[n];
        while(l <= r) {
            int lSquare = nums[l] * nums[l];
            int rSquare = nums[r] * nums[r];
            if(lSquare > rSquare) {
                result[idx] = lSquare;
                l++;
            }
            else {
            result[idx] = rSquare;
            r--;
        }
        idx--;
    }
      return result;  
    }
    
}