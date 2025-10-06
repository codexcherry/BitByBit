// class fibbo{

    public static int dpfibbo(int dp[],int n){
        if(n<=1){
            return n;
        }

        if(dp[n] != -1 ){
            return dp[n];
        }

        int result = dpfibbo(dp, n-1)+dpfibbo(dp, n-2);
        return result;
    }

//     public static void main(String args[]){
//         int number = 25;
//         int dp[] = new int[number+1];
//         for(int i=0;i<dp.length;i++){
//             dp[i] = -1;
//         }
//        System.out.println(dpfibbo(dp,number));
//     }
// }
