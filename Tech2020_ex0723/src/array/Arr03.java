package array;

public class Arr03 {
	
	public static int[][] makeArray(int n) {
		return null;
	}
	
	public static void main(String[] args) {
		// make squared array like below
		// 1  2  3  4  5
		// 10 9  8  7  6
		// 11 12 13 14 15
		// 20 19 18 17 16
		// 21 22 23 24 25
		
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
