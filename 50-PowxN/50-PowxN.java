// Last updated: 9/17/2025, 9:28:57 PM
class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long binaryform = n; 
        if (n < 0) {
            binaryform = -binaryform; // make it positive
            x = 1 / x; // reciprocal for negative exponent
        }

        while(binaryform>0){
            if(binaryform % 2 == 1){
                ans = ans * x;
            }
            x = x * x;
            binaryform /= 2;
        }

        return ans;
    }
}
