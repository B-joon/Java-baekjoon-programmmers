package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringTest07 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String score = br.readLine();
		
		String r = "";
		for (int i = score.length() - 1; i >= 0; i--) {
			r += score.charAt(i);
		}
		
		StringTokenizer st = new StringTokenizer(r, " ");
		
		int A = 0;
		int B = 0;
		
		while (st.hasMoreTokens()) {
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
		}
		
		if (A > B) {
			System.out.println(Integer.toString(A));
		} else {
			System.out.println(Integer.toString(B));
		}
	}
}
