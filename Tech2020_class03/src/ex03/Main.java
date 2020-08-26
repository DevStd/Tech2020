package ex03;

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		
		int INP1 = 2039638037; // 0b1111001100100100110100000010101
		int INP2 = 0b0111111001100100100110100000010; // 1060261122
		
		System.out.println(s.solution(INP1));
		System.out.println(s.solution(INP2));
	}
}
