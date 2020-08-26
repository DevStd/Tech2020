package ex01;

public class Main {

	public static void main(String[] args) {
		String[] cards = new String[] {"A", "B", "C", "E", "E", "H", "N","O", "R", "S", "S", "T", "W"};
		String[] words = new String[] {"Tech", "What", "Apple", "Success", "Roan", "Taste"};
		
		Solution s = new Solution();
		String[] result = s.solution(cards, words);
		
		for(int i = 0 ; result != null && i < result.length ; i++) {
			System.out.println(result[i]);
		}
		
		// [output]
		// Tech What Roan
	}

}
