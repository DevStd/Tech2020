package e06;

//E06. 자릿수 더하기
//https://programmers.co.kr/learn/courses/30/lessons/12931
	
public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String[] nums = (""+n).split("");
        for(int i = 0 ; i < nums.length ; i++){
            answer += Integer.parseInt(nums[i]);
        }

        return answer;
    }
}