// A Program to solve the First Question of LEETCODE i.e TWOSUM

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans = new int[]{i,j};
                }
            }
        }
        return  ans;
        
    }
}