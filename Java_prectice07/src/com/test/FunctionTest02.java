package com.test;

public class FunctionTest02 {
	
	public static void main(String[] args) {
		
		boolean[] arr = new boolean[10001];
		
		for (int i = 1; i < 10001; i++) {
			int index = sumLoop(i);

			if (index < 10001) {
				arr[index] = true;
			}
		}
		
		for (int i = 1; i < 10001; i++) {
			if (!arr[i]) {
				System.out.println(i);
			}
		}
	}
	
	public static int sumLoop(int n) {
		
		int sum = n;
		
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		
		return sum;
	}

}
