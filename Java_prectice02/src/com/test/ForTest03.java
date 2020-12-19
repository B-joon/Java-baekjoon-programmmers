package com.test;

import java.util.Scanner;

/*
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성 하시오
 * 
 * 1. 첫째 줄에 n(1 <= n <= 10000)이 주어진다.
 */

public class ForTest03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		
		for (int i = n; i >= 1 && i <= 10000;) {
			for (int j = 1; j <= n; j++) {
				sum += j;
			}
			break;
		}
		System.out.println(sum);
		sc.close();
	}
	
}
