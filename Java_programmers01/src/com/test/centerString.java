package com.test;

public class centerString {

	public static void main(String[] args) {
		
		centerString sol = new centerString();
		String s1 = sol.solution("abcde");
		String s2 = sol.solution("qwer");
		System.out.println(s1 + "\n" + s2);
	}
    public String solution(String s) {
        String answer = "";
        
        if (s.length() % 2 == 0) {
			answer = s.charAt(s.length()/2 - 1) + "" + s.charAt(s.length()/2);
		} else {
			answer = s.charAt(s.length()/2) + "";
		}
        
        return answer;
    }
}
