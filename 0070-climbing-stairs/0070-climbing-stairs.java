class Solution {

    public static int dpsolution(int n, int[] dp) {
        if (n == 1) return dp[n] = 1;
        if (n == 2) return dp[n] = 2;

        if (dp[n] != -1) return dp[n];

        int left = dpsolution(n - 1, dp);
        int right = dpsolution(n - 2, dp);

        return dp[n] = left + right;
    }

    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) dp[i] = -1;
        return dpsolution(n, dp);
    }
}
