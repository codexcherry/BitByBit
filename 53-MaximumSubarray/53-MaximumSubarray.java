// Last updated: 9/17/2025, 9:28:56 PM
class Solution {
    public int maxSubArray(int[] nums) {

        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum += nums[j];
        //         max = Math.max(max,sum);
        //     }
            
        // }
        // return max;

        int sum=0;
        int maxsum = nums[0];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            maxsum = Math.max(maxsum,sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxsum;
    }
}