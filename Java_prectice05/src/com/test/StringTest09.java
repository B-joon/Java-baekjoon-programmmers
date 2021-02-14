package com.test;

import java.io.IOException;
import java.util.Scanner;

public class StringTest09 {
	
	

	public static void main(String[] args) throws IOException {
		
		String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next().trim();
		
		for(int i = 0; i < arr.length; i++) {
			
			if (s.contains(arr[i])) {
				s = s.replaceAll(arr[i], ".");
				System.out.println(s);
			}
			
		}
		
		System.out.println(s.length());
		sc.close();
	}
}
