// Last updated: 9/17/2025, 9:28:52 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
        
    }
}