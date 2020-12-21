package com.test;

import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()
				, sc.nextInt(), sc.nextInt(), sc.nextInt()
				, sc.nextInt(), sc.nextInt(), sc.nextInt()};
		
		int maxScore = 0;
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (maxScore < arr[i]) {
				maxScore = arr[i];
				count = i + 1;
			}
			
		}
		System.out.printf("%d\n%s", maxScore, count);
		sc.close();
	}
}
