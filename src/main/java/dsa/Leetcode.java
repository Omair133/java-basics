package dsa;
import java.util.*;
public class Leetcode {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q = new LinkedList<>();
        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
        int m=mat.length;
        int n=mat[0].length;
        int[][] result = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    result[i][j]=0;
                    q.add(new int[]{i,j});
                }
            }
        }
        while(!q.isEmpty()){
            int[] temp = q.poll();
            int i=temp[0];
            int j=temp[1];
            for(int[] dir:directions){
                int new_i=i+dir[0];
                int new_j=i+dir[1];
                if(new_i >= 0 && new_i < m && new_j >=0 && new_j < n){
                    result[new_i][new_j] = result[i][j]+1;
                    q.add(new int[]{new_i, new_j});
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Leetcode ob = new Leetcode();
        int[][] matrix = {
                {0,1,1},{1,1,1},{1,1,1}
        };
        int[][] result = ob.updateMatrix(matrix);
        System.out.println(Arrays.deepToString(result));
    }
}
