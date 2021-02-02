package com.test;

import java.util.Scanner;

public class inOutAndOperatorTest08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextInt();
		double b = sc.nextInt();
		
		double div = a / b;
		
		System.out.println(div);
		
		sc.close();
	}
}
