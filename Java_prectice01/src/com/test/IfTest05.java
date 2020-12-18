package com.test;

import java.util.Scanner;

public class IfTest05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		int subM = M - 45;
		
		if ((H >= 0 && H <= 23) && (M >= 0 && M <= 59)) {
			if (subM < 0) {
				subM += 60;
				H -= 1;
				if (H < 0) {
					H = 23;
				}
			}
		}
		System.out.println(H + " " + subM);
		
		sc.close();
	}
	
}
