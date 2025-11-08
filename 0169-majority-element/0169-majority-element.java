class Solution {
    public int majorityElement(int[] nums) {

        // for(int i=0;i<nums.length;i++){
        //     int elementcount=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i] == nums[j]){
        //             elementcount++;
        //         }
        //     }
        //     if(elementcount > (nums.length/2)){
        //         return nums[i];
        //     }

        // }

        // return -1;
        


        int ele=-1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count == 0){
                ele = nums[i];
            }

            if(nums[i] == ele){
                count++;
            }
            else{
                count--;
            }

        }

        return ele;
    }
}