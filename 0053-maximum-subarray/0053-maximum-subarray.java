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

        int maxsum = nums[0]; // = -2
int currsum = 0;

for (int i = 0; i < nums.length; i++) {
    currsum += nums[i];
     maxsum = Math.max(maxsum, currsum);
    if (currsum < 0) {
        currsum = 0;
    }
       
}
return maxsum;
    }
}