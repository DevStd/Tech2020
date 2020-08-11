package calc.ex02;

public class Solution {
    public int[][] solution(int[][] s){
    		// array size
    		final int N = s.length;
    		// kernel size
    		final int K = 2;
    		// output
    		final int resSize = N-K+1; 
    		int[][] res = new int[resSize][resSize];
    		
    		for(int i = 0 ; i < resSize ; i++) {
    			for(int j = 0 ; j < resSize; j++) {
    				res[i][j] = maxPool(s, i, j, i+K, j+K);
    			}
    		}
    	
        return res;
    }
    
    public int maxPool(int[][] input, int top, int left, int bottom, int right) {
    		int max = Integer.MIN_VALUE;
    		for(int i = top ; i < bottom ; i++ ) {
    			for(int j = left ; j < right ; j++) {
    				if(max < input[i][j] ) max = input[i][j];
    			}
    		}
    		return max;
    }
}
