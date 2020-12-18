package com.test;

import java.util.Scanner;

public class IfTest01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		if ((-10000 <= A && A <= 10000) && (B >= -10000 && B <= 10000)) {

			if (A < B) {
				System.out.println("<");
			} else if (A > B) {
				System.out.println(">");
			} else {
				System.out.println("==");
			}
		}
		
		sc.close();
	}

}
