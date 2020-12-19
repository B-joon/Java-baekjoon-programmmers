package com.test;

import java.util.Scanner;

/*
 *  n을 입력받은 뒤, 구구단 n단을 출력하는 프로그램을 작성하시오.
 *  
 *  1. 첫째 줄에 n이 주어진다.
 *  2. n은 1보다 크거나 같고, 9보다 작거나 같다.
 *  
 *  출력
 *  2 * 1 = 2
 *  2 * 2 = 4
 *  2 * 3 = 6
 *  2 * 4 = 8
 *  2 * 5 = 10
 *  2 * 6 = 12
 *  2 * 7 = 14
 *  2 * 8 = 16
 *  2 * 9 = 18
 *  
 */


public class ForTest01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int mul = 0;
		
		// 원하는 값만 출력 하기 때문에 증가연산자는 필요 없다.
		for (int i = n; i <= 9 && i >= 1;) {
			for (int j = 1; j < 10; j++) {
				mul = n * j;
				System.out.println(n + " * " + j + " = " + mul);
			}
			break;
		}
		sc.close();
	}

}
