package ex02;

public class Solution {
	public int solution(int n) {
		// 짝수나라의 숫
		int[] EVEN_NUM = new int[] {0,2,4,6,8};
		
		// 짝수는 5개이므로 10진수를 5진수로 변환해서 짝수나라의 숫자에 매칭시킴
		String num = "";
		for(int i = n ; i > 0 ; i = i / 5) {
			int r = i % 5;
			num = EVEN_NUM[r] + num;
		}
		
		// 0 이 들어왓을때 예외처
		if("".equals(num)) num = "0";
		
        return Integer.parseInt(num);
    }
}
