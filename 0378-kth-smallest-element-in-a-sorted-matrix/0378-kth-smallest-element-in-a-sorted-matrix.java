import java.util.*;
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int ans[]=new int[n*n];
        int idx=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                ans[idx]=matrix[i][j];
                idx++;
            }
        }
       
        Arrays.sort(ans);

        return ans[k-1];
        
    }
}