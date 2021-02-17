package com.test;

public class betweenIntSum {

	public static void main(String[] args) {
		betweenIntSum bw = new betweenIntSum();
		
		System.out.println(bw.solution(3, 5));
	}
    public long solution(int a, int b) {
        long answer = 0;
        
        if (b > a) {
			for (int i = a; i <= b; i++) {
				answer += i;
			}
		} else if (a > b) {
			for (int i = b; i <= a; i++) {
				answer += i;
			}
		} else if (a == b) {
			answer = a;
		}
        
        return answer;
    }
}
