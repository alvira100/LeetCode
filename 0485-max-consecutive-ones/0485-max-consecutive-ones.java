class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int m = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) c = 0;
            else if(nums[i] == 1) {
                c++;
            }
            if(c > m) m = c;
        }
        return m;
    }
}