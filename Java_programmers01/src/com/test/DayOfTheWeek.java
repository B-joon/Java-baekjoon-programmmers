package com.test;


public class DayOfTheWeek {

	public static void main(String[] args) {
		
		DayOfTheWeek dotw = new DayOfTheWeek();
		
		System.out.println(dotw.solution(5, 24));
		
	}
	
	public String solution(int a, int b) {
		String answer = "";
		for (int i = 1; i < a; i++) {
			b += getDate(i);
		}
		switch (b % 7) {
		case 3:
			answer = "SUN";
			break;
		case 4:
			answer = "MON";
			break;
		case 5:
			answer = "TUE";
			break;
		case 6:
			answer = "WED";
			break;
		case 0:
			answer = "THU";
			break;
		case 1:
			answer = "FRI";
			break;
		case 2:
			answer = "SAT";
			break;
		}
		
		return answer;
	}
	
	public static int getDate(int a) {
		
		int res = 0;
		
		if (a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12) {
				res = 31;
		} else if (a == 4 || a == 6 || a == 9 || a == 11) {
				res = 30;
		} else if (a == 2) {
				res = 29;
		}
		
		return res;
	}
	
}
