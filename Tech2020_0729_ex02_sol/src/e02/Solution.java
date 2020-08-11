package e02;

//E2. 문자열 내 p와 y의 개수
//https://programmers.co.kr/learn/courses/30/lessons/12916
	
class Solution {
	boolean solution(String s) {
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'P' || c == 'p')
				cnt++;
			else if (c == 'Y' || c == 'y')
				cnt--;
		}
		return cnt == 0;
	}
}