class Solution {

    public static int dpsolution(int n, int[] dp) {
        if (n == 1) return dp[n] = 1;
        if (n == 2) return dp[n] = 2;

        if (dp[n] != -1) return dp[n];

        int left = dpsolution(n - 1, dp);
        int right = dpsolution(n - 2, dp);

        return dp[n] = left + right;
    }

    public static int tabluter(int n){
        if (n == 1) return 1;
        if (n == 2) return 2;
        int prev2 = 1;
        int prev = 2; 
        for(int i=2;i<n;i++){
            int curr = prev2+prev;
            prev2=prev;
            prev=curr;
        }

        return prev;
    }

    public int climbStairs(int n) {
        // int[] dp = new int[n + 1];
        // for (int i = 0; i <= n; i++){ dp[i] = -1 };
        // return dpsolution(n, dp);

        return tabluter(n);
    }
}
