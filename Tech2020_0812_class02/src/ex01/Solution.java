package ex01;

import java.util.*;

public class Solution {
	public int[] solution(int[] n) {
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0 ; i < n.length ; i++) arr.add(n[i]);
		
		Collections.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer n1, Integer n2) {
				int mod1 = n1 % 2;
				int mod2 = n2 % 2;
				
				if(mod1 == mod2) return n1 - n2;
				else return mod2 - mod1;
			}
		});

		for(int i = 0 ; i < n.length ; i++) n[i] = arr.get(i);
        return n;
    }
}
