package ex02;

public class Main {

	public static void main(String[] args) {
		
		String[] text = new String[] {
			"The term Microservice Architecture has sprung up over the last few years to describe"
			, "a particular way of designing software applications as suites of independently deployable services"
			, "While there is no precise definition of this architectural style , there are certain"
			, "common characteristics around organization around business capability , automated deployment ,"
			, "intelligence in the endpoints , and decentralized control of languages and data"
		};
		
		Solution s = new Solution();
		String result = s.solution(text);
		
		System.out.println(result);
	}

}
