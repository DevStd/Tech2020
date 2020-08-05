package ex1_palindrom;

public class Main {

	public static void main(String[] args) {
		String[] inputs = new String[] {
			"abcabc"
			, "aaabbb"
			, "aabbaa"
			, "aabaa"
			, "aababaa"
		};
		
		Solution s = new Solution();
		for(String input : inputs) {
			System.out.println(s.solution(input));
		}
	}

}
