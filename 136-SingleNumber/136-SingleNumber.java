// Last updated: 9/17/2025, 9:28:44 PM
 class Solution {
    public int singleNumber(int[] nums) {
        //  for(int i=0;i<nums.length;i++){
        //     int count=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i] == nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count == 1){
        //         return nums[i];
        //     }

        //  }

        //  return -1;

        int xor =0;
        for(int i=0;i<nums.length;i++){
            xor = xor ^ nums[i];
        }
        return xor;


    }
}