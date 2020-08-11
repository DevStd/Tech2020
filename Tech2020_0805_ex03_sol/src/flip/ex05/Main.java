package flip.ex05;

public class Main {

    public static void main(String[] args) {
        
        int[][] input = new int[][] {
            { 1, 2, 3, 4, 5},
            { 6, 7, 8, 9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
        };
        
        // rotate clockwise
        // 21, 16, 11,  6,  1
        // 22, 17, 12,  7,  2
        // 23, 18, 13,  8,  3
        // 24, 19, 14,  9,  4
        // 25, 20, 15, 10,  5
        
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
