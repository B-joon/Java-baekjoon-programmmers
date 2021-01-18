package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FunctionTest03 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int X = Integer.parseInt(br.readLine());

		if (X < 100) {
			System.out.println(cnt1(X));
		} else {
			System.out.println(cnt2(X));
		}
	}

	public static int cnt1(int X) {

		int cnt = 0;

		for (int i = 1; i <= X; i++) {
			cnt++;
		}

		return cnt;
	}

	public static int cnt2(int X) {

		int cnt = 99;

		for (int i = 100; i <= X; i++) {
			int a = i / 100;
			int b = (i / 10) % 10;
			int c = i % 10;

			if ((a - b) == (b - c)) {
				cnt++;
			}
		}
		return cnt;
	}
}
