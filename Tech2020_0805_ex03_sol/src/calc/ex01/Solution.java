package calc.ex01;

public class Solution {
    public int[][] solution(int[][] s){
    		int n = s.length;
    		int m = s[0].length;
    		int[][] res = new int[n+1][m+1];
    		
    		// row sum
    		for(int i = 0 ; i < n ; i++) {
    			int sum = 0;
    			for(int j = 0 ; j < m ; j++) {
    				res[i][j] = s[i][j];
    				sum += s[i][j];
    			}
    			res[i][m] = sum;
    		}
    		
    		// column sum
    		for(int j = 0 ; j < m+1 ; j++) {
    			int sum = 0;
    			for(int i = 0 ; i < n ; i++) {
    				sum += res[i][j];
    			}
    			res[n][j] = sum;
    		}
    		
        return res;
    }
}
