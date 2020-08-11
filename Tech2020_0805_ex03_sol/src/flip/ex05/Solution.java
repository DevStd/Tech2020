package flip.ex05;

public class Solution {
    public int[][] solution(int[][] s){
    		int[][] slide = flipSlide(s);
		int[][] lr = flipLR(slide);
		return lr;
    }
    
    // ex01
    public int[][] flipTB(int[][] s){
		int n = s.length;
		int[][] res = new int[n][n];
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				res[i][j] = s[n-1-i][j];
			}
		}
	    return res;
	}
    
    // ex02
    public int[][] flipLR(int[][] s){
		int n = s.length;
		int[][] res = new int[n][n];
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				res[i][j] = s[i][n-1-j];
			}
		}
	    return res;
	}
    
    // ex03
    public int[][] flipSlide(int[][] s){
		int n = s.length;
		int[][] res = new int[n][n];
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				res[i][j] = s[j][i];
			}
		}
	    return res;
	}
}
