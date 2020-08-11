package e05;

//E5. JadenCase 문자열 만들기
//https://programmers.co.kr/learn/courses/30/lessons/12951
	
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        // make captial words
        String[] words = s.split(" ");
        for(int i = 0 ; i < words.length ; i++){
            if(i > 0) sb.append(" ");
            sb.append(capitalWord(words[i]));
        }
        
        // append tail blanks
        while(sb.length() < s.length()) sb.append(" ");        
        
        return sb.toString();
    }
    
    public String capitalWord(String w){
        if(w.length() == 0) return "";
        else if(w.length() == 1) return w.substring(0,1).toUpperCase();
        else return w.substring(0,1).toUpperCase() + w.substring(1).toLowerCase();
    }
}
