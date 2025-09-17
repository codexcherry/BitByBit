// Last updated: 9/17/2025, 9:28:33 PM
import java.util.*;

class Solution {
    public int findDuplicate(int[] arr) {
        Set<Integer> find = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(find.contains(arr[i])){
                return arr[i];
            }
            find.add(arr[i]);
        }
        
        return 0;
    }
    
}