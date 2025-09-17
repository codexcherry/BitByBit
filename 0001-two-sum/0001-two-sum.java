import java.util.*;


class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> mapp = new HashMap<>();
      
        for(int i=0;i<nums.length;i++){
            int comp = target - nums[i];
            if(mapp.containsKey(comp)){
                return new int[]{mapp.get(comp),i};
            }
            mapp.put(nums[i],i);
        }

        return new int[]{};


    }
}