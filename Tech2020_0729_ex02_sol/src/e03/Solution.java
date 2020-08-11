package e03;

//E3. 문자열 다루기 기본
//https://programmers.co.kr/learn/courses/30/lessons/12918
	
class Solution {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6 ) {
            for(int i = 0 ; i < s.length() ; i++){
                char c = s.charAt(i);
                if(c < '0' || c > '9') return false;
            }
            return true;
        } else {
            return false;
        }
    }
}
