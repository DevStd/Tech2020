package ex01;

public class Main {

	public static void main(String[] args) {
		
		int[] numbers = new int[] {1, 2, 12, 7, 13, 8, 4, 6, 2, 5};
		// 1, 5, 7, 13, 2, 2, 4, 6, 8, 12
		
		Solution s = new Solution();
		
		int[] result = s.solution(numbers);
		for(int i = 0 ; i < result.length ; i++) {
			System.out.print((i==0?"":", ")+result[i]);
		}
	}

}
