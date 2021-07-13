package com.test;

public class WorkoutClothes {

	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2, 4};
		int[] reserve = {3};
		
		WorkoutClothes wc = new WorkoutClothes();
		wc.solution(n, lost, reserve);
		System.out.println(wc.solution(n, lost, reserve));
	}
	
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n;
		int[] student = new int[n];
		
		for (int l : lost) {
			student[l-1]--;
		}
		for (int r : reserve) {
			student[r-1]++;
		}
		
		for (int i = 0; i < student.length; i++) {
			if (student[i] == -1) {
				if (i - 1 >= 0 && student[i - 1] == 1) {
					student[i]++;
					student[i - 1]--;
				} else if (i + 1 < student.length && student[i + 1] == 1) {
					student[i]++;
					student[i + 1]--;
				} else {
					answer--;
				}
			}
		}
		
		return answer;
	}
	
}
