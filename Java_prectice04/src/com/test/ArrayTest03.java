package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest03 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int mul = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		int[] arr = new int[10];
		
		while (mul != 0) {
			arr[mul%10]++;
			mul /= 10;
		}
		for (int result : arr) {
			System.out.println(result);
		}
	}
}
