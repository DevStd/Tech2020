package sprial;

public class Solution {
    public int[][] solution(int n){
    		// output array
    		int[][] arr = new int[n][n];
    		
    		// head pointer and counter
    		int row = 0, col = 0, counter = 1;
    		
    		// write output array
    		for(int steps = n-1 ; steps >= 0 ; steps-= 2) {
    			// one center point with no circulation
    			if(steps == 0) {
    				arr[row][col] = counter;
    				break;
    			}
    			
    			// move >>>
    			for(int i = 0 ; i < steps ; i++) {
    				arr[row][col] = counter;
    				counter++;
    				col++; 
    			}
    			
    			// move vvv
    			for(int i = 0 ; i < steps ; i++) {
    				arr[row][col] = counter;
    				counter++;
    				row++; 
    			}
    			
    			// move <<<
    			for(int i = 0 ; i < steps ; i++) {
    				arr[row][col] = counter;
    				counter++;
    				col--; 
    			}
    			
    			// move ^^^
    			for(int i = 0 ; i < steps ; i++) {
    				arr[row][col] = counter;
    				counter++;
    				row--; 
    			}
    			
    			// setup next inner circulation
    			row++;
    			col++;
    		}
    	
        return arr;
    }
}
