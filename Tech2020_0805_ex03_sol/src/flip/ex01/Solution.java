package flip.ex01;

public class Solution {
    public int[][] solution(int[][] s){
    		int n = s.length;
    		int[][] res = new int[n][n];
    		for(int i = 0 ; i < n ; i++) {
    			for(int j = 0 ; j < n ; j++) {
    				res[i][j] = s[n-1-i][j];
    			}
    		}
        return res;
    }
}
