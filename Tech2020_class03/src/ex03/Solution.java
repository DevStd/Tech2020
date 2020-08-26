package ex03;

public class Solution {

	public int solution(int n) {
		
		int oper = (n >> 30) & 0b11;
		int a = (n >> 20) & 0b1111111111; // 1023 == 0x3ff == 0b1111111111
		int b = (n >> 10) & 1023;
		int c = (n) & 0x3ff;
		
		if(oper == 0) return (a+b)*c;
		else return a-b+c;
	}
}
