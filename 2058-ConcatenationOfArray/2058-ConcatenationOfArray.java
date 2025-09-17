// Last updated: 9/17/2025, 9:28:14 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int[nums.length*2];
            for (int j=0;j<nums.length;j++){
                ans[j] = nums[j];
                ans[j+nums.length] = nums[j];
            }
        return ans;
        
    }
}