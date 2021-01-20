package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringTest05 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine().toUpperCase();
		
		int[] arr = new int[26];
		int max = 0;
		char result = 0;
		
		for (int i = 0; i < S.length(); i++) {
			arr[S.charAt(i) - 65]++;
			if (max < arr[S.charAt(i) - 65]) {
				max = arr[S.charAt(i) - 65];
				result = S.charAt(i);
				System.out.println(S.charAt(i) - 65);
				System.out.println(arr[i]);
				System.out.println(max);
			} else if (max == arr[S.charAt(i) - 65]) {
				result = '?';
			}
		}
		System.out.println(result);
		
	}
}
