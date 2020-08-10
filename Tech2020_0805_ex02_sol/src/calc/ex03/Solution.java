package calc.ex03;

public class Solution {
    public int[][] solution(int[][] s, int[][] k){
    		// array size
		final int N = s.length;
		// kernel size
		final int K = k.length;
		// output
		final int resSize = N-K+1; 
		int[][] res = new int[resSize][resSize];
		
		for(int i = 0 ; i < resSize ; i++) {
			for(int j = 0 ; j < resSize; j++) {
				res[i][j] = conv2d(s, k, i, j);
			}
		}
	
		return res;
	}
	
	public int conv2d(int[][] input, int[][] kernel, int top, int left) {
			int conv = 0;
			for(int i = 0 ; i < kernel.length ; i++ ) {
				for(int j = 0 ; j < kernel.length ; j++) {
					conv += (input[i+top][j+left] * kernel[i][j]); 
				}
			}
			return conv;
	}
}
