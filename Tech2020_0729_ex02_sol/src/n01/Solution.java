package n01;

//N1. 전화번호 목록
//https://programmers.co.kr/learn/courses/30/lessons/42577

class Solution {
    public boolean solution(String[] phone_book) {
        for(int i = 0 ; i < phone_book.length - 1 ; i++){
            String n1 = phone_book[i];
            for(int j = i+1 ; j < phone_book.length ; j++){
                String n2 = phone_book[j];
                if(n1.length() > n2.length()){                    
                    if(n1.startsWith(n2)) return false;                    
                } else {
                    if(n2.startsWith(n1)) return false;
                }
            }
        }
        return true;
    }
}