package ex1_palindrom;

public class Solution {
	public boolean solution(String input) {
		int len = input.length();
		for(int i = 0 ; i < len/2 ; i++) {
			char left = input.charAt(i);
			char right = input.charAt(len - i - 1);
			if( left != right ) return false;
		}
        return true;
    }
}
