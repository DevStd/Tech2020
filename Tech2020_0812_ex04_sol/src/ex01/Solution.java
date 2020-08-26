package ex01;

import java.util.*;

public class Solution {
	
	//---[using HashMap]--------------------------------------------------------
	public String[] solution(String[] cards, String[] words) {
		
		ArrayList<String> resultList = new ArrayList<>();		
		HashMap<String, Integer> cardMap = makeLetterMap(cards);
		
		for(String w : words) {
			String[] letters = w.toUpperCase().split("");
			HashMap<String, Integer> wordLetters = makeLetterMap(letters);
			
			boolean isComposable = true;
			for(String k : wordLetters.keySet()) {
				if(!cardMap.containsKey(k) || cardMap.get(k) < wordLetters.get(k)) {
					isComposable = false;
					break;
				}
			}
			
			if(isComposable) resultList.add(w);
		}
		
		String[] result = new String[resultList.size()];
		resultList.toArray(result);
		
        return result;
    }
	
	private HashMap<String, Integer> makeLetterMap(String[] letters){
		HashMap<String, Integer> map = new HashMap<>();
		for(String c : letters) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			} else {
				map.put(c, 1);
			}
		}
		return map;
	}
	
	//---[using Array]--------------------------------------------------------
	
	public String[] solution2(String[] cards, String[] words) {
		
		ArrayList<String> resultList = new ArrayList<>();
		
		for(String w : words) {
			boolean[] cardUsaes = new boolean[cards.length];
			String[] letters = w.toUpperCase().split("");
			
			boolean isComposable = true;
			for(String l : letters) {
				
				boolean isMatch = false;
				for(int i = 0 ; i < cards.length ; i++) {
					if(cards[i].equals(l) && cardUsaes[i] == false) {
						cardUsaes[i] = true;
						isMatch = true;
						break;
					}
				}
				if(!isMatch) {
					isComposable = false;
					break;
				}
			}
			
			if(isComposable) resultList.add(w);
		}
		
		String[] result = new String[resultList.size()];
		resultList.toArray(result);
		
        return result;
    }
}
