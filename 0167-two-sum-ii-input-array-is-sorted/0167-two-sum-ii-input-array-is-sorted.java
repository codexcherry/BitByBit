class Solution {
    public int[] twoSum(int[] nums, int tr) {

        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         int sum = nums[i] + nums[j];
        //         if(sum == tr){
        //             return new int[]{i+1,j+1};
        //         }
        //     }
        // }

        // return new int[]{};


        int low=0;
        int high = nums.length-1;

        while(low<high){
            int sum = nums[low] + nums[high];
            if(sum==tr){
                return new int[]{low+1,high+1};
            }
            else if(sum > tr){
                high--;
            }
            else{
                low++;
            }
        }
        return new int[]{};
    }
}