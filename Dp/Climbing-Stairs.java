class Solution {
    public int climbStairs(int n) {
        if(n == 1){return 1;}
        if(n == 2){return 2;}
        int left = climbStairs(n-1);
        int right = climbStairs(n-2);

        return left+right;
    }
}
