package com.test;

public class MaxAndMin {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 5;
		System.out.println(gcd(a, b) + " : " + lcm(a, b));
	}
	
	public static int gcd(int a, int b) {
		
		while (b > 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;	
	}
	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}
}
