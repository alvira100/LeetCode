class Solution {
    /* public int getMinDistance(int[] nums, int target, int start) {
    
    int minD = Integer.MAX_VALUE;
    for(int i = 0; i < nums.length; i++) {
    if(nums[i] == target) {
          int currD = Math.abs(i - start);
          minD = Math.min(currD, minD);
          }
       }    
    return minD;
    } */
    public int getMinDistance(int[] nums, int target, int start) {

        int distance = 0;
        while(true) {
            if(start - distance >= 0 && nums[start - distance] == target) {
                return distance;
            }
            if(start + distance < nums.length && nums[start + distance] == target) {
                return distance;
            }
            distance++;
        }
    }
}