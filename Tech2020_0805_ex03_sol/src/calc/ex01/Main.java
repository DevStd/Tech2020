package calc.ex01;

public class Main {

    public static void main(String[] args) {
        
        int[][] input = new int[][] {
            { 1, 2, 3, 4, 5},
            { 6, 7, 8, 9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
        };
        
        // append row-sum and column-sum
        //  1, 2, 3, 4, 5,15
        //  6, 7, 8, 9,10,40
        // 11,12,13,14,15,65
        // 16,17,18,19,20,90
        // 21,22,23,24,25,115
        // 55,60,65,70,75,325
        
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
