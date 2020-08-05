package ex2_caesar;

public class Solution {
	public String solution(String s, int n) {
		StringBuffer enc = new StringBuffer();
		
		for(int i = 0 ; i < s.length() ; i++) {
			// move by n
			char c = (char)(s.charAt(i) + n);
			// if cycle 'z' to 'a'
			if(c > 'z') c -= 26;
			// add to output string
			enc.append(c);
		}
		
        return enc.toString();
    }
}
