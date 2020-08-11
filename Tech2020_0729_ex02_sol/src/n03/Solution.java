package n03;

//N3. 시저 암호
//https://programmers.co.kr/learn/courses/30/lessons/12926

class Solution {
    public String solution(String s, int n) {
        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            char moved = (char)(c + n);
            
            if(c == ' ') moved = ' ';
            else if(c >= 'a' && c <= 'z' && moved > 'z') moved  = (char)(moved - 26);
            else if(c >= 'A' && c <= 'Z' && moved > 'Z') moved  = (char)(moved - 26);
            
            str.append(moved);
        }
        return str.toString();
    }
}
