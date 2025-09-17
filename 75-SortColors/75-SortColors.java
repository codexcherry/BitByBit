// Last updated: 9/17/2025, 9:28:53 PM
import java.util.*;

class Solution {

    public void swap(int nums[],int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b]=temp;
    }

    public void sortColors(int[] nums) {

        // //bruteforce
        // Arrays.sort(nums);


        // // //bettter
        // int c0=0,c1=0,c2=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i] == 0) {c0++;}
        //     else if(nums[i] == 1) {c1++;}
        //     else{c2++;}
        // }

        // for(int i=0;i<nums.length;i++){
        //     if(c0>0){
        //         nums[i] = 0;
        //         c0--;
        //     }
        //     else if(c1>0){
        //         nums[i] =1;
        //         c1--;
        //     }
        //     else{
        //         nums[i] = 2;
        //         c2--;
        //     }
        // }



        // optimal
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid] == 0){
                swap(nums,mid,low);
                mid++;
                low++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }

        


    }
}