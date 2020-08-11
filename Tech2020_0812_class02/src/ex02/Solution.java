package ex02;

import java.util.*;

public class Solution {
	public String solution(String[] text) {
		HashMap<String, Integer> dict = new HashMap<String, Integer>();
		
		for(int i = 0 ; i < text.length ; i++) {
			String[] chars = text[i].split("");
			for(int j = 0 ; j < chars.length ; j++) {
				String c = chars[j].toUpperCase();
				if(" ".equals(c) || ",".equals(c) || ".".equals(c)) continue;
				
				if(!dict.containsKey(c)) {
					dict.put(c, 1);
				} else {
					dict.put(c, dict.get(c)+1);
				}
			}
		}
		
		String maxC = "";
		int maxCnt = 0;
		for(String c : dict.keySet()) {
			if(dict.get(c) > maxCnt) {
				maxCnt = dict.get(c);
				maxC = c;
			}
		}
		
        return maxC+maxCnt;
    }
}
