import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        // Set<List<Integer>> set = new HashSet<>();
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         for(int k=j+1;k<n;k++){
        //             if(nums[i] + nums[k] + nums[j] == 0){
        //                 List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
        //                 temp.sort(null);
        //                 set.add(temp);
        //             }
        //         }
        //     }
        // }

        // List<List<Integer>> ans = new ArrayList<>(set);
        // return ans;


        Arrays.sort(nums);
        List<List<Integer>> mapp = new ArrayList<>();
        for(int i=0;i<nums.length;i++){

            if(i>0 && nums[i] == nums[i-1]){continue;}
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    mapp.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    right--;
                    left++;

                    while(left<right && nums[left] == nums[left-1]){ left++; };

                    while(left<right && nums[right] == nums[right+1]){ right--; };

                    
                }
                else if(sum>0){
                    right--;
                }
                else{
                    left++;
                }
            }

        }

        return mapp;

      

    }
}