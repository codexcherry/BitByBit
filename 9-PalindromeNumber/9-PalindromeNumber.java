// Last updated: 9/17/2025, 9:29:01 PM
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int org = x;
        int reverse=0;
        while(x>0){
            reverse = (reverse*10)+(x%10);
            x=x/10;
        }
        if(org == reverse){
            return true;
        }
        return false;
    }
}