// Last updated: 9/17/2025, 9:28:46 PM
class Solution {
    public int maxProfit(int[] prices) {

        int min = prices[0];
        int max = 0;
        for (int pr : prices) {
            min = Math.min(min, pr);
            max = Math.max(max, pr - min);
        }
        return max;

    }
}