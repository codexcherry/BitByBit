// Last updated: 9/17/2025, 9:28:36 PM
import java.util.*;

class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum = (n*(n+1))/2;
        int arraysum=0;
        for(int i=0;i<n;i++){
            arraysum = arraysum + nums[i];
        }

        return sum - arraysum;
    }
}
