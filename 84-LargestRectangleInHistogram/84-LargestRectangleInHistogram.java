// Last updated: 9/17/2025, 9:28:50 PM
import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i <= heights.length; i++) {
            int height = i == heights.length ? 0 : heights[i];
            while (!stack.isEmpty() && height < heights[stack.peek()]) {
                int ht = heights[stack.pop()];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, ht * w);
            }
            stack.push(i);
        }

        return maxArea;
    }
}
