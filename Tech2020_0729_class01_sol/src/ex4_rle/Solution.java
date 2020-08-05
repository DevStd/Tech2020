package ex4_rle;

public class Solution {
	public String solution(String s) {
		StringBuffer enc = new StringBuffer();		
		String[] input = s.split("");
		
		// set initial char
		int repeats = 1;
		String last = input[0];
		enc.append(last);
		
		// process to encode
		for(int i = 1 ; i < input.length ; i++) {
			String current = input[i];
			if(last.equals(current)) {
				// continue with last char
				repeats++;				
			} else {
				// add number of last char repeated
				if(repeats > 1) enc.append(repeats);
				// new char appeared
				enc.append(current);
				repeats = 1;
				last = current;
			}
		}
		
		// add repeats of tail
		if(repeats > 1) enc.append(repeats);
		
        return enc.toString();
    }
}
