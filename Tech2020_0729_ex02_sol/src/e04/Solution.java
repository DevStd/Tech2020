package e04;

//E4. 수박수박수박수박수박수?
//https://programmers.co.kr/learn/courses/30/lessons/12922

class Solution {
	public String solution(int n) {
		StringBuilder answer = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (i%2==0) answer.append("수");
			else answer.append("박");
		}
		return answer.toString();
	}
}
