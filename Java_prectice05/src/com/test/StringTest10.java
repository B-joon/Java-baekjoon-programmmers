package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringTest10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		int seccess = 0;
		
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			
			for (int j = 0; j < s.length(); j++) {
				for (int k = 2; k < s.length(); k++) {
					if (s.charAt(j) != s.charAt(k - 1)) {
						if (s.charAt(j) == s.charAt(k) && j < k - 1) {
							count = 0;
							System.out.println(count);
							break;
						} else {
							count++;
							System.out.println(count);
						}
					}
				}
			}
			if (count > 0) {
				seccess++;
			}
		}
		System.out.println(seccess);
	}
}
