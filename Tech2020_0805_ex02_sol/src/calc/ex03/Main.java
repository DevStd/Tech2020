package calc.ex03;

public class Main {

    public static void main(String[] args) {
        
        int[][] input = new int[][] {
            { 1, 2, 3, 4, 5},
            { 6, 7, 8, 9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
        };
        int[][] kernel = new int[][] {
        	{2, 0},
        	{0, 1}
        };
        
        // calculate convolution with 2x2 kernel
        //  9, 12, 15, 18
        // 24, 27, 30, 33
        // 39, 42, 45, 48
        // 54, 57, 60, 63
        
        try {
            Solution sol = new Solution();
            
            int[][] output = sol.solution(input, kernel);
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
