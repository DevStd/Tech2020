package sprial;

public class Main {

    public static void main(String[] args) {
    	
    	// generate array with spiral increase
    	
    	// n == 4
    	//  1,  2,  3, 4
    	// 12, 13, 14, 5
    	// 11, 16, 15, 6
    	// 10,  9,  8, 7
    	
    	// n == 5
    	//  1,  2,  3,  4, 5
    	// 16, 17, 18, 19, 6
    	// 15, 24, 25, 20, 7
    	// 14, 23, 22, 21, 8
    	// 13, 12, 11, 10, 9
        
        int n = 4;
        
        try {
            Solution sol = new Solution();
            
            int[][] output = sol.solution(n);
            for(int i = 0 ; i < output.length ; i++) {
                for(int j = 0 ; j < output[i].length ; j++) {
                    System.out.print(output[i][j]+"\t");
                }
                System.out.println("");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
