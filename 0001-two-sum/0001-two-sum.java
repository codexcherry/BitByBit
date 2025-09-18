import java.util.*;


class Solution {
    public int[] twoSum(int[] nums, int target) {
        

        // Using hashmap 
        Map<Integer,Integer> mapp = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int remaning = target - nums[i];
            if(mapp.containsKey(remaning)){
                return new int[]{mapp.get(remaning),i};
            }
            mapp.put(nums[i],i);
        }

        return new int[]{};
    }
}