class Solution {


    public static int dpsolution(int n,int[] dp){

        if(n == 1){
            dp[n] = 1;
            return 1;
        }
        if(n == 2){
            dp[n] = 2;
            return 2;
        }

        int left,right;
        if(dp[n-1] != -1){
            left = dp[n-1];
        }else{
            left = dpsolution(n-1,dp);
        }

        if(dp[n-2] != -1){
            right = dp[n-2];
        }else{
            right = dpsolution(n-2,dp);
        }

        dp[n] = left + right;
        return dp[n];

    }






    public int climbStairs(int n) {
        // if(n == 1){return 1;}
        // if(n == 2){return 2;}
        // int left = climbStairs(n-1);
        // int right = climbStairs(n-2);

        // return left+right;

        int dp[] = new int[n+1];

        for(int i=0;i<dp.length;i++){
            dp[i] = -1;
        }
        int dpresult = dpsolution(n,dp);

        return dpresult;

    }
}