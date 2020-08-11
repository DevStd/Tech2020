package calc.ex02;

public class Main {

    public static void main(String[] args) {
        
        int[][] input = new int[][] {
            { 3, 2, 0, 7, 5},
            { 6, 1, 8, 1,17},
            {21,12,16,19,15},
            { 2, 3,18, 9,10},
            {13, 8,23,24,25}
        };
        
        // max-pooling by 2x2 kernel
        //  6,  8,  8, 17        
        // 21, 16, 19, 19
        // 21, 16, 19, 19
        // 13, 23, 24, 25
        
        try {
            Solution sol = new Solution();
            
            int[][] output = sol.solution(input);
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
