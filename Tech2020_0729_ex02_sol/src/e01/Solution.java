package e01;

//1. 가운데 글자 가져오기
//https://programmers.co.kr/learn/courses/30/lessons/12903?language=java

class Solution {
	public String solution(String s) {
		String answer;
		if (s.length() % 2 == 0) {
			answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
		} else {
			answer = s.substring(s.length() / 2, s.length() / 2 + 1);
		}
		return answer;
	}
}
