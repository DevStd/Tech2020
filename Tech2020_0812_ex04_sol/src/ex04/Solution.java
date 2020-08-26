package ex04;

import java.util.*;

public class Solution {
	public String solution(String word) {
		
		HashMap<String, Integer> map = new HashMap<>();
		String[] letters = word.toUpperCase().split("");
		
		for(String w : letters) {
			// 공백 무시
			if(w.equals(" ")) continue;
			
			// 알파벳 모음 인 경우 세지 않음
			if("AEIOU".contains(w)) continue;
			
			// 자음 갯수 세기
			if(map.containsKey(w)) map.put(w, map.get(w)+1);
			else map.put(w, 1);
		}
		
		Set<String> keys = map.keySet();
		ArrayList<String> cons = new ArrayList<String>(keys);
		
		// 자음 정렬 (갯수 순서, Z -> A)
		cons.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int n1 = map.get(o1);
				int n2 = map.get(o2);
				
				if(n1 != n2) return n2 - n1; // 많이 나온거 먼저 
				else return o2.compareTo(o1); // 알파벳 역순(Z->A)으로
			}
		});
		
        return cons.get(0);
    }
}
