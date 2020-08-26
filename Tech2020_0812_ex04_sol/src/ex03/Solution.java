package ex03;

import java.util.*;

public class Solution {
	public String solution(String word) {
		String VOWEL = "aeiou";		
		List<String> letters = Arrays.asList( word.split("") );
		
		letters.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				boolean isVowel1 = VOWEL.contains(o1);
				boolean isVowel2 = VOWEL.contains(o2);
				
				if(isVowel1 == isVowel2) {
					// 둘다 자음 또는 둘다 모음 인 경우 : 알파벳 순으로 
					return o1.compareTo(o2);
				} else {
					// 하나만 모음 인 경우 : 모음이 자음보다 먼저 오도록 
					if(isVowel1) return -1;
					else return 1;
				}
			}
		});
				
        return String.join("", letters);
    }
}
