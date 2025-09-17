// Last updated: 9/17/2025, 9:28:34 PM
import java.util.*;

class Solution {
    public void moveZeroes(int[] nums) {

        int j=0;

        // int j=-1;
        int n=nums.length;
        // for(int i=0;i<n;i++){
        //     if(nums[i] == 0){
        //         j=i;
        //         break;
        //     }
        // }

        // if (j == -1) return;

        for(int i=0;i<n;i++){
            if(nums[i] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        
        
    }
}