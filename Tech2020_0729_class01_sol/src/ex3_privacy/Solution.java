package ex3_privacy;

public class Solution {
	public String solution(String s) {
		StringBuffer enc = new StringBuffer();
		
		String[] input = s.split("");
		for(int i = 0 ; i < input.length ; i++) {
			if(i >= 3 && i < (input.length-4)) enc.append("*");
			else enc.append(input[i]);
		}
		
        return enc.toString();
    }
}