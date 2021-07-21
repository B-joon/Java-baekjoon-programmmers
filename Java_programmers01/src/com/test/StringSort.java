package com.test;

import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {
		
		String s = "Zbcdefg";
		StringSort ss = new StringSort();
		System.out.println(ss.solution(s));
		
	}
	public String solution(String s) {
		String answer = "";
		
		char[] c = new char[s.length()];
		
		for (int i = 0; i < c.length; i++) {
			c[i] = s.charAt(i);
		}
		int[] res = new int[c.length];
		for (int i = 0; i < c.length; i++) {
			res[i] = (int)c[i];
		}
		Arrays.sort(res);
		int index = 0;
		for (int i = res.length - 1; i >= 0; i--) {
			c[index] = (char)res[i];
			answer += c[index];
			index++;
		}
		return answer;
	}
	
}
