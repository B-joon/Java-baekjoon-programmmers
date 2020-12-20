package com.test;

import java.util.Scanner;

public class WhileTest01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = a + b;
			if ((a > 0 && a < 10) && (b > 0 && b < 10)) {
				System.out.println(sum);
			} else {
				break;
			}
		}
		sc.close();
	}
}
