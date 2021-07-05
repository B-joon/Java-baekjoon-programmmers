package com.test;

import java.util.Arrays;

public class KNumber {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {
				{2,5,3},
				{4,4,1},
				{1,7,3}
		};
		KNumber kn = new KNumber();
		kn.solution(array, commands);
		System.out.println(Arrays.toString(kn.solution(array, commands)));
		
	}
	
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		
		for (int i = 0; i < commands.length; i++) {
			int index = (commands[i][1] - commands[i][0]) + 1;
			int[] a = new int[index];
			int count = 0;
			for (int j = commands[i][0]-1; j <= commands[i][1]-1; j++) {
				a[count] += array[j];
				count++;
			}
			Arrays.sort(a);
			answer[i] += a[commands[i][2]-1];
		}
		return answer;
	}
}
