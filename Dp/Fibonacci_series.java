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




 public static void tablufibbo(int n){
        int prev2=0,prev=1;
        for(int i=2;i<n+1;i++){
            int curr = prev2+prev;
            prev2 = prev;
            prev = curr;
        }
        System.out.println(prev);
    }





public static int dpfibbo(ArrayList<Integer> dp,int n){
        if(n<=1){
            return n;
        }

        if(dp.get(n) != -1 ){
            return dp.get(n);
        }

        int result = dpfibbo(dp, n-1) + dpfibbo(dp, n-2);
        dp.set(n, result);
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


