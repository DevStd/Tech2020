package ex01;

public class Main {

	public static void main(String[] args) {
		String[] DEPT = {
			"1#화성정밀#0",
			"10#사장실#1",
			"20#국내사업담당#1",
			"30#해외사업담당#1",
			"40#신소재연구소#1",
			"501#중부영업팀#20",
			"502#남부영업팀#20"
		};
		
		String[] EMP = {
			"00001#박정석#사장#10",
			"40002#서지훈#책임연구원#40",
			"40009#강민#사원#501"
		};
		
		Solution s = new Solution();
		System.out.println(s.solution(DEPT, EMP, "00001"));
		System.out.println(s.solution(DEPT, EMP, "40009"));
	}

}
