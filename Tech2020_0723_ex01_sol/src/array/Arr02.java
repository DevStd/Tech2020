package array;

public class Arr02 {
	
	public static int[][] makeArray(int n) {
		int[][] arr = new int[n][n];
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				arr[i][j] = i + (j * n) + 1;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// make squared array like below
		// 1  6  11 16 21
		// 2  7  12 17 22
		// 3  8  13 18 23
		// 4  9  14 19 24
		// 5  10 15 20 25
		
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
