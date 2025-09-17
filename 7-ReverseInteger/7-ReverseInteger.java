// Last updated: 9/17/2025, 9:29:03 PM
class Solution {
    public int reverse(int x) {

        int rn=0;
        while(x!=0){

            int lastdigit = x%10;
            if (rn > Integer.MAX_VALUE / 10 || rn < Integer.MIN_VALUE / 10) {
                return 0; // Overflow case
            }

            rn = (rn*10)+lastdigit;
            x = x/10;

        }

        return rn;
        
    }
}