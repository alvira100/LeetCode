class Solution {
    public int numIdenticalPairs(int[] nums) {
        /*int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;*/

        int count = 0;
        int[] f =new int[101];
        for(int x : nums) {
            count += f[x];
            f[x]++;
        }
        return count;
    }
}