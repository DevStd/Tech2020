package array;

public class Arr04 {
	
	public static int[][] makeArray(int n) {
		int[][] arr = new int[n][n];
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				arr[i][j] = Math.abs(i - j) + 1;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// make squared array like below
		// 1  2  3  4  5
		// 2  1  2  3  4
		// 3  2  1  2  3
		// 4  3  2  1  2
		// 5  4  3  2  1
		
		int n = 5;
		int[][] arr = makeArray(n);
		
		try {
			for(int i = 0 ; i < n ; i++) {
				for(int j = 0 ; j < n ; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println(System.lineSeparator());
			}	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
