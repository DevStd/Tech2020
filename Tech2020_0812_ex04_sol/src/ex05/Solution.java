package ex05;

import java.util.HashSet;

public class Solution {
	
	// --[ 3 for loops ]----------------------------------------------------
    public int solution(int[] cards) {
        
        HashSet<String> s = new HashSet<String>();
        for(int i = 0 ; i < cards.length ; i++) {
            // 첫번째 숫자가 0일경우 두자리 이하의 수이므로 pass
        	if(cards[i] == 0) continue;
        	
            String str_i = ""+cards[i];            
            for(int j = 0 ; j < cards.length ; j++) {
            	// 두번째 숫자에 똑같은 수는 두번 사용 할 수 없으므로 pass
            	if(str_i.contains(cards[j]+"")) continue;
            	
                String str_j = str_i + cards[j];                
                for(int k = 0 ; k < cards.length ; k++) {                	
                	// 세번째 숫자도 똑같은 수는 두번 사용 할 수 없으므로 pass
                	if(str_j.contains(cards[k]+"")) continue;
                    
                    int num = Integer.parseInt(str_j + cards[k]);
                    if(num%19 == 0) s.add(str_j + cards[k]);
                }
            }
        }
        
        return s.size();
        
    }
    
    // --[ recursive ways ]----------------------------------------------------
    public int solution2(int[] cards) {        
        HashSet<String> s = new HashSet<String>();
        
        findNumber(cards, s, "", 3);
        
        return s.size();
    }
    
    private void findNumber(int[] cards, HashSet<String> set, String num, int count) {
    	for(int i : cards) {
    		// 첫번째 숫자가 0일경우 두자리 이하의 수이므로 pass
    		if(i == 0 && num.length() == 0) continue;
    		
    		//똑같은 수는 두번 사용 할 수 없으므로 pass
    		if(num.contains(""+i)) continue;
    		
    		String nextNum = num + i;
    		if(count > 1) {
    			findNumber(cards, set, nextNum, count-1);
    		} else {
    			int n = Integer.parseInt(nextNum);
    			if(n%19 == 0) set.add(nextNum);
    		}
    	}
    }
}