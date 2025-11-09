class Solution {
    public int majorityElement(int[] nums) {


        // ----------------------------------------------------

        //           Brute Force

        // ----------------------------------------------------

        int n = nums.length;

        // for(int i=0;i<nums.length;i++){
        //     int count = 0 ;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i] == nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count > n/2){
        //         return nums[i];
        //     }
        // }

        // return -1;

        // ----------------------------------------------------

        //           Optimal

        // ----------------------------------------------------

        int count = 0;
        int element = -1;

        for(int i=0;i<n;i++){
            if(count == 0){
                ++count;
                element = nums[i];
            }
            else if (nums[i] == element){
                count++;
            }
            else{
                count--;
            }
        }

        return element;
        
    }
}