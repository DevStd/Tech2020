package n02;

//N2이상한 문자 만들기
//https://programmers.co.kr/learn/courses/30/lessons/12930

class Solution {
    public String solution(String s) {
        // make captial words
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < words.length ; i++){
            if(i > 0) sb.append(" ");
            String[] chars = words[i].split("");            
            for(int j = 0 ; j < chars.length ; j++){
                if(j%2 == 0) sb.append(chars[j].toUpperCase());
                else sb.append(chars[j].toLowerCase());
            }
        }
        
        // append tail blanks
        while(sb.length() < s.length()) sb.append(" ");
        
        return sb.toString();
    }
}
